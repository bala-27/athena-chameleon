//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.17 at 02:39:44 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.application.jeus.v5_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for engine-typeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="engine-typeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ejb"/>
 *     &lt;enumeration value="servlet"/>
 *     &lt;enumeration value="jms"/>
 *     &lt;enumeration value="ws"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum EngineTypeType {

    @XmlEnumValue("ejb")
    EJB("ejb"),
    @XmlEnumValue("jms")
    JMS("jms"),
    @XmlEnumValue("servlet")
    SERVLET("servlet"),
    @XmlEnumValue("ws")
    WS("ws");
    private final String value;

    EngineTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EngineTypeType fromValue(String v) {
        for (EngineTypeType c: EngineTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
