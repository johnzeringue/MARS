//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.10 at 05:23:00 PM EST
//


package org.cirdles.mars.sesar.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IgneousType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IgneousType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Plutonic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="PlutonicType" type="{http://app.geosamples.org}IgneousDetails" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Volcanic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="VolcanicType" type="{http://app.geosamples.org}IgneousDetails" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IgneousType", propOrder = {
    "plutonic",
    "volcanic"
})
public class IgneousType {

    @XmlElement(name = "Plutonic")
    protected IgneousType.Plutonic plutonic;
    @XmlElement(name = "Volcanic")
    protected IgneousType.Volcanic volcanic;

    /**
     * Gets the value of the plutonic property.
     *
     * @return
     *     possible object is
     *     {@link IgneousType.Plutonic }
     *
     */
    public IgneousType.Plutonic getPlutonic() {
        return plutonic;
    }

    /**
     * Sets the value of the plutonic property.
     *
     * @param value
     *     allowed object is
     *     {@link IgneousType.Plutonic }
     *
     */
    public void setPlutonic(IgneousType.Plutonic value) {
        this.plutonic = value;
    }

    /**
     * Gets the value of the volcanic property.
     *
     * @return
     *     possible object is
     *     {@link IgneousType.Volcanic }
     *
     */
    public IgneousType.Volcanic getVolcanic() {
        return volcanic;
    }

    /**
     * Sets the value of the volcanic property.
     *
     * @param value
     *     allowed object is
     *     {@link IgneousType.Volcanic }
     *
     */
    public void setVolcanic(IgneousType.Volcanic value) {
        this.volcanic = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="PlutonicType" type="{http://app.geosamples.org}IgneousDetails" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "plutonicType"
    })
    public static class Plutonic {

        @XmlElement(name = "PlutonicType")
        @XmlSchemaType(name = "string")
        protected IgneousDetails plutonicType;

        /**
         * Gets the value of the plutonicType property.
         *
         * @return
         *     possible object is
         *     {@link IgneousDetails }
         *
         */
        public IgneousDetails getPlutonicType() {
            return plutonicType;
        }

        /**
         * Sets the value of the plutonicType property.
         *
         * @param value
         *     allowed object is
         *     {@link IgneousDetails }
         *
         */
        public void setPlutonicType(IgneousDetails value) {
            this.plutonicType = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="VolcanicType" type="{http://app.geosamples.org}IgneousDetails" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "volcanicType"
    })
    public static class Volcanic {

        @XmlElement(name = "VolcanicType")
        @XmlSchemaType(name = "string")
        protected IgneousDetails volcanicType;

        /**
         * Gets the value of the volcanicType property.
         *
         * @return
         *     possible object is
         *     {@link IgneousDetails }
         *
         */
        public IgneousDetails getVolcanicType() {
            return volcanicType;
        }

        /**
         * Sets the value of the volcanicType property.
         *
         * @param value
         *     allowed object is
         *     {@link IgneousDetails }
         *
         */
        public void setVolcanicType(IgneousDetails value) {
            this.volcanicType = value;
        }

    }

}