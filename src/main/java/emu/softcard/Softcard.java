package emu.softcard;

import javax.crypto.Cipher;
import java.security.GeneralSecurityException;

public class Softcard {
    protected String name;
    protected FolderObject root = new FolderObject("MF");

    public Softcard(String name) {
        this.name = name;
    }

    public FolderObject root() {
        return root;
    }

    public String getName() {
        return name;
    }

    public byte[] signPKCS1_V1_5(PrivateKeyObject prk, byte[] dataToBeSigned) throws SoftcardException {
        // TODO: check Data length
        try {
            Cipher encCipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
            encCipher.init(Cipher.ENCRYPT_MODE, prk.getValue());
            return encCipher.doFinal(dataToBeSigned);
        } catch (GeneralSecurityException e) {
            throw new SoftcardException(e);
        }

    }

}
