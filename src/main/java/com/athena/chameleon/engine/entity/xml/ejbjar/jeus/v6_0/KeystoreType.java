//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 10:14:54 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.jeus.v6_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for keystoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="keystoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keystore-password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="keystore-filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keystoreType", propOrder = {
    "keyType",
    "keystorePassword",
    "keystoreFilename"
})
public class KeystoreType {

    @XmlElement(name = "key-type", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected String keyType;
    @XmlElement(name = "keystore-password", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected String keystorePassword;
    @XmlElement(name = "keystore-filename", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected String keystoreFilename;

    /**
     * Gets the value of the keyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyType() {
        return keyType;
    }

    /**
     * Sets the value of the keyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyType(String value) {
        this.keyType = value;
    }

    /**
     * Gets the value of the keystorePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeystorePassword() {
        return keystorePassword;
    }

    /**
     * Sets the value of the keystorePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeystorePassword(String value) {
        this.keystorePassword = value;
    }

    /**
     * Gets the value of the keystoreFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeystoreFilename() {
        return keystoreFilename;
    }

    /**
     * Sets the value of the keystoreFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeystoreFilename(String value) {
        this.keystoreFilename = value;
    }

}
