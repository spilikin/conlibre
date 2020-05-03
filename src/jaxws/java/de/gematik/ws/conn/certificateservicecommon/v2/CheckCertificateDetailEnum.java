
package de.gematik.ws.conn.certificateservicecommon.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckCertificateDetailEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckCertificateDetailEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CERT_SIG_ERROR"/&gt;
 *     &lt;enumeration value="BUILD_CHAIN_FAILED"/&gt;
 *     &lt;enumeration value="CHECK_REVOCATION_FAILED"/&gt;
 *     &lt;enumeration value="CERT_REVOKED"/&gt;
 *     &lt;enumeration value="CERT_EXPIRED"/&gt;
 *     &lt;enumeration value="CERT_BAD_FORMAT"/&gt;
 *     &lt;enumeration value="POLICY_ERROR"/&gt;
 *     &lt;enumeration value="QC_STATEMENT_ERROR"/&gt;
 *     &lt;enumeration value="WRONG_ROLE"/&gt;
 *     &lt;enumeration value="UNKNOWN_CRITICAL_EXTENSIONS"/&gt;
 *     &lt;enumeration value="CERT_REVOKED_AFTER"/&gt;
 *     &lt;enumeration value="NO_REVOCATION_CHECK"/&gt;
 *     &lt;enumeration value="TSL_OUT_OF_DATE"/&gt;
 *     &lt;enumeration value="QUALIFIED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CheckCertificateDetailEnum")
@XmlEnum
public enum CheckCertificateDetailEnum {

    CERT_SIG_ERROR,
    BUILD_CHAIN_FAILED,
    CHECK_REVOCATION_FAILED,
    CERT_REVOKED,
    CERT_EXPIRED,
    CERT_BAD_FORMAT,
    POLICY_ERROR,
    QC_STATEMENT_ERROR,
    WRONG_ROLE,
    UNKNOWN_CRITICAL_EXTENSIONS,
    CERT_REVOKED_AFTER,
    NO_REVOCATION_CHECK,
    TSL_OUT_OF_DATE,
    QUALIFIED;

    public String value() {
        return name();
    }

    public static CheckCertificateDetailEnum fromValue(String v) {
        return valueOf(v);
    }

}
