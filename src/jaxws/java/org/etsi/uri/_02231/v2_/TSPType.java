
package org.etsi.uri._02231.v2_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}TSPInformation"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}TSPServices"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPType", propOrder = {
    "tspInformation",
    "tspServices"
})
public class TSPType {

    @XmlElement(name = "TSPInformation", required = true)
    protected TSPInformationType tspInformation;
    @XmlElement(name = "TSPServices", required = true)
    protected TSPServicesListType tspServices;

    /**
     * Gets the value of the tspInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TSPInformationType }
     *     
     */
    public TSPInformationType getTSPInformation() {
        return tspInformation;
    }

    /**
     * Sets the value of the tspInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPInformationType }
     *     
     */
    public void setTSPInformation(TSPInformationType value) {
        this.tspInformation = value;
    }

    /**
     * Gets the value of the tspServices property.
     * 
     * @return
     *     possible object is
     *     {@link TSPServicesListType }
     *     
     */
    public TSPServicesListType getTSPServices() {
        return tspServices;
    }

    /**
     * Sets the value of the tspServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPServicesListType }
     *     
     */
    public void setTSPServices(TSPServicesListType value) {
        this.tspServices = value;
    }

}
