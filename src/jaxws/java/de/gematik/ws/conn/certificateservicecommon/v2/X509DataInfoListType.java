
package de.gematik.ws.conn.certificateservicecommon.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for X509DataInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X509DataInfoListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X509DataInfo" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CertRef" type="{http://ws.gematik.de/conn/CertificateServiceCommon/v2.0}CertRefEnum"/&gt;
 *                   &lt;element name="X509Data" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="X509IssuerSerial"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="X509IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="X509SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="X509SubjectName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element ref="{http://ws.gematik.de/conn/CertificateServiceCommon/v2.0}X509Certificate"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X509DataInfoListType", propOrder = {
    "x509DataInfo"
})
public class X509DataInfoListType {

    @XmlElement(name = "X509DataInfo", required = true)
    protected List<X509DataInfoListType.X509DataInfo> x509DataInfo;

    /**
     * Gets the value of the x509DataInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x509DataInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX509DataInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link X509DataInfoListType.X509DataInfo }
     * 
     * 
     */
    public List<X509DataInfoListType.X509DataInfo> getX509DataInfo() {
        if (x509DataInfo == null) {
            x509DataInfo = new ArrayList<X509DataInfoListType.X509DataInfo>();
        }
        return this.x509DataInfo;
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
     *         &lt;element name="CertRef" type="{http://ws.gematik.de/conn/CertificateServiceCommon/v2.0}CertRefEnum"/&gt;
     *         &lt;element name="X509Data" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="X509IssuerSerial"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="X509IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="X509SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="X509SubjectName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element ref="{http://ws.gematik.de/conn/CertificateServiceCommon/v2.0}X509Certificate"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "certRef",
        "x509Data"
    })
    public static class X509DataInfo {

        @XmlElement(name = "CertRef", required = true)
        @XmlSchemaType(name = "token")
        protected CertRefEnum certRef;
        @XmlElement(name = "X509Data")
        protected X509DataInfoListType.X509DataInfo.X509Data x509Data;

        /**
         * Gets the value of the certRef property.
         * 
         * @return
         *     possible object is
         *     {@link CertRefEnum }
         *     
         */
        public CertRefEnum getCertRef() {
            return certRef;
        }

        /**
         * Sets the value of the certRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link CertRefEnum }
         *     
         */
        public void setCertRef(CertRefEnum value) {
            this.certRef = value;
        }

        /**
         * Gets the value of the x509Data property.
         * 
         * @return
         *     possible object is
         *     {@link X509DataInfoListType.X509DataInfo.X509Data }
         *     
         */
        public X509DataInfoListType.X509DataInfo.X509Data getX509Data() {
            return x509Data;
        }

        /**
         * Sets the value of the x509Data property.
         * 
         * @param value
         *     allowed object is
         *     {@link X509DataInfoListType.X509DataInfo.X509Data }
         *     
         */
        public void setX509Data(X509DataInfoListType.X509DataInfo.X509Data value) {
            this.x509Data = value;
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
         *         &lt;element name="X509IssuerSerial"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="X509IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="X509SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="X509SubjectName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element ref="{http://ws.gematik.de/conn/CertificateServiceCommon/v2.0}X509Certificate"/&gt;
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
            "x509IssuerSerial",
            "x509SubjectName",
            "x509Certificate"
        })
        public static class X509Data {

            @XmlElement(name = "X509IssuerSerial", required = true)
            protected X509DataInfoListType.X509DataInfo.X509Data.X509IssuerSerial x509IssuerSerial;
            @XmlElement(name = "X509SubjectName", required = true)
            protected String x509SubjectName;
            @XmlElement(name = "X509Certificate", required = true)
            protected byte[] x509Certificate;

            /**
             * Gets the value of the x509IssuerSerial property.
             * 
             * @return
             *     possible object is
             *     {@link X509DataInfoListType.X509DataInfo.X509Data.X509IssuerSerial }
             *     
             */
            public X509DataInfoListType.X509DataInfo.X509Data.X509IssuerSerial getX509IssuerSerial() {
                return x509IssuerSerial;
            }

            /**
             * Sets the value of the x509IssuerSerial property.
             * 
             * @param value
             *     allowed object is
             *     {@link X509DataInfoListType.X509DataInfo.X509Data.X509IssuerSerial }
             *     
             */
            public void setX509IssuerSerial(X509DataInfoListType.X509DataInfo.X509Data.X509IssuerSerial value) {
                this.x509IssuerSerial = value;
            }

            /**
             * Gets the value of the x509SubjectName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getX509SubjectName() {
                return x509SubjectName;
            }

            /**
             * Sets the value of the x509SubjectName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setX509SubjectName(String value) {
                this.x509SubjectName = value;
            }

            /**
             * Gets the value of the x509Certificate property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getX509Certificate() {
                return x509Certificate;
            }

            /**
             * Sets the value of the x509Certificate property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setX509Certificate(byte[] value) {
                this.x509Certificate = value;
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
             *         &lt;element name="X509IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="X509SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "x509IssuerName",
                "x509SerialNumber"
            })
            public static class X509IssuerSerial {

                @XmlElement(name = "X509IssuerName", required = true)
                protected String x509IssuerName;
                @XmlElement(name = "X509SerialNumber", required = true)
                protected String x509SerialNumber;

                /**
                 * Gets the value of the x509IssuerName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX509IssuerName() {
                    return x509IssuerName;
                }

                /**
                 * Sets the value of the x509IssuerName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX509IssuerName(String value) {
                    this.x509IssuerName = value;
                }

                /**
                 * Gets the value of the x509SerialNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX509SerialNumber() {
                    return x509SerialNumber;
                }

                /**
                 * Sets the value of the x509SerialNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX509SerialNumber(String value) {
                    this.x509SerialNumber = value;
                }

            }

        }

    }

}
