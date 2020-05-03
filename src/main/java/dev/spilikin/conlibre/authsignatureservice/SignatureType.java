package dev.spilikin.conlibre.authsignatureservice;

public enum SignatureType {
    PKCS1("urn:ietf:rfc:3447");

    private String identifier;

    SignatureType(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
