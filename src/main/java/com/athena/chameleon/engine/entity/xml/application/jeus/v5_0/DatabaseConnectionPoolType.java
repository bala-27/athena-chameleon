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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for database-connection-poolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="database-connection-poolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pooling" type="{http://www.tmaxsoft.com/xml/ns/jeus}oldPoolingType" minOccurs="0"/>
 *         &lt;element name="wait-free-connection" type="{http://www.tmaxsoft.com/xml/ns/jeus}wait-free-connectionType" minOccurs="0"/>
 *         &lt;element name="delegation-datasource" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="max-use-count" type="{http://www.tmaxsoft.com/xml/ns/jeus}nonNegativeIntType" minOccurs="0"/>
 *         &lt;element name="delegation-dba" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="dba-timeout" type="{http://www.tmaxsoft.com/xml/ns/jeus}off-intType" minOccurs="0"/>
 *         &lt;element name="check-query" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="check-query-period" type="{http://www.tmaxsoft.com/xml/ns/jeus}nonNegativeLongType" minOccurs="0"/>
 *         &lt;element name="check-query-class" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="stmt-caching-size" type="{http://www.tmaxsoft.com/xml/ns/jeus}off-intType" minOccurs="0"/>
 *         &lt;element name="stmt-fetch-size" type="{http://www.tmaxsoft.com/xml/ns/jeus}off-intType" minOccurs="0"/>
 *         &lt;element name="keep-connection-handle-open" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "database-connection-poolType", propOrder = {
    "pooling",
    "waitFreeConnection",
    "delegationDatasource",
    "maxUseCount",
    "delegationDba",
    "dbaTimeout",
    "checkQuery",
    "checkQueryPeriod",
    "checkQueryClass",
    "stmtCachingSize",
    "stmtFetchSize",
    "keepConnectionHandleOpen"
})
public class DatabaseConnectionPoolType {

    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected OldPoolingType pooling;
    @XmlElement(name = "wait-free-connection", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected WaitFreeConnectionType waitFreeConnection;
    @XmlElement(name = "delegation-datasource", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String delegationDatasource;
    @XmlElement(name = "max-use-count", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "0")
    protected Integer maxUseCount;
    @XmlElement(name = "delegation-dba", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String delegationDba;
    @XmlElement(name = "dba-timeout", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "-1")
    protected Integer dbaTimeout;
    @XmlElement(name = "check-query", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String checkQuery;
    @XmlElement(name = "check-query-period", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "0")
    protected Long checkQueryPeriod;
    @XmlElement(name = "check-query-class", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String checkQueryClass;
    @XmlElement(name = "stmt-caching-size", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "-1")
    protected Integer stmtCachingSize;
    @XmlElement(name = "stmt-fetch-size", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "-1")
    protected Integer stmtFetchSize;
    @XmlElement(name = "keep-connection-handle-open", namespace = "http://www.tmaxsoft.com/xml/ns/jeus", defaultValue = "false")
    protected Boolean keepConnectionHandleOpen;

    /**
     * Gets the value of the pooling property.
     * 
     * @return
     *     possible object is
     *     {@link OldPoolingType }
     *     
     */
    public OldPoolingType getPooling() {
        return pooling;
    }

    /**
     * Sets the value of the pooling property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldPoolingType }
     *     
     */
    public void setPooling(OldPoolingType value) {
        this.pooling = value;
    }

    /**
     * Gets the value of the waitFreeConnection property.
     * 
     * @return
     *     possible object is
     *     {@link WaitFreeConnectionType }
     *     
     */
    public WaitFreeConnectionType getWaitFreeConnection() {
        return waitFreeConnection;
    }

    /**
     * Sets the value of the waitFreeConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaitFreeConnectionType }
     *     
     */
    public void setWaitFreeConnection(WaitFreeConnectionType value) {
        this.waitFreeConnection = value;
    }

    /**
     * Gets the value of the delegationDatasource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationDatasource() {
        return delegationDatasource;
    }

    /**
     * Sets the value of the delegationDatasource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationDatasource(String value) {
        this.delegationDatasource = value;
    }

    /**
     * Gets the value of the maxUseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUseCount() {
        return maxUseCount;
    }

    /**
     * Sets the value of the maxUseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUseCount(Integer value) {
        this.maxUseCount = value;
    }

    /**
     * Gets the value of the delegationDba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationDba() {
        return delegationDba;
    }

    /**
     * Sets the value of the delegationDba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationDba(String value) {
        this.delegationDba = value;
    }

    /**
     * Gets the value of the dbaTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDbaTimeout() {
        return dbaTimeout;
    }

    /**
     * Sets the value of the dbaTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDbaTimeout(Integer value) {
        this.dbaTimeout = value;
    }

    /**
     * Gets the value of the checkQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckQuery() {
        return checkQuery;
    }

    /**
     * Sets the value of the checkQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckQuery(String value) {
        this.checkQuery = value;
    }

    /**
     * Gets the value of the checkQueryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCheckQueryPeriod() {
        return checkQueryPeriod;
    }

    /**
     * Sets the value of the checkQueryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCheckQueryPeriod(Long value) {
        this.checkQueryPeriod = value;
    }

    /**
     * Gets the value of the checkQueryClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckQueryClass() {
        return checkQueryClass;
    }

    /**
     * Sets the value of the checkQueryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckQueryClass(String value) {
        this.checkQueryClass = value;
    }

    /**
     * Gets the value of the stmtCachingSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStmtCachingSize() {
        return stmtCachingSize;
    }

    /**
     * Sets the value of the stmtCachingSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStmtCachingSize(Integer value) {
        this.stmtCachingSize = value;
    }

    /**
     * Gets the value of the stmtFetchSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStmtFetchSize() {
        return stmtFetchSize;
    }

    /**
     * Sets the value of the stmtFetchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStmtFetchSize(Integer value) {
        this.stmtFetchSize = value;
    }

    /**
     * Gets the value of the keepConnectionHandleOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeepConnectionHandleOpen() {
        return keepConnectionHandleOpen;
    }

    /**
     * Sets the value of the keepConnectionHandleOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepConnectionHandleOpen(Boolean value) {
        this.keepConnectionHandleOpen = value;
    }

}
