//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.24 at 04:01:54 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.webapp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * 	The message-destination-usageType specifies the use of the
 * 	message destination indicated by the reference.  The value
 * 	indicates whether messages are consumed from the message
 * 	destination, produced for the destination, or both.  The
 * 	Assembler makes use of this information in linking producers
 * 	of a destination with its consumers.
 * 
 * 	The value of the message-destination-usage element must be
 * 	one of the following:
 * 	    Consumes
 * 	    Produces
 * 	    ConsumesProduces
 * 
 *       
 * 
 * <p>Java class for message-destination-usageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message-destination-usageType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://java.sun.com/xml/ns/javaee>string">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message-destination-usageType")
public class MessageDestinationUsageType
    extends String
{


}