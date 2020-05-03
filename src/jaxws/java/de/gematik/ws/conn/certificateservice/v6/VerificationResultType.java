
package de.gematik.ws.conn.certificateservice.v6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VerificationResultType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="VALID"/&gt;
 *     &lt;enumeration value="INCONCLUSIVE"/&gt;
 *     &lt;enumeration value="INVALID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerificationResultType")
@XmlEnum
public enum VerificationResultType {

    VALID,
    INCONCLUSIVE,
    INVALID;

    public String value() {
        return name();
    }

    public static VerificationResultType fromValue(String v) {
        return valueOf(v);
    }

}
