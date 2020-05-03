
package de.gematik.ws.conn.encryptionservice.v6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionStepResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncryptionStepResultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncryptionStepResultEnum")
@XmlEnum
public enum EncryptionStepResultEnum {

    ERROR,
    OK;

    public String value() {
        return name();
    }

    public static EncryptionStepResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
