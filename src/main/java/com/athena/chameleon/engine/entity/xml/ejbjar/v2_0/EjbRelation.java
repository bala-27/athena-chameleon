//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2012.10.09 시간 12:53:10 PM KST 
//


package com.athena.chameleon.engine.entity.xml.ejbjar.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "descriptionOrEjbRelationNameOrEjbRelationshipRole"
})
@XmlRootElement(name = "ejb-relation")
public class EjbRelation {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElements({
        @XmlElement(name = "description", type = Description.class),
        @XmlElement(name = "ejb-relation-name", type = EjbRelationName.class),
        @XmlElement(name = "ejb-relationship-role", type = EjbRelationshipRole.class)
    })
    protected List<Object> descriptionOrEjbRelationNameOrEjbRelationshipRole;

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the descriptionOrEjbRelationNameOrEjbRelationshipRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionOrEjbRelationNameOrEjbRelationshipRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionOrEjbRelationNameOrEjbRelationshipRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * {@link EjbRelationName }
     * {@link EjbRelationshipRole }
     * 
     * 
     */
    public List<Object> getDescriptionOrEjbRelationNameOrEjbRelationshipRole() {
        if (descriptionOrEjbRelationNameOrEjbRelationshipRole == null) {
            descriptionOrEjbRelationNameOrEjbRelationshipRole = new ArrayList<Object>();
        }
        return this.descriptionOrEjbRelationNameOrEjbRelationshipRole;
    }

}
