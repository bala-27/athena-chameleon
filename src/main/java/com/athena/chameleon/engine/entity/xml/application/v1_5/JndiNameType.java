//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 02:09:25 오전 KST 
//


package com.athena.chameleon.engine.entity.xml.application.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * 	The jndi-nameType type designates a JNDI name in the
 * 	Deployment Component's environment and is relative to the
 * 	java:comp/env context.  A JNDI name must be unique within the
 * 	Deployment Component.
 * 
 *       
 * 
 * <p>Java class for jndi-nameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jndi-nameType">
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
@XmlType(name = "jndi-nameType")
public class JndiNameType
    extends String
{


}
