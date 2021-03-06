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
 * Sang-cheon Park	2012. 10. 3.		First Draft.
 */
package com.athena.chameleon.engine.core.analyzer.parser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.springframework.util.Assert;

import com.athena.chameleon.common.utils.ThreadLocalUtil;
import com.athena.chameleon.engine.constant.ChameleonConstants;
import com.athena.chameleon.engine.entity.pdf.AnalyzeDefinition;
import com.athena.chameleon.engine.entity.pdf.EjbRecommend;
import com.athena.chameleon.engine.entity.pdf.ExceptionInfo;
import com.athena.chameleon.engine.entity.pdf.PDFMetadataDefinition;
import com.athena.peacock.engine.common.StackTracer;

/**
 * <pre>
 *
 * </pre>
 * 
 * @author Sang-cheon Park
 * @version 1.0
 */
public class JeusWebDDXMLParser extends Parser {

	/* (non-Javadoc)
	 * @see com.athena.chameleon.engine.core.analyzer.parser.Parser#parse(java.io.File, com.athena.chameleon.engine.entity.pdf.AnalyzeDefinition)
	 */
	@Override
	public Object parse(File file, AnalyzeDefinition analyzeDefinition) {
		Assert.notNull(file, "file cannot be null.");
		Assert.notNull(analyzeDefinition, "analyzeDefinition cannot be null.");
		
		this.analyzeDefinition = analyzeDefinition;
		
        // only zip and war
        String key = ChameleonConstants.ZIP_ROOT_DIR;
        
        if(StringUtils.isEmpty((String)ThreadLocalUtil.get(key))) {
        	key = ChameleonConstants.WAR_ROOT_DIR;
        }
		
		PDFMetadataDefinition metadataDefinition = (PDFMetadataDefinition)ThreadLocalUtil.get(ChameleonConstants.PDF_METADATA_DEFINITION);
		EjbRecommend ejbRecommend = new EjbRecommend();
		
        try {
        	ejbRecommend = new EjbRecommend();
    		ejbRecommend.setItem(file.getName());
    		ejbRecommend.setTransFlag(false);
    		// zip, war
    		ejbRecommend.setLocation(removeTempDir(file.getParent(), key));
    		ejbRecommend.setContents(fileToString(file.getAbsolutePath()));
    		
    		metadataDefinition.getWebRecommendList().add(ejbRecommend);
        } catch (IOException e) {
            logger.error("IOException has occurred.", e);
        }

//        try {
//            CommonAnalyze commonAnalyze = new CommonAnalyze();
//            commonAnalyze.setItem(file.getName());
//            commonAnalyze.setLocation(removeTempDir(file.getParent()));
//            commonAnalyze.setContents(fileToString(file.getAbsolutePath()));
//            
//            analyzeDefinition.getDescripterList().add(commonAnalyze);
//        } catch (IOException e) {
//            logger.error("IOException has occurred.", e);
//        }
        
    	SAXBuilder builder = null;
    	Document doc = null;
    	String context = null;
    	
        try {
        	builder = new SAXBuilder();
        	doc = builder.build(file);

			// src/main/resources/jbossweb/jboss-web.xml
        	String jbossWeb = fileToString(this.getClass().getResource("/jbossweb/jboss-web.xml").getFile());
			jbossWeb = jbossWeb.replaceAll("\\$\\{loaderRepository\\}", "com.athena.chameleon:loader=" + ThreadLocalUtil.get(ChameleonConstants.PROJECT_NAME));
			
        	if(doc.getRootElement().getChild("context-root", doc.getRootElement().getNamespace()) != null) {
    			context = doc.getRootElement().getChild("context-root", doc.getRootElement().getNamespace()).getText();
    			jbossWeb = jbossWeb.replaceAll("\\$\\{contextRoot\\}", context);
        	} else {
        		jbossWeb = jbossWeb.replaceAll("<context-root>\\$\\{contextRoot\\}</context-root>", "");
        	}
        	
			rewrite(new File(file.getParentFile(), "jboss-web.xml"), jbossWeb);
			
        	ejbRecommend = new EjbRecommend();
    		ejbRecommend.setItem("jboss-web.xml");
    		ejbRecommend.setTransFlag(true);
    		ejbRecommend.setLocation(removeTempDir(file.getParent(), key));
    		ejbRecommend.setContents(jbossWeb);
    		
    		metadataDefinition.getWebRecommendList().add(ejbRecommend);
    		metadataDefinition.getWebTransFileList().add(ejbRecommend.getLocation() + File.separator + "jboss-web.xml");
        } catch (Exception e) {
			logger.error("Unhandled exception has occurred.", e);
    		location = removeTempDir(file.getAbsolutePath(), key);
    		stackTrace = StackTracer.getStackTrace(e);
    		comments = "jboss-web.xml 파일 생성 시 에러가 발생하였습니다.";
        } finally {
			if(StringUtils.isNotEmpty(stackTrace)) {
				exceptionInfo = new ExceptionInfo();
				exceptionInfo.setLocation(location);
				exceptionInfo.setStackTrace(stackTrace);
				exceptionInfo.setComments(comments);
				((PDFMetadataDefinition)ThreadLocalUtil.get(ChameleonConstants.PDF_METADATA_DEFINITION)).getExceptionInfoList().add(exceptionInfo);
			}
		}
    	
		return doc;
	}//end of parse()

}
//end of JeusWebDDXMLParser.java