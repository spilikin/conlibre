package emu.softcard;

import java.security.PrivateKey;

public class PrivateKeyObject extends SoftcardObject<PrivateKey> {

    public PrivateKeyObject(String name, PrivateKey value) {
        super(name);
        setValue(value);
    }
}
