package dev.spilikin.conlibre.softcard;

import java.security.cert.X509Certificate;

public class X509CertificateObject extends SoftcardObject<X509Certificate> {

    public X509CertificateObject(String name, X509Certificate value) {
        super(name);
        setValue(value);
    }
}
