
package com.daehosting.temperatureconversions;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nFahrenheit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="nWindSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nFahrenheit",
    "nWindSpeed"
})
@XmlRootElement(name = "WindChillInFahrenheit")
public class WindChillInFahrenheit {

    @XmlElement(required = true)
    protected BigDecimal nFahrenheit;
    @XmlElement(required = true)
    protected BigDecimal nWindSpeed;

    /**
     * Gets the value of the nFahrenheit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNFahrenheit() {
        return nFahrenheit;
    }

    /**
     * Sets the value of the nFahrenheit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNFahrenheit(BigDecimal value) {
        this.nFahrenheit = value;
    }

    /**
     * Gets the value of the nWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNWindSpeed() {
        return nWindSpeed;
    }

    /**
     * Sets the value of the nWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNWindSpeed(BigDecimal value) {
        this.nWindSpeed = value;
    }

}
