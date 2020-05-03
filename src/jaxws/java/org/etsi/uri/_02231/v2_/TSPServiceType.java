
package org.etsi.uri._02231.v2_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSPServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceInformation"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceHistory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPServiceType", propOrder = {
    "serviceInformation",
    "serviceHistory"
})
public class TSPServiceType {

    @XmlElement(name = "ServiceInformation", required = true)
    protected TSPServiceInformationType serviceInformation;
    @XmlElement(name = "ServiceHistory")
    protected ServiceHistoryType serviceHistory;

    /**
     * Gets the value of the serviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TSPServiceInformationType }
     *     
     */
    public TSPServiceInformationType getServiceInformation() {
        return serviceInformation;
    }

    /**
     * Sets the value of the serviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPServiceInformationType }
     *     
     */
    public void setServiceInformation(TSPServiceInformationType value) {
        this.serviceInformation = value;
    }

    /**
     * Gets the value of the serviceHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceHistoryType }
     *     
     */
    public ServiceHistoryType getServiceHistory() {
        return serviceHistory;
    }

    /**
     * Sets the value of the serviceHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHistoryType }
     *     
     */
    public void setServiceHistory(ServiceHistoryType value) {
        this.serviceHistory = value;
    }

}
