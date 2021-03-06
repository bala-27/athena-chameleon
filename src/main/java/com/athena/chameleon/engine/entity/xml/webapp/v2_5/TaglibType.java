//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2012.09.05 시간 05:58:17 PM KST 
//


package com.athena.chameleon.engine.entity.xml.webapp.v2_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * 	The taglibType defines the syntax for declaring in
 * 	the deployment descriptor that a tag library is
 * 	available to the application.  This can be done
 * 	to override implicit map entries from TLD files and
 * 	from the container.
 * 
 *       
 * 
 * <p>taglibType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="taglibType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taglib-uri" type="{http://java.sun.com/xml/ns/javaee}string"/>
 *         &lt;element name="taglib-location" type="{http://java.sun.com/xml/ns/javaee}pathType"/>
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
@XmlType(name = "taglibType", propOrder = {
    "taglibUri",
    "taglibLocation"
})
public class TaglibType {

    @XmlElement(name = "taglib-uri", required = true)
    protected com.athena.chameleon.engine.entity.xml.webapp.v2_5.String taglibUri;
    @XmlElement(name = "taglib-location", required = true)
    protected PathType taglibLocation;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * taglibUri 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link com.athena.chameleon.engine.entity.xml.webapp.v2_5.String }
     *     
     */
    public com.athena.chameleon.engine.entity.xml.webapp.v2_5.String getTaglibUri() {
        return taglibUri;
    }

    /**
     * taglibUri 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link com.athena.chameleon.engine.entity.xml.webapp.v2_5.String }
     *     
     */
    public void setTaglibUri(com.athena.chameleon.engine.entity.xml.webapp.v2_5.String value) {
        this.taglibUri = value;
    }

    /**
     * taglibLocation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PathType }
     *     
     */
    public PathType getTaglibLocation() {
        return taglibLocation;
    }

    /**
     * taglibLocation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PathType }
     *     
     */
    public void setTaglibLocation(PathType value) {
        this.taglibLocation = value;
    }

    /**
     * id 속성의 값을 가져옵니다.
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
     * id 속성의 값을 설정합니다.
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
