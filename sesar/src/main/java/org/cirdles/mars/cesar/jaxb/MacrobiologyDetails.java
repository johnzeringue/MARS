//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.10 at 05:23:00 PM EST 
//


package org.cirdles.mars.cesar.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MacrobiologyDetails.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MacrobiologyDetails">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Coral"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MacrobiologyDetails")
@XmlEnum
public enum MacrobiologyDetails {

    @XmlEnumValue("Coral")
    CORAL("Coral");
    private final String value;

    MacrobiologyDetails(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MacrobiologyDetails fromValue(String v) {
        for (MacrobiologyDetails c: MacrobiologyDetails.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}