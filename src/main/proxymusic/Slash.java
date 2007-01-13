//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.13 at 10:26:09 PM CET 
//


package proxymusic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>Comments from original DTD:
 * <pre>
 * The slash element is used to indicate that
 * slash notation is to be used. If the slash is
 * on every beat, use-stems is no (the default).
 * To indicate rhythms but not pitches, use-stems
 * is set to yes. The type attribute indicates
 * whether this is the start or stop of a slash
 * notation style. The use-dots attribute works
 * as for the beat-repeat element, and only
 * has effect if use-stems is no.
 * </pre>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="start"/>
 *             &lt;enumeration value="stop"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="use-dots">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="use-stems">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="yes"/>
 *             &lt;enumeration value="no"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "slash")
public class Slash {

    @XmlAttribute(required = true)
    protected java.lang.String type;
    @XmlAttribute(name = "use-dots")
    protected java.lang.String useDots;
    @XmlAttribute(name = "use-stems")
    protected java.lang.String useStems;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setType(java.lang.String value) {
        this.type = value;
    }

    /**
     * Gets the value of the useDots property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUseDots() {
        return useDots;
    }

    /**
     * Sets the value of the useDots property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUseDots(java.lang.String value) {
        this.useDots = value;
    }

    /**
     * Gets the value of the useStems property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUseStems() {
        return useStems;
    }

    /**
     * Sets the value of the useStems property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUseStems(java.lang.String value) {
        this.useStems = value;
    }

}
