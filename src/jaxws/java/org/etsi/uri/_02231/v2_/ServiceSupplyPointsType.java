
package org.etsi.uri._02231.v2_;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSupplyPointsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSupplyPointsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="ServiceSupplyPoint" type="{http://uri.etsi.org/02231/v2#}NonEmptyURIType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSupplyPointsType", propOrder = {
    "serviceSupplyPoint"
})
public class ServiceSupplyPointsType {

    @XmlElement(name = "ServiceSupplyPoint", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> serviceSupplyPoint;

    /**
     * Gets the value of the serviceSupplyPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSupplyPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSupplyPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceSupplyPoint() {
        if (serviceSupplyPoint == null) {
            serviceSupplyPoint = new ArrayList<String>();
        }
        return this.serviceSupplyPoint;
    }

}
