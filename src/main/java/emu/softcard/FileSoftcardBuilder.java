package emu.softcard;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public class FileSoftcardBuilder {

    public FileSoftcardBuilder() {

    }

    public Softcard build(URL baseURL) throws IOException, URISyntaxException {
        // this will fail if URL is not file://
        return build(new File(baseURL.toURI()));
    }

    public Softcard build(File basedir) throws IOException {
        Softcard softcard = new Softcard(basedir.getName());
        scan(new File(basedir, "MF"), softcard.root());
        return softcard;
    }

    private void scan(File basedir, FolderObject folderObject) throws IOException {
        if (basedir.listFiles() == null) {
            return;
        }
        for (File f : basedir.listFiles()) {
            if (f.getName().startsWith(".")) {
                continue;
            }
            if (f.isDirectory()) {
                FolderObject subfolder = folderObject.mkdir(f.getName());
                scan(f, subfolder);
            } else if (f.getName().matches(".*\\.key$")) {
                PrivateKey privateKey = CryproUtil.readPrivateKeyDER(f.toURI().toURL());
                PrivateKeyObject object = new PrivateKeyObject(f.getName().replaceAll("\\.key$", ""), privateKey);
                folderObject.add(object);
            } else if (f.getName().matches(".*\\.key\\.pem$")) {
                PrivateKey privateKey = CryproUtil.readPrivateKeyPEM(f.toURI().toURL());
                PrivateKeyObject object = new PrivateKeyObject(f.getName().replaceAll("\\.key\\.pem$", ""), privateKey);
                folderObject.add(object);
            } else if (f.getName().matches(".*\\.cer$")) {
                X509Certificate cert = CryproUtil.readX509CertificateDER(f.toURI().toURL());
                X509CertificateObject object = new X509CertificateObject(f.getName().replaceAll("\\.cer$", ""), cert);
                folderObject.add(object);
            } else if (f.getName().matches(".*\\.cer\\.pem$")) {
                X509Certificate cert = CryproUtil.readX509CertificateDER(f.toURI().toURL());
                X509CertificateObject object = new X509CertificateObject(f.getName().replaceAll("\\.cer\\.pem$", ""), cert);
                folderObject.add(object);
            }
        }
    }
}
