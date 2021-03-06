//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2012.09.12 시간 04:26:39 PM KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.weblogic.v8_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entityCacheName",
    "readTimeoutSeconds",
    "concurrencyStrategy",
    "cacheBetweenTransactions",
    "estimatedBeanSize",
    "idleTimeoutSeconds"
})
@XmlRootElement(name = "entity-cache-ref")
public class EntityCacheRef {

    @XmlElement(name = "entity-cache-name", required = true)
    protected String entityCacheName;
    @XmlElement(name = "read-timeout-seconds")
    protected String readTimeoutSeconds;
    @XmlElement(name = "concurrency-strategy", required = true)
    protected String concurrencyStrategy;
    @XmlElement(name = "cache-between-transactions")
    protected String cacheBetweenTransactions;
    @XmlElement(name = "estimated-bean-size")
    protected String estimatedBeanSize;
    @XmlElement(name = "idle-timeout-seconds")
    protected String idleTimeoutSeconds;

    /**
     * entityCacheName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityCacheName() {
        return entityCacheName;
    }

    /**
     * entityCacheName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityCacheName(String value) {
        this.entityCacheName = value;
    }

    /**
     * readTimeoutSeconds 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadTimeoutSeconds() {
        return readTimeoutSeconds;
    }

    /**
     * readTimeoutSeconds 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadTimeoutSeconds(String value) {
        this.readTimeoutSeconds = value;
    }

    /**
     * concurrencyStrategy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcurrencyStrategy() {
        return concurrencyStrategy;
    }

    /**
     * concurrencyStrategy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcurrencyStrategy(String value) {
        this.concurrencyStrategy = value;
    }

    /**
     * cacheBetweenTransactions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheBetweenTransactions() {
        return cacheBetweenTransactions;
    }

    /**
     * cacheBetweenTransactions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheBetweenTransactions(String value) {
        this.cacheBetweenTransactions = value;
    }

    /**
     * estimatedBeanSize 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedBeanSize() {
        return estimatedBeanSize;
    }

    /**
     * estimatedBeanSize 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedBeanSize(String value) {
        this.estimatedBeanSize = value;
    }

    /**
     * idleTimeoutSeconds 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleTimeoutSeconds() {
        return idleTimeoutSeconds;
    }

    /**
     * idleTimeoutSeconds 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleTimeoutSeconds(String value) {
        this.idleTimeoutSeconds = value;
    }

}
