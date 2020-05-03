
package de.gematik.ws.conn.encryptionservice.v6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonStepsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommonStepsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="EncryptXMLData"/&gt;
 *     &lt;enumeration value="DecryptXMLData"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommonStepsEnum")
@XmlEnum
public enum CommonStepsEnum {

    @XmlEnumValue("EncryptXMLData")
    ENCRYPT_XML_DATA("EncryptXMLData"),
    @XmlEnumValue("DecryptXMLData")
    DECRYPT_XML_DATA("DecryptXMLData");
    private final String value;

    CommonStepsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommonStepsEnum fromValue(String v) {
        for (CommonStepsEnum c: CommonStepsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
