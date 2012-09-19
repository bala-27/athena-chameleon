//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 07:02:27 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v6_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for x509-credential-mappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x509-credential-mappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="truststore-path" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="truststore-password" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x509-credential-mappingType", propOrder = {
    "truststorePath",
    "truststorePassword"
})
public class X509CredentialMappingType {

    @XmlElement(name = "truststore-path", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String truststorePath;
    @XmlElement(name = "truststore-password", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "changeit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String truststorePassword;

    /**
     * Gets the value of the truststorePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruststorePath() {
        return truststorePath;
    }

    /**
     * Sets the value of the truststorePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruststorePath(String value) {
        this.truststorePath = value;
    }

    /**
     * Gets the value of the truststorePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruststorePassword() {
        return truststorePassword;
    }

    /**
     * Sets the value of the truststorePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruststorePassword(String value) {
        this.truststorePassword = value;
    }

}