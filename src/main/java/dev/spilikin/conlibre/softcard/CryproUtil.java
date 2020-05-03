package dev.spilikin.conlibre.softcard;

import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

import java.io.*;
import java.net.URL;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

public class CryproUtil {

    public static X509Certificate readX509CertificateDER(URL url) throws IOException {
        try {
            InputStream is = url.openStream();
            CertificateFactory fact = CertificateFactory.getInstance("X.509");
            return (X509Certificate) fact.generateCertificate(is);
        } catch (CertificateException e) {
            throw new RuntimeException("Cannot Create X.509 Factory. Major problem.", e);
        }
    }

    public static X509Certificate readX509CertificatePEM(URL url) throws IOException {
        PemReader reader = new PemReader(new InputStreamReader(url.openStream()));
        PemObject pemObject = reader.readPemObject();

        try {
            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
            return (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(pemObject.getContent()));
        } catch (CertificateException e) {
            throw new RuntimeException("Cannot Create X.509 Factory. Major problem.", e);
        }
    }


    public static PrivateKey readPrivateKeyDER(URL url) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        InputStream is = url.openStream();
        int len;
        byte[] bytes = new byte[1024];

        while ((len = is.read(bytes, 0, bytes.length)) != -1) {
            buffer.write(bytes, 0, len);
        }

        byte[] der = buffer.toByteArray();

        PKCS8EncodedKeySpec encodedKeySpec = new PKCS8EncodedKeySpec(der);
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePrivate(encodedKeySpec);
        } catch (InvalidKeySpecException e) {
            throw new IOException("Invalid key data", e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Cannot Create X.509 Factory. Major problem.", e);
        }
    }

    public static PrivateKey readPrivateKeyPEM(URL url) throws IOException {
        PemReader reader = new PemReader(new InputStreamReader(url.openStream()));
        PemObject pemObject = reader.readPemObject();

        final PKCS8EncodedKeySpec encodedKeySpec = new PKCS8EncodedKeySpec(pemObject.getContent());
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePrivate(encodedKeySpec);
        } catch (InvalidKeySpecException e) {
            throw new IOException("Invalid key data", e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Cannot Create X.509 Factory. Major problem.", e);
        }


    }

    public enum DigestAlgorithm {
        SHA256("SHA-256"), SHA384("SHA-384"), SHA512("SHA-512");
        private String algorithmName;

        DigestAlgorithm(String algorithmName) {
            this.algorithmName = algorithmName;
        }

        public String getAlgorithmName() {
            return algorithmName;
        }
    }

    public static byte[] prepareHash(DigestAlgorithm digestAlgorithm, byte[] hash) throws IOException {
        DigestAlgorithmIdentifierFinder finder = new DefaultDigestAlgorithmIdentifierFinder();

        String algorithm;


        DigestInfo digestInfo = new DigestInfo(finder.find(digestAlgorithm.getAlgorithmName()), hash);
        return digestInfo.getEncoded();
    }

}
