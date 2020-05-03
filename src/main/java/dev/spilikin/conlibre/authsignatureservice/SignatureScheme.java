package dev.spilikin.conlibre.authsignatureservice;

public enum SignatureScheme {
    RSASSA_PSS("RSASSA-PSS"),
    RSASSA_PKCS1_v1_5("RSASSA-PKCS1-v1_5");

    private String identifier;

    SignatureScheme(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
