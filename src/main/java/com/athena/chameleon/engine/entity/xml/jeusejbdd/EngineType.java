//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.04 at 12:32:21 오후 KST 
//


package com.athena.chameleon.engine.entity.xml.jeusejbdd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for engineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="engineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXCLUSIVE_ACCESS"/>
 *     &lt;enumeration value="SINGLE_OBJECT"/>
 *     &lt;enumeration value="MULTIPLE_OBJECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "engineType")
@XmlEnum
public enum EngineType {


    /**
     * 
     *                     [Description]: 각각의 Entity Bean 인스턴스는 그것이 나타내는 데이터베이스의 열과 일대일 관계를 가지고 그에
     *                     대해서 독점적인 접근을 한다. 이것은 하나의 인스턴스가 살아있는 동안 다른 Entity Bean은
     *                     데이터에 접근하거나 변경할 수 없다는 사실을 의미하기 때문에 EJB 엔진은 ejbLoad() 호출을
     *                     모두 생략할 수 있다는 것을 나타낸다. 엔진은 빈이 생성될 때 한 번  ejbLoad() 호출을 실행하고
     *                     빈이 살아있는 동안 데이터베이스에 더 이상의 어떤 변화도 없다고 가정하고 ejbLoad() 호출을 하지
     *                     않는다. 이 빈은 이것이 클러스터링된 빈의 일부일 때 사용할 수 없다. 데이터베이스는 WAS에
     *                     의해서만 변경이 허락된다는 점을 반드시 기억하기 바란다( WAS 가 아닌 접근은 허용되지 않는다).
     *                     
     * 
     */
    EXCLUSIVE_ACCESS,

    /**
     * 
     *                     [Description]: element의 값을 이것으로 설정한다면 다른 EJB 엔진의 여러 EJB들이 같은 데이터베이스 열에 매핑될
     *                     수 있다. ejbLoad()는 Entity Bean으로 요청이 들어오기 앞서서 항상 호출된다.  SINGLE_OBJECT와
     *                     MULTIPLE_OBJECT는 같은 종류의 EJB를 클러스터링할 때 필요하다. SINGLE_OBJECT와
     *                     MULTIPLE_OBJECT의 차이점은 SINGLE_OBJECT인 경우 각각의 EJB 엔진 안에서 오직 하나의 EJB
     *                     Entity Bean이 EJB 클라이언트의 모든 요청을 처리한다. 즉 같은 EJB 엔진으로 다른 EJB
     *                     클라이언트의 요청이 도착한다면 먼저 연결을 맺고 있는 다른 클라이언트의 요청이 끝날 때까지
     *                     대기상태에 있어야 한다.
     *                     
     * 
     */
    SINGLE_OBJECT,

    /**
     * 
     *                     [Description]: element의 값을 이것으로 설정한다면 다른 EJB 엔진의 여러 EJB 들이 같은 데이터베이스 열에 매핑될
     *                     수 있다. ejbLoad()는 Entity Bean으로 요청이 들어오기 앞서서 항상 호출된다.  SINGLE_OBJECT 과
     *                     MULTIPLE_OBJECT는 같은 종류의 EJB를 클러스터링할 때 필요하다. SINGLE_OBJECT와
     *                     MULTIPLE_OBJECT의 차이점은 MULTIPLE_OBJECT 인 경우 각각의 EJB 엔진 안에서 모든 EJB
     *                     클라이언트의 요청을 동시에 처리할 여러 EJB Entity Bean 인스턴스가 생성된다.즉 SINGLE_OBJECT 모드와
     *                     달리 EJB 클라이언트의 요청은 먼저 처리하고 있는 다른 요청이 끝날 때까지 대기하지 않아도 된다.
     *                     
     * 
     */
    MULTIPLE_OBJECT;

    public String value() {
        return name();
    }

    public static EngineType fromValue(String v) {
        return valueOf(v);
    }

}