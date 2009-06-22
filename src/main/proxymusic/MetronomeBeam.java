//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.22 at 11:25:35 PM CEST 
//


package proxymusic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The metronome-beam type works like the beam type in defining metric relationships, but does not include all the attributes available in the beam type.
 * 
 * <p>Java class for metronome-beam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metronome-beam">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>beam-value">
 *       &lt;attribute name="number" type="{}beam-level" default="1" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metronome-beam", propOrder = {
    "value"
})
public class MetronomeBeam {

    @XmlValue
    protected BeamValue value;
    @XmlAttribute
    protected Integer number;

    /**
     * The beam-value type represents the type of beam associated with each of 6 beam levels (up to 256th notes) available for each note.
     * 
     * @return
     *     possible object is
     *     {@link BeamValue }
     *     
     */
    public BeamValue getValue() {
        return value;
    }

    /**
     * The beam-value type represents the type of beam associated with each of 6 beam levels (up to 256th notes) available for each note.
     * 
     * @param value
     *     allowed object is
     *     {@link BeamValue }
     *     
     */
    public void setValue(BeamValue value) {
        this.value = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumber() {
        if (number == null) {
            return  1;
        } else {
            return number;
        }
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

}
