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
 * Author           Date                Description
 * ---------------  ----------------    ------------
 * Hyo-jeong Lee    2012. 8. 22.        First Draft.
 */
package com.athena.chameleon.engine.file;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xml.sax.SAXException;

import com.athena.chameleon.engine.entity.FilterType;
import com.athena.chameleon.engine.entity.WebAppType;
import com.athena.chameleon.engine.utils.ZipUtil;

import com.ibm.icu.text.CharsetDetector;

/**
 * This FileUnzipTest class is a Test Case class for FileUnzip.
 * 
 * @author Hyo-jeong Lee
 * @version 1.0
 */ 

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:./src/main/resources/spring/context-*.xml" })
public class FileUnzipTest {
	
	private static final Log logger = LogFactory.getLog(FileUnzipTest.class);
	
	@Value("#{filteringProperties['chameleon.upload.temp.dir']}")
	public String unzipDirPath;

	@Value("#{contextProperties['unzip.change.target']}")
	public String changeTarget;

	@Value("#{contextProperties['unzip.default.encoding']}")
	public String defaultEncoding;

	@Value("#{contextProperties['unzip.en.encoding']}")
	public String enEncoding;
    
    @Test
    public void unzipTest() throws Exception  {
        //String zipFilePath = "C:/test/test.zip";
    	//String tmpfileDir = PropertyUtil.getProperty("unzip.dir.path") + File.separator + System.currentTimeMillis();
        String zipFilePath = this.getClass().getResource("/files/test.zip").getFile();
        String tmpfileDir = unzipDirPath + File.separator + System.currentTimeMillis();
        String unzipPath = ZipUtil.extract(zipFilePath, tmpfileDir);
        
        File unzipDir = new File(unzipPath);
        fileAsset(unzipDir, unzipPath);
        fileRead(unzipDir, unzipPath);
    }
    
    public void fileAsset(File file, String rootPath) throws Exception {
        if(file.isDirectory()) {
            for (int i=0;i < file.listFiles().length;i++) {
                File f = file.listFiles()[i];
                if(f.isDirectory()) {
                    fileAsset(f, rootPath);
                } else {
                	
                    //File unzip TestCase
                	String filePath = f.getAbsolutePath().substring(rootPath.length(), f.getAbsolutePath().length());
                    assertNotNull("["+filePath + "] file null error", f);
                    
                    if (logger.isDebugEnabled()) {
                        logger.debug("[FileUnzipTest] FilePath :" + filePath);
                    }
                    
                    //String changeTarget = PropertyUtil.getProperty("unzip.change.target");
                    
                    //UTF-8 Encoding Test Case
                    if(changeTarget.indexOf(filePath.substring(filePath.lastIndexOf(".")+1, filePath.length())) > -1) {
                        CharsetDetector detector = new CharsetDetector();
                        detector.setText(FileUtils.readFileToByteArray(f));
                        
                        //ISO-8859의 경우 예외처리
//                        assertTrue("["+filePath + "] file encoding error : " + detector.detect().getName(),
//                                (detector.detect().getName().equals(PropertyUtil.getProperty("unzip.default.encoding"))
//                                        || detector.detect().getName().indexOf(PropertyUtil.getProperty("unzip.en.encoding")) > -1));
                                                
                        assertTrue("["+filePath + "] file encoding error : " + detector.detect().getName(),
                                (detector.detect().getName().equals(defaultEncoding)
                                        || detector.detect().getName().indexOf(enEncoding) > -1));
                    }
                 
                }
            }
        }
    }

    //FileRead 및 라인단위 패턴 매칭 Test Code
    public void fileRead(File file, String rootPath) throws Exception {
    	
    	Pattern p = Pattern.compile(".*test.*");
    	Matcher match = null;
    	
        if(file.isDirectory()) {
            for (int i=0;i < file.listFiles().length;i++) {
                File f = file.listFiles()[i];
                if(f.isDirectory()) {
                    fileRead(f, rootPath);
                } else {
                    
                	String filePath = f.getAbsolutePath().substring(rootPath.length(), f.getAbsolutePath().length());
                    //String changeTarget = PropertyUtil.getProperty("unzip.change.target");
                    
                    //문서 라인 추출
                    if(changeTarget.indexOf(filePath.substring(filePath.lastIndexOf(".")+1, filePath.length())) > -1) {
                    

                        //xml file pasing
                        if(filePath.indexOf("web.xml") > -1) {
                            webXmlPasing(f);
                        }
                        
                        try {
                            FileReader reader = new FileReader(f);
                            BufferedReader buffer = new BufferedReader(reader);
                            
                            
                            String lineStr = null;
                            int line = 0;
                            while((lineStr = buffer.readLine()) != null) {
                                
                            	line++;
                                
                                match = p.matcher(lineStr);
                                if(match.matches()) {
                                    if (logger.isDebugEnabled()) {
                                        logger.debug("["+filePath+"] " + line + " line : " + lineStr);
                                    }
                                }
                            }
                            
                        } catch(Exception e) {
                            fail("File Read error");
                        }
                        
                    }
                 
                }
            }
        }
    }
    
    //xml file pasing
    public void webXmlPasing(File file) {
        
        try {
            JAXBContext context = JAXBContext.newInstance(WebAppType.class);
            Unmarshaller unShaller = context.createUnmarshaller();
            
            //SchemaFactory sf = SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
            //Schema schema = sf.newSchema(file);
            //unShaller.setSchema(schema);
            
            WebAppType app = (WebAppType) unShaller.unmarshal(file);
            List<JAXBElement<FilterType>> test = app.getDescriptionAndDisplayNameAndIcon();
            
        }/* catch(SAXException se) {
            fail("Xml Pasing Error : SAXException");
        }*/ catch(JAXBException je) {
            fail("Xml Pasing Error : JAXBException");
        } catch(Exception e) {
            fail("Xml Pasing Error");
        }
        
    }
}
//end of FileUnzipTest.java