//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.24 at 04:01:54 오후 KST 
//


package com.athena.chameleon.engine.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	
 * 
 * 	  The remote element contains the fully-qualified name
 * 	  of the enterprise bean's remote interface.
 * 
 * 	  Example:
 * 
 * 	      <remote>com.wombat.empl.EmployeeService</remote>
 * 
 * 	  
 *       
 * 
 * <p>Java class for remoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remoteType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://java.sun.com/xml/ns/javaee>fully-qualified-classType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remoteType")
public class RemoteType
    extends FullyQualifiedClassType
{


}
