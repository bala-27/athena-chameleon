//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.30 at 10:54:58 오전 KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.v2_1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.athena.chameleon.engine.entity.xml.j2ee.DescriptionType;


/**
 * 
 * 
 * 	The cmr-fieldType describes the bean provider's view of
 * 	a relationship. It consists of an optional description, and
 * 	the name and the class type of a field in the source of a
 * 	role of a relationship. The cmr-field-name element
 * 	corresponds to the name used for the get and set accessor
 * 	methods for the relationship. The cmr-field-type element is
 * 	used only for collection-valued cmr-fields. It specifies the
 * 	type of the collection that is used.
 * 
 *       
 * 
 * <p>Java class for cmr-fieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmr-fieldType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://java.sun.com/xml/ns/j2ee}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cmr-field-name" type="{http://java.sun.com/xml/ns/j2ee}string"/>
 *         &lt;element name="cmr-field-type" type="{http://java.sun.com/xml/ns/j2ee}cmr-field-typeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmr-fieldType", propOrder = {
    "description",
    "cmrFieldName",
    "cmrFieldType"
})
public class CmrFieldType {

    protected List<DescriptionType> description;
    @XmlElement(name = "cmr-field-name", required = true)
    protected com.athena.chameleon.engine.entity.xml.j2ee.String cmrFieldName;
    @XmlElement(name = "cmr-field-type")
    protected CmrFieldTypeType cmrFieldType;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

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
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the cmrFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.j2ee.String }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.j2ee.String getCmrFieldName() {
        return cmrFieldName;
    }

    /**
     * Sets the value of the cmrFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.j2ee.String }
     *     
     */
    public void setCmrFieldName(com.athena.chameleon.engine.entity.xml.j2ee.String value) {
        this.cmrFieldName = value;
    }

    /**
     * Gets the value of the cmrFieldType property.
     * 
     * @return
     *     possible object is
     *     {@link CmrFieldTypeType }
     *     
     */
    public CmrFieldTypeType getCmrFieldType() {
        return cmrFieldType;
    }

    /**
     * Sets the value of the cmrFieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmrFieldTypeType }
     *     
     */
    public void setCmrFieldType(CmrFieldTypeType value) {
        this.cmrFieldType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
