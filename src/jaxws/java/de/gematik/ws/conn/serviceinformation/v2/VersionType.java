
package de.gematik.ws.conn.serviceinformation.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.gematik.de/conn/ServiceInformation/v2.0}Abstract"/&gt;
 *         &lt;element name="Endpoint" type="{http://ws.gematik.de/conn/ServiceInformation/v2.0}EndpointType" minOccurs="0"/&gt;
 *         &lt;element name="EndpointTLS" type="{http://ws.gematik.de/conn/ServiceInformation/v2.0}EndpointType"/&gt;
 *         &lt;element name="WSDL" type="{http://ws.gematik.de/conn/ServiceInformation/v2.0}WSDLLocationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TargetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionType", propOrder = {
    "_abstract",
    "endpoint",
    "endpointTLS",
    "wsdl"
})
public class VersionType {

    @XmlElement(name = "Abstract", required = true)
    protected String _abstract;
    @XmlElement(name = "Endpoint")
    protected EndpointType endpoint;
    @XmlElement(name = "EndpointTLS", required = true)
    protected EndpointType endpointTLS;
    @XmlElement(name = "WSDL")
    protected WSDLLocationType wsdl;
    @XmlAttribute(name = "TargetNamespace")
    @XmlSchemaType(name = "anyURI")
    protected String targetNamespace;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointType }
     *     
     */
    public EndpointType getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointType }
     *     
     */
    public void setEndpoint(EndpointType value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the endpointTLS property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointType }
     *     
     */
    public EndpointType getEndpointTLS() {
        return endpointTLS;
    }

    /**
     * Sets the value of the endpointTLS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointType }
     *     
     */
    public void setEndpointTLS(EndpointType value) {
        this.endpointTLS = value;
    }

    /**
     * Gets the value of the wsdl property.
     * 
     * @return
     *     possible object is
     *     {@link WSDLLocationType }
     *     
     */
    public WSDLLocationType getWSDL() {
        return wsdl;
    }

    /**
     * Sets the value of the wsdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDLLocationType }
     *     
     */
    public void setWSDL(WSDLLocationType value) {
        this.wsdl = value;
    }

    /**
     * Gets the value of the targetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * Sets the value of the targetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNamespace(String value) {
        this.targetNamespace = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
