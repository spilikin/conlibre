
package de.gematik.ws.conn.certificateservicecommon.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertRefEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertRefEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="C.AUT"/&gt;
 *     &lt;enumeration value="C.ENC"/&gt;
 *     &lt;enumeration value="C.SIG"/&gt;
 *     &lt;enumeration value="C.QES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CertRefEnum")
@XmlEnum
public enum CertRefEnum {

    @XmlEnumValue("C.AUT")
    C_AUT("C.AUT"),
    @XmlEnumValue("C.ENC")
    C_ENC("C.ENC"),
    @XmlEnumValue("C.SIG")
    C_SIG("C.SIG"),
    @XmlEnumValue("C.QES")
    C_QES("C.QES");
    private final String value;

    CertRefEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CertRefEnum fromValue(String v) {
        for (CertRefEnum c: CertRefEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
