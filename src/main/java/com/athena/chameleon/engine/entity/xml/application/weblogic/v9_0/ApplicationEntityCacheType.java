//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.05 at 01:53:24 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.weblogic.v9_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for application-entity-cacheType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="application-entity-cacheType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity-cache-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="max-beans-in-cache" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="max-cache-size" type="{http://www.bea.com/ns/weblogic/90}max-cache-sizeType"/>
 *         &lt;/choice>
 *         &lt;element name="max-queries-in-cache" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="caching-strategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "application-entity-cacheType", propOrder = {
    "entityCacheName",
    "maxBeansInCache",
    "maxCacheSize",
    "maxQueriesInCache",
    "cachingStrategy"
})
public class ApplicationEntityCacheType {

    @XmlElement(name = "entity-cache-name", namespace = "http://www.bea.com/ns/weblogic/90", required = true)
    protected java.lang.String entityCacheName;
    @XmlElement(name = "max-beans-in-cache", namespace = "http://www.bea.com/ns/weblogic/90")
    protected Integer maxBeansInCache;
    @XmlElement(name = "max-cache-size", namespace = "http://www.bea.com/ns/weblogic/90")
    protected MaxCacheSizeType maxCacheSize;
    @XmlElement(name = "max-queries-in-cache", namespace = "http://www.bea.com/ns/weblogic/90")
    protected Integer maxQueriesInCache;
    @XmlElement(name = "caching-strategy", namespace = "http://www.bea.com/ns/weblogic/90")
    protected java.lang.String cachingStrategy;

    /**
     * Gets the value of the entityCacheName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEntityCacheName() {
        return entityCacheName;
    }

    /**
     * Sets the value of the entityCacheName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEntityCacheName(java.lang.String value) {
        this.entityCacheName = value;
    }

    /**
     * Gets the value of the maxBeansInCache property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxBeansInCache() {
        return maxBeansInCache;
    }

    /**
     * Sets the value of the maxBeansInCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxBeansInCache(Integer value) {
        this.maxBeansInCache = value;
    }

    /**
     * Gets the value of the maxCacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link MaxCacheSizeType }
     *     
     */
    public MaxCacheSizeType getMaxCacheSize() {
        return maxCacheSize;
    }

    /**
     * Sets the value of the maxCacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxCacheSizeType }
     *     
     */
    public void setMaxCacheSize(MaxCacheSizeType value) {
        this.maxCacheSize = value;
    }

    /**
     * Gets the value of the maxQueriesInCache property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxQueriesInCache() {
        return maxQueriesInCache;
    }

    /**
     * Sets the value of the maxQueriesInCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxQueriesInCache(Integer value) {
        this.maxQueriesInCache = value;
    }

    /**
     * Gets the value of the cachingStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCachingStrategy() {
        return cachingStrategy;
    }

    /**
     * Sets the value of the cachingStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCachingStrategy(java.lang.String value) {
        this.cachingStrategy = value;
    }

}
