
package org.etsi.uri._02231.v2_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}PostalAddresses"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ElectronicAddress"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "postalAddresses",
    "electronicAddress"
})
public class AddressType {

    @XmlElement(name = "PostalAddresses", required = true)
    protected PostalAddressListType postalAddresses;
    @XmlElement(name = "ElectronicAddress", required = true)
    protected ElectronicAddressType electronicAddress;

    /**
     * Gets the value of the postalAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressListType }
     *     
     */
    public PostalAddressListType getPostalAddresses() {
        return postalAddresses;
    }

    /**
     * Sets the value of the postalAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressListType }
     *     
     */
    public void setPostalAddresses(PostalAddressListType value) {
        this.postalAddresses = value;
    }

    /**
     * Gets the value of the electronicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicAddressType }
     *     
     */
    public ElectronicAddressType getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * Sets the value of the electronicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicAddressType }
     *     
     */
    public void setElectronicAddress(ElectronicAddressType value) {
        this.electronicAddress = value;
    }

}
