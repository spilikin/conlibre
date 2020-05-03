
package de.gematik.ws.conn.certificateservice.v6;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.gematik.ws.conn.certificateservice.v6 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gematik.ws.conn.certificateservice.v6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadCardCertificate }
     * 
     */
    public ReadCardCertificate createReadCardCertificate() {
        return new ReadCardCertificate();
    }

    /**
     * Create an instance of {@link VerifyCertificateResponse }
     * 
     */
    public VerifyCertificateResponse createVerifyCertificateResponse() {
        return new VerifyCertificateResponse();
    }

    /**
     * Create an instance of {@link CheckCertificateExpiration }
     * 
     */
    public CheckCertificateExpiration createCheckCertificateExpiration() {
        return new CheckCertificateExpiration();
    }

    /**
     * Create an instance of {@link CheckCertificateExpirationResponse }
     * 
     */
    public CheckCertificateExpirationResponse createCheckCertificateExpirationResponse() {
        return new CheckCertificateExpirationResponse();
    }

    /**
     * Create an instance of {@link CertificateExpirationType }
     * 
     */
    public CertificateExpirationType createCertificateExpirationType() {
        return new CertificateExpirationType();
    }

    /**
     * Create an instance of {@link ReadCardCertificate.CertRefList }
     * 
     */
    public ReadCardCertificate.CertRefList createReadCardCertificateCertRefList() {
        return new ReadCardCertificate.CertRefList();
    }

    /**
     * Create an instance of {@link ReadCardCertificateResponse }
     * 
     */
    public ReadCardCertificateResponse createReadCardCertificateResponse() {
        return new ReadCardCertificateResponse();
    }

    /**
     * Create an instance of {@link VerifyCertificate }
     * 
     */
    public VerifyCertificate createVerifyCertificate() {
        return new VerifyCertificate();
    }

    /**
     * Create an instance of {@link VerifyCertificateResponse.VerificationStatus }
     * 
     */
    public VerifyCertificateResponse.VerificationStatus createVerifyCertificateResponseVerificationStatus() {
        return new VerifyCertificateResponse.VerificationStatus();
    }

    /**
     * Create an instance of {@link VerifyCertificateResponse.RoleList }
     * 
     */
    public VerifyCertificateResponse.RoleList createVerifyCertificateResponseRoleList() {
        return new VerifyCertificateResponse.RoleList();
    }

}
