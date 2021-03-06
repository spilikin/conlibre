
package org.etsi.uri._02231.v2_;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDigitalIdentityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDigitalIdentityListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}ServiceDigitalIdentity" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDigitalIdentityListType", propOrder = {
    "serviceDigitalIdentity"
})
public class ServiceDigitalIdentityListType {

    @XmlElement(name = "ServiceDigitalIdentity", required = true)
    protected List<DigitalIdentityListType> serviceDigitalIdentity;

    /**
     * Gets the value of the serviceDigitalIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDigitalIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDigitalIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DigitalIdentityListType }
     * 
     * 
     */
    public List<DigitalIdentityListType> getServiceDigitalIdentity() {
        if (serviceDigitalIdentity == null) {
            serviceDigitalIdentity = new ArrayList<DigitalIdentityListType>();
        }
        return this.serviceDigitalIdentity;
    }

}
