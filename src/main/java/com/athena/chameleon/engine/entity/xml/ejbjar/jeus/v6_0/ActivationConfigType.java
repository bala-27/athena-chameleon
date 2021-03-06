//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 10:14:54 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.jeus.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * 		The activation-configType defines information about the
 * 		expected configuration properties of the message-driven bean
 * 		in its operational environment. This may include information
 * 		about message acknowledgement, message selector, expected
 * 		destination type, etc.
 * 
 * 		The configuration information is expressed in terms of
 * 		name/value configuration properties.
 * 
 * 		The properties that are recognized for a particular
 * 		message-driven bean are determined by the messaging type.
 * 
 *             
 * 
 * <p>Java class for activation-configType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activation-configType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activation-config-property" type="{http://www.tmaxsoft.com/xml/ns/jeus}activation-config-propertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activation-configType", propOrder = {
    "description",
    "activationConfigProperty"
})
public class ActivationConfigType {

    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<String> description;
    @XmlElement(name = "activation-config-property", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", required = true)
    protected List<ActivationConfigPropertyType> activationConfigProperty;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Gets the value of the activationConfigProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activationConfigProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivationConfigProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivationConfigPropertyType }
     * 
     * 
     */
    public List<ActivationConfigPropertyType> getActivationConfigProperty() {
        if (activationConfigProperty == null) {
            activationConfigProperty = new ArrayList<ActivationConfigPropertyType>();
        }
        return this.activationConfigProperty;
    }

}
