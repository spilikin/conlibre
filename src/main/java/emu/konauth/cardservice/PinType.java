package emu.konauth.cardservice;

public enum PinType {
    PIN_CH("PIN.CH"), PIN_SMC("PIN.SMC");

    private String identifier;

    PinType(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }
}
