//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.30 at 10:54:58 오전 KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.v2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * 	The ejb-relationType describes a relationship between two
 * 	entity beans with container-managed persistence.  It is used
 * 	by ejb-relation elements. It contains a description; an
 * 	optional ejb-relation-name element; and exactly two
 * 	relationship role declarations, defined by the
 * 	ejb-relationship-role elements. The name of the
 * 	relationship, if specified, is unique within the ejb-jar
 * 	file.
 * 
 *       
 * 
 * <p>Java class for ejb-relationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ejb-relationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://java.sun.com/xml/ns/j2ee}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ejb-relation-name" type="{http://java.sun.com/xml/ns/j2ee}string" minOccurs="0"/>
 *         &lt;element name="ejb-relationship-role" type="{http://java.sun.com/xml/ns/j2ee}ejb-relationship-roleType"/>
 *         &lt;element name="ejb-relationship-role" type="{http://java.sun.com/xml/ns/j2ee}ejb-relationship-roleType"/>
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
@XmlType(name = "ejb-relationType", propOrder = {
    "content"
})
public class EjbRelationType {

    @XmlElementRefs({
        @XmlElementRef(name = "description", namespace = "http://java.sun.com/xml/ns/j2ee", type = JAXBElement.class),
        @XmlElementRef(name = "ejb-relation-name", namespace = "http://java.sun.com/xml/ns/j2ee", type = JAXBElement.class),
        @XmlElementRef(name = "ejb-relationship-role", namespace = "http://java.sun.com/xml/ns/j2ee", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "EjbRelationshipRole" is used by two different parts of a schema. See: 
     * line 671 of file:/Volumes/STORAGE/development/kwac/workspace/jaxb-generation/schema/ejbjar/ejb-jar_2_1.xsd
     * line 669 of file:/Volumes/STORAGE/development/kwac/workspace/jaxb-generation/schema/ejbjar/ejb-jar_2_1.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.athena.chameleon.engine.entity.xml.ejbjar.String }{@code >}
     * {@link JAXBElement }{@code <}{@link EjbRelationshipRoleType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
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
