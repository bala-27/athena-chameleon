//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.24 at 04:01:54 오후 KST 
//


package com.athena.chameleon.engine.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * 	The elements that use this type designate either a relative
 * 	path or an absolute path starting with a "/".
 * 
 * 	In elements that specify a pathname to a file within the
 * 	same Deployment File, relative filenames (i.e., those not
 * 	starting with "/") are considered relative to the root of
 * 	the Deployment File's namespace.  Absolute filenames (i.e.,
 * 	those starting with "/") also specify names in the root of
 * 	the Deployment File's namespace.  In general, relative names
 * 	are preferred.  The exception is .war files where absolute
 * 	names are preferred for consistency with the Servlet API.
 * 
 *       
 * 
 * <p>Java class for pathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pathType">
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
@XmlType(name = "pathType")
@XmlSeeAlso({
    JspFileType.class
})
public class PathType
    extends String
{


}
