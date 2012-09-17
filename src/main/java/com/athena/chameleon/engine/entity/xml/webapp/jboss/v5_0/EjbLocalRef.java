//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.6 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2012.09.17 시간 02:04:20 PM KST 
//


package com.athena.chameleon.engine.entity.xml.webapp.jboss.v5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ejbRefName",
    "localJndiNameOrJndiName"
})
@XmlRootElement(name = "ejb-local-ref")
public class EjbLocalRef {

    @XmlElement(name = "ejb-ref-name", required = true)
    protected String ejbRefName;
    @XmlElements({
        @XmlElement(name = "local-jndi-name", required = true, type = LocalJndiName.class),
        @XmlElement(name = "jndi-name", required = true, type = JndiName.class)
    })
    protected List<Object> localJndiNameOrJndiName;

    /**
     * ejbRefName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjbRefName() {
        return ejbRefName;
    }

    /**
     * ejbRefName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjbRefName(String value) {
        this.ejbRefName = value;
    }

    /**
     * Gets the value of the localJndiNameOrJndiName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localJndiNameOrJndiName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalJndiNameOrJndiName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalJndiName }
     * {@link JndiName }
     * 
     * 
     */
    public List<Object> getLocalJndiNameOrJndiName() {
        if (localJndiNameOrJndiName == null) {
            localJndiNameOrJndiName = new ArrayList<Object>();
        }
        return this.localJndiNameOrJndiName;
    }

}
