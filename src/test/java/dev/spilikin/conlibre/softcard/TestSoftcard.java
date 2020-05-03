package dev.spilikin.conlibre.softcard;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.net.URL;

public class TestSoftcard {

    @Test
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