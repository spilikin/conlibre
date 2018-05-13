package emu.softcard;

import junit.framework.TestCase;

import java.io.File;
import java.net.URL;
import java.security.Security;

public class TestSoftcard extends TestCase {
    @Override
    protected void setUp() {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
    }

    public void testCryproUtil() throws Exception {
        CryproUtil cryptoUtil = new CryproUtil();
        Object c1 = CryproUtil.readX509CertificateDER(new URL("file:./config/cards/smc-b_1/MF/DF.ESIGN/EF.C.HCI.AUT.R2048.cer"));
        Object c2 = CryproUtil.readX509CertificatePEM(new URL("file:./config/cards/smc-b_2/MF/DF.ESIGN/EF.C.HCI.AUT.R2048.cer.pem"));
        assertEquals(c1, c2);
        Object k1 = CryproUtil.readPrivateKeyDER(new URL("file:./config/cards/smc-b_1/MF/DF.ESIGN/PrK.HCI.AUT.R2048.key"));
        Object k2 = CryproUtil.readPrivateKeyPEM(new URL("file:./config/cards/smc-b_2/MF/DF.ESIGN/PrK.HCI.AUT.R2048.key.pem"));
        assertEquals(k1, k2);
    }

    public void testSoftcardLowLevel() throws Exception {
        Softcard smc_b_1 = new Softcard("smc_b_1");

        FolderObject df_esign = smc_b_1.root().mkdir("DF.ESIGN");

        assertTrue(smc_b_1.root().ls().contains(df_esign));
        smc_b_1.root().cd("DF.ESIGN").ls();

        FileSoftcardBuilder builder = new FileSoftcardBuilder();

        smc_b_1 = builder.build(new File("./config/cards/smc-b_1"));

        assertEquals("smc-b_1", smc_b_1.getName());
        assertFalse(smc_b_1.root().ls().isEmpty());
        assertFalse(smc_b_1.root().cd("DF.ESIGN").ls().isEmpty());
        assertNotNull(smc_b_1.root().cd("DF.ESIGN").get(PrivateKeyObject.class, "PrK.HCI.AUT.R2048"));
        assertNotNull(smc_b_1.root().cd("DF.ESIGN").get(X509CertificateObject.class, "EF.C.HCI.AUT.R2048"));

        Softcard smc_b_2 = builder.build(new File("./config/cards/smc-b_2/"));

        assertEquals("smc-b_2", smc_b_2.getName());
        assertFalse(smc_b_2.root().ls().isEmpty());
        assertFalse(smc_b_2.root().cd("DF.ESIGN").ls().isEmpty());
        assertNotNull(smc_b_2.root().cd("DF.ESIGN").get(PrivateKeyObject.class, "PrK.HCI.AUT.R2048"));
        assertNotNull(smc_b_2.root().cd("DF.ESIGN").get(X509CertificateObject.class, "EF.C.HCI.AUT.R2048"));

        PrivateKeyObject prk = smc_b_1.root().cd("DF.ESIGN").get(PrivateKeyObject.class, "PrK.HCI.AUT.R2048");
        byte[] bytes = smc_b_1.signPKCS1_V1_5(prk, new byte[64]);
    }
}