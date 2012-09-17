//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 02:39:44 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for login-serviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="login-serviceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="jaas-login-config" type="{http://www.tmaxsoft.com/xml/ns/jeus}jaas-login-configType" minOccurs="0"/>
 *           &lt;element name="custom-login-service" type="{http://www.tmaxsoft.com/xml/ns/jeus}SecurityServiceType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "login-serviceType", propOrder = {
    "jaasLoginConfig",
    "customLoginService"
})
public class LoginServiceType {

    @XmlElement(name = "jaas-login-config", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected JaasLoginConfigType jaasLoginConfig;
    @XmlElement(name = "custom-login-service", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected SecurityServiceType customLoginService;

    /**
     * Gets the value of the jaasLoginConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JaasLoginConfigType }
     *     
     */
    public JaasLoginConfigType getJaasLoginConfig() {
        return jaasLoginConfig;
    }

    /**
     * Sets the value of the jaasLoginConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaasLoginConfigType }
     *     
     */
    public void setJaasLoginConfig(JaasLoginConfigType value) {
        this.jaasLoginConfig = value;
    }

    /**
     * Gets the value of the customLoginService property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityServiceType }
     *     
     */
    public SecurityServiceType getCustomLoginService() {
        return customLoginService;
    }

    /**
     * Sets the value of the customLoginService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityServiceType }
     *     
     */
    public void setCustomLoginService(SecurityServiceType value) {
        this.customLoginService = value;
    }

}
