
package de.gematik.ws.conn.servicedirectory.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import de.gematik.ws._int.version.productinformation.v1.ProductInformation;
import de.gematik.ws.conn.serviceinformation.v2.ServicesType;


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
 *         &lt;element ref="{http://ws.gematik.de/int/version/ProductInformation/v1.1}ProductInformation"/&gt;
 *         &lt;element name="TLSMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ClientAutMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ServiceInformation/v2.0}ServiceInformation"/&gt;
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
    "productInformation",
    "tlsMandatory",
    "clientAutMandatory",
    "serviceInformation"
})
@XmlRootElement(name = "ConnectorServices")
public class ConnectorServices {

    @XmlElement(name = "ProductInformation", namespace = "http://ws.gematik.de/int/version/ProductInformation/v1.1", required = true)
    protected ProductInformation productInformation;
    @XmlElement(name = "TLSMandatory")
    protected boolean tlsMandatory;
    @XmlElement(name = "ClientAutMandatory")
    protected boolean clientAutMandatory;
    @XmlElement(name = "ServiceInformation", namespace = "http://ws.gematik.de/conn/ServiceInformation/v2.0", required = true)
    protected ServicesType serviceInformation;

    /**
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformation }
     *     
     */
    public ProductInformation getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformation }
     *     
     */
    public void setProductInformation(ProductInformation value) {
        this.productInformation = value;
    }

    /**
     * Gets the value of the tlsMandatory property.
     * 
     */
    public boolean isTLSMandatory() {
        return tlsMandatory;
    }

    /**
     * Sets the value of the tlsMandatory property.
     * 
     */
    public void setTLSMandatory(boolean value) {
        this.tlsMandatory = value;
    }

    /**
     * Gets the value of the clientAutMandatory property.
     * 
     */
    public boolean isClientAutMandatory() {
        return clientAutMandatory;
    }

    /**
     * Sets the value of the clientAutMandatory property.
     * 
     */
    public void setClientAutMandatory(boolean value) {
        this.clientAutMandatory = value;
    }

    /**
     * Gets the value of the serviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesType }
     *     
     */
    public ServicesType getServiceInformation() {
        return serviceInformation;
    }

    /**
     * Sets the value of the serviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesType }
     *     
     */
    public void setServiceInformation(ServicesType value) {
        this.serviceInformation = value;
    }

}
