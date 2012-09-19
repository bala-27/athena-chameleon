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
 * <p>Java class for message-bridgeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message-bridgeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bridge-connections" type="{http://www.tmaxsoft.com/xml/ns/jeus}bridge-connectionsType" minOccurs="0"/>
 *         &lt;element name="bridges" type="{http://www.tmaxsoft.com/xml/ns/jeus}bridge-entriesType" minOccurs="0"/>
 *         &lt;element name="basedir" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message-bridgeType", propOrder = {
    "bridgeConnections",
    "bridges",
    "basedir"
})
public class MessageBridgeType {

    @XmlElement(name = "bridge-connections", namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected BridgeConnectionsType bridgeConnections;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    protected BridgeEntriesType bridges;
    @XmlElement(namespace = "http://www.tmaxsoft.com/xml/ns/jeus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String basedir;

    /**
     * Gets the value of the bridgeConnections property.
     * 
     * @return
     *     possible object is
     *     {@link BridgeConnectionsType }
     *     
     */
    public BridgeConnectionsType getBridgeConnections() {
        return bridgeConnections;
    }

    /**
     * Sets the value of the bridgeConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BridgeConnectionsType }
     *     
     */
    public void setBridgeConnections(BridgeConnectionsType value) {
        this.bridgeConnections = value;
    }

    /**
     * Gets the value of the bridges property.
     * 
     * @return
     *     possible object is
     *     {@link BridgeEntriesType }
     *     
     */
    public BridgeEntriesType getBridges() {
        return bridges;
    }

    /**
     * Sets the value of the bridges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BridgeEntriesType }
     *     
     */
    public void setBridges(BridgeEntriesType value) {
        this.bridges = value;
    }

    /**
     * Gets the value of the basedir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasedir() {
        return basedir;
    }

    /**
     * Sets the value of the basedir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasedir(String value) {
        this.basedir = value;
    }

}