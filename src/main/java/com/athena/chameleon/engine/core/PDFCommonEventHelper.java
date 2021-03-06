/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Revision History
 * Author			Date				Description
 * ---------------	----------------	------------
 * Hyo-jeong Lee	2012. 9. 17.		First Draft.
 */
package com.athena.chameleon.engine.core;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.athena.chameleon.common.utils.MessageUtil;
import com.athena.chameleon.engine.utils.PDFWriterUtil;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfAction;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * PDF 관련 Event Helper
 * 
 * @author Hyo-jeong Lee
 * @version 1.0
 */
public class PDFCommonEventHelper extends PdfPageEventHelper {

    private static BaseFont bfKorean;
    private boolean titleFlag = false;
    private boolean	pagingFlag = true;
    
	public List<Paragraph> titles = new ArrayList<Paragraph>();

    static {
        try {
            bfKorean = PDFWriterUtil.bfKorean;
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * header 및 footer 구현 
     */
    public void onEndPage(PdfWriter writer, Document document) { 

        if(titleFlag)
            return;
        
    	Font font = new Font(bfKorean, 9);
    	PdfPTable hTable = new PdfPTable(1);
        PdfPTable ftable = new PdfPTable(3); 
        try { 
        	
        	hTable.setWidths(new int[]{100});
        	hTable.setTotalWidth(500); 
        	hTable.setLockedWidth(true); 
        	hTable.getDefaultCell().setFixedHeight(15); 
        	hTable.getDefaultCell().setBorder(Rectangle.BOTTOM); 
        	hTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        	hTable.addCell(new Phrase(MessageUtil.getMessage("pdf.message.header.title"), font)); 
        	hTable.writeSelectedRows(0, -1, 50, 803, writer.getDirectContent());
        	
        	ftable.setWidths(new int[]{100, 100, 100}); 
        	ftable.setTotalWidth(500); 
        	ftable.setLockedWidth(true); 
        	ftable.getDefaultCell().setBorder(Rectangle.TOP); 
        	ftable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT); 
        	ftable.addCell(new Phrase(MessageUtil.getMessage("pdf.message.footer.left"), font)); 
        	ftable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        	if(pagingFlag)
	        	ftable.addCell(new Phrase(MessageUtil.getMessage("pdf.message.footer.center", String.valueOf(writer.getPageNumber())), font));
        	else 
        		ftable.addCell("");
        	
        	ftable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT); 
        	ftable.addCell(new Phrase(String.valueOf(new SimpleDateFormat("yyyy/MM/dd").format(new Date())), font)); 
        	ftable.writeSelectedRows(0, -1, 50, 55, writer.getDirectContent());
        } 
        catch(Exception de) { 
        	throw new ExceptionConverter(de); 
        } 
    } 

    /**
     * chapter write 시 실행
     */
    public void onChapter(PdfWriter writer, Document document,
            float position, Paragraph title) {
        
        titles.add(getTocParagraph(title.getContent(), writer.getPageNumber(), 0, document.left(), document.right()));
        
    }

    /**
     * Section write 시 실행
     */
    public void onSection(PdfWriter writer, Document document,
            float position, int depth, Paragraph title) {
        title = getTocParagraph(title.getContent(), writer.getPageNumber(), depth, document.left(), document.right());
        title.setIndentationLeft(12 * depth);
        titles.add(title);
    }

    public void drawLine(PdfContentByte cb, float x1, float x2, float y) {
        cb.moveTo(x1, y);
        cb.lineTo(x2, y);
        cb.stroke();
    }

    /**
     * 
     * 목차용 Paragraph 생성.(Navigation 기능 및 출력 title 입력) 
     *
     * @param title 
     * @param pageNumber 
     * @param depth 
     * @param x1 document left 좌표
     * @param x2 document right 좌표
     * @return Paragraph
     */
    public Paragraph getTocParagraph(String title, int pageNumber, int depth, float x1, float x2) {
        
        Font tocFont = new Font(bfKorean, 10);
        if(depth == 0)
            tocFont.setStyle(Font.BOLD);
        
        Paragraph p = new Paragraph();
        p.setSpacingAfter(5);
            
        Chunk tit = new Chunk(title+" ", tocFont);
        tit.setAction(PdfAction.gotoLocalPage(title, false));
        
        Chunk point = new Chunk(".", tocFont);
        
        Chunk number = new Chunk(" "+pageNumber, tocFont);
        number.setAction(PdfAction.gotoLocalPage(title, false));
        
        p.add(tit);
        
        float width = x2-x1-tit.getWidthPoint()-number.getWidthPoint()-(depth*12);
        
        if((x2-x1) < tit.getWidthPoint())
        	width = x2-x1-(tit.getWidthPoint()-(x2-x1))-number.getWidthPoint()-(depth*12)-65;
        
        float i=point.getWidthPoint();
        while(i < width) {
            p.add(point);
            i += point.getWidthPoint();
        }
        
        p.add(number);
        
        
        return p;
    }

    /**
     * @param titleFlag the titleFlag to set
     */
    public void setTitleFlag(boolean titleFlag) {
        this.titleFlag = titleFlag;
    }

    /**
	 * @param pagingFlag the pagingFlag to set
	 */
	public void setPagingFlag(boolean pagingFlag) {
		this.pagingFlag = pagingFlag;
	}

}
//end of ChapterSectionTOC.java
