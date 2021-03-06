
package oasis.names.tc.dss_x._1_0.profiles.verificationreport.schema_;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SingleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertID"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HashAlgorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                   &lt;element name="IssuerNameHash" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
 *                   &lt;element name="IssuerKeyHash" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
 *                   &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CertStatus" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}VerificationResultType"/&gt;
 *         &lt;element name="ThisUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NextUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SingleExtensions" type="{urn:oasis:names:tc:dss-x:1.0:profiles:verificationreport:schema#}ExtensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleResponseType", propOrder = {
    "certID",
    "certStatus",
    "thisUpdate",
    "nextUpdate",
    "singleExtensions"
})
public class SingleResponseType {

    @XmlElement(name = "CertID", required = true)
    protected SingleResponseType.CertID certID;
    @XmlElement(name = "CertStatus", required = true)
    protected VerificationResultType certStatus;
    @XmlElement(name = "ThisUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar thisUpdate;
    @XmlElement(name = "NextUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextUpdate;
    @XmlElement(name = "SingleExtensions")
    protected ExtensionsType singleExtensions;

    /**
     * Gets the value of the certID property.
     * 
     * @return
     *     possible object is
     *     {@link SingleResponseType.CertID }
     *     
     */
    public SingleResponseType.CertID getCertID() {
        return certID;
    }

    /**
     * Sets the value of the certID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleResponseType.CertID }
     *     
     */
    public void setCertID(SingleResponseType.CertID value) {
        this.certID = value;
    }

    /**
     * Gets the value of the certStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationResultType }
     *     
     */
    public VerificationResultType getCertStatus() {
        return certStatus;
    }

    /**
     * Sets the value of the certStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationResultType }
     *     
     */
    public void setCertStatus(VerificationResultType value) {
        this.certStatus = value;
    }

    /**
     * Gets the value of the thisUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThisUpdate() {
        return thisUpdate;
    }

    /**
     * Sets the value of the thisUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThisUpdate(XMLGregorianCalendar value) {
        this.thisUpdate = value;
    }

    /**
     * Gets the value of the nextUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextUpdate() {
        return nextUpdate;
    }

    /**
     * Sets the value of the nextUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextUpdate(XMLGregorianCalendar value) {
        this.nextUpdate = value;
    }

    /**
     * Gets the value of the singleExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getSingleExtensions() {
        return singleExtensions;
    }

    /**
     * Sets the value of the singleExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setSingleExtensions(ExtensionsType value) {
        this.singleExtensions = value;
    }


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
     *         &lt;element name="HashAlgorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *         &lt;element name="IssuerNameHash" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
     *         &lt;element name="IssuerKeyHash" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
     *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
        "hashAlgorithm",
        "issuerNameHash",
        "issuerKeyHash",
        "serialNumber"
    })
    public static class CertID {

        @XmlElement(name = "HashAlgorithm", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String hashAlgorithm;
        @XmlElement(name = "IssuerNameHash", required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] issuerNameHash;
        @XmlElement(name = "IssuerKeyHash", required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] issuerKeyHash;
        @XmlElement(name = "SerialNumber", required = true)
        protected BigInteger serialNumber;

        /**
         * Gets the value of the hashAlgorithm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHashAlgorithm() {
            return hashAlgorithm;
        }

        /**
         * Sets the value of the hashAlgorithm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHashAlgorithm(String value) {
            this.hashAlgorithm = value;
        }

        /**
         * Gets the value of the issuerNameHash property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getIssuerNameHash() {
            return issuerNameHash;
        }

        /**
         * Sets the value of the issuerNameHash property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuerNameHash(byte[] value) {
            this.issuerNameHash = value;
        }

        /**
         * Gets the value of the issuerKeyHash property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getIssuerKeyHash() {
            return issuerKeyHash;
        }

        /**
         * Sets the value of the issuerKeyHash property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuerKeyHash(byte[] value) {
            this.issuerKeyHash = value;
        }

        /**
         * Gets the value of the serialNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSerialNumber() {
            return serialNumber;
        }

        /**
         * Sets the value of the serialNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSerialNumber(BigInteger value) {
            this.serialNumber = value;
        }

    }

}
