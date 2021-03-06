//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 12:32:21 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.jeus.v5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jeus-ejb-ddType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jeus-ejb-ddType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="module-info" type="{http://www.tmaxsoft.com/xml/ns/jeus}ejb-module-infoType" minOccurs="0"/>
 *         &lt;element name="beanlist" type="{http://www.tmaxsoft.com/xml/ns/jeus}beanlistType"/>
 *         &lt;element name="ejb-relation-map" type="{http://www.tmaxsoft.com/xml/ns/jeus}ejb-relation-mapType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message-destination" type="{http://www.tmaxsoft.com/xml/ns/jeus}jndi-refType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jeus-ejb-ddType", propOrder = {
    "moduleInfo",
    "beanlist",
    "ejbRelationMap",
    "messageDestination"
})
public class JeusEjbDdType {

    @XmlElement(name = "module-info")
    protected EjbModuleInfoType moduleInfo;
    @XmlElement(required = true)
    protected BeanlistType beanlist;
    @XmlElement(name = "ejb-relation-map")
    protected List<EjbRelationMapType> ejbRelationMap;
    @XmlElement(name = "message-destination")
    protected JndiRefType messageDestination;

    /**
     * Gets the value of the moduleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EjbModuleInfoType }
     *     
     */
    public EjbModuleInfoType getModuleInfo() {
        return moduleInfo;
    }

    /**
     * Sets the value of the moduleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbModuleInfoType }
     *     
     */
    public void setModuleInfo(EjbModuleInfoType value) {
        this.moduleInfo = value;
    }

    /**
     * Gets the value of the beanlist property.
     * 
     * @return
     *     possible object is
     *     {@link BeanlistType }
     *     
     */
    public BeanlistType getBeanlist() {
        return beanlist;
    }

    /**
     * Sets the value of the beanlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanlistType }
     *     
     */
    public void setBeanlist(BeanlistType value) {
        this.beanlist = value;
    }

    /**
     * Gets the value of the ejbRelationMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ejbRelationMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEjbRelationMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EjbRelationMapType }
     * 
     * 
     */
    public List<EjbRelationMapType> getEjbRelationMap() {
        if (ejbRelationMap == null) {
            ejbRelationMap = new ArrayList<EjbRelationMapType>();
        }
        return this.ejbRelationMap;
    }

    /**
     * Gets the value of the messageDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JndiRefType }
     *     
     */
    public JndiRefType getMessageDestination() {
        return messageDestination;
    }

    /**
     * Sets the value of the messageDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JndiRefType }
     *     
     */
    public void setMessageDestination(JndiRefType value) {
        this.messageDestination = value;
    }

}
