package emu.konauth;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;

import javax.crypto.Cipher;
import java.nio.charset.Charset;
import java.security.*;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }


    public void testPKCS1_SHA512() throws Exception {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());


        String message = "We wil signWithRSASSA_PKCS1_v1_5 you.";


        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048, new SecureRandom());
        KeyPair keyPair = keyGen.generateKeyPair();


        Signature signer = Signature.getInstance("SHA512withRSA");
        signer.initSign(keyPair.getPrivate());

        signer.update(message.getBytes(Charset.forName("UTF-8")));

        byte[] normalSignature = signer.sign();

        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        byte[] hash = sha512.digest(message.getBytes(Charset.forName("UTF-8")));

        DigestAlgorithmIdentifierFinder finder = new DefaultDigestAlgorithmIdentifierFinder();

        Cipher encCipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
        encCipher.init(Cipher.ENCRYPT_MODE, keyPair.getPrivate());

        DigestInfo digestInfo = new DigestInfo(finder.find("SHA-512"), hash);
        byte[] hashToEncrypt = digestInfo.getEncoded();

        byte[] manualSignature = encCipher.doFinal(hashToEncrypt);

        assertTrue(Arrays.equals(normalSignature, manualSignature));


        {
            Signature verifier = Signature.getInstance("SHA512withRSA");
            verifier.initVerify(keyPair.getPublic());

            verifier.update(message.getBytes(Charset.forName("UTF-8")));

            assertTrue(verifier.verify(normalSignature));
        }

        {
            Signature verifier = Signature.getInstance("SHA512withRSA");
            verifier.initVerify(keyPair.getPublic());

            verifier.update(message.getBytes(Charset.forName("UTF-8")));

            assertTrue(verifier.verify(manualSignature));
        }

        {
            Signature verifier = Signature.getInstance("SHA512withRSA");
            verifier.initVerify(keyPair.getPublic());

            verifier.update("different message".getBytes(Charset.forName("UTF-8")));

            assertFalse(verifier.verify(manualSignature));
        }

    }

    public void testPKCS1_SHA256() throws Exception {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());


        String message = "We wil signWithRSASSA_PKCS1_v1_5 you.";


        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048, new SecureRandom());
        KeyPair keyPair = keyGen.generateKeyPair();


        Signature signer = Signature.getInstance("SHA256withRSA");
        signer.initSign(keyPair.getPrivate());

        signer.update(message.getBytes(Charset.forName("UTF-8")));

        byte[] normalSignature = signer.sign();

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(message.getBytes(Charset.forName("UTF-8")));

        DigestAlgorithmIdentifierFinder finder = new DefaultDigestAlgorithmIdentifierFinder();

        Cipher encCipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
        encCipher.init(Cipher.ENCRYPT_MODE, keyPair.getPrivate());

        DigestInfo digestInfo = new DigestInfo(finder.find("SHA-256"), hash);
        byte[] hashToEncrypt = digestInfo.getEncoded();

        byte[] manualSignature = encCipher.doFinal(hashToEncrypt);

        assertTrue(Arrays.equals(normalSignature, manualSignature));

    }
}
