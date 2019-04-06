package zipencrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.crypto.Cipher;

public class ZipEncrypt {

    private static PrivateKey privateKey;
    private static PublicKey publicKey;

    private static void directoryZip(ZipOutputStream out, File f, String base)
            throws Exception {
        if (f.isDirectory()) {
            File[] fl = f.listFiles();
            out.putNextEntry(new ZipEntry(base + "/"));
            if (base.length() == 0) {
                base = "";
            } else {
                base = base + "/";
            }
            for (int i = 0; i < fl.length; i++) {
                directoryZip(out, fl[i], base + fl[i].getName());
            }
        } else {
            out.putNextEntry(new ZipEntry(base));
            FileInputStream in = new FileInputStream(f);
            byte[] bb = new byte[2048];
            int aa = 0;
            while ((aa = in.read(bb)) != -1) {
                out.write(bb, 0, aa);
            }
            in.close();
        }
    }

    /**
     * archive
     */
    private static void fileZip(ZipOutputStream zos, File file)
            throws Exception {
        if (file.isFile()) {
            zos.putNextEntry(new ZipEntry(file.getName()));
            FileInputStream fis = new FileInputStream(file);
            byte[] bb = new byte[2048];
            int aa = 0;
            while ((aa = fis.read(bb)) != -1) {
                zos.write(bb, 0, aa);
            }
            fis.close();
            System.out.println(file.getName());
        } else {
            directoryZip(zos, file, "");
        }
    }

    /**
     * unarchive
     */
    private static void fileUnZip(ZipInputStream zis, File file)
            throws Exception {
        ZipEntry zip = zis.getNextEntry();
        if (zip == null) {
            return;
        }
        String name = zip.getName();
        File f = new File(file.getAbsolutePath() + "/" + name);
        if (zip.isDirectory()) {
            f.mkdirs();
            fileUnZip(zis, file);
        } else {
            f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f);
            byte b[] = new byte[2048];
            int aa = 0;
            while ((aa = zis.read(b)) != -1) {
                fos.write(b, 0, aa);
            }
            fos.close();
            fileUnZip(zis, file);
        }
    }

    /**
     * save as zipfile
     */
    private static void zip(String directory, String zipFile) {
        try {
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(
                    zipFile));
            fileZip(zos, new File(directory));
            zos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * save zipfile in a folder
     */
    private static void unZip(String directory, String zipFile) {
        try {
            ZipInputStream zis = new ZipInputStream(
                    new FileInputStream(zipFile));
            File f = new File(directory);
            f.mkdirs();
            fileUnZip(zis, f);
            zis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * get the key,which is saved as a file
     */
    public static Key getKey(String keyPath) throws Exception {
        Key key = null;
        FileInputStream fis = new FileInputStream(keyPath);
        ObjectInputStream ofs = new ObjectInputStream(fis);
        key = (Key) ofs.readObject();
        return key;
    }

    /**
     * add password to the file
     */
    private static void encrypt(String srcFile, String destFile, Key privateKey)
            throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        byte[] b = new byte[53];
        while (fis.read(b) != -1) {
            fos.write(cipher.doFinal(b));
        }
        fos.close();
        fis.close();
    }

    /**
     * remove password to the file
     */
    private static void decrypt(String srcFile, String destFile, Key privateKey)
            throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        byte[] b = new byte[64];
        while (fis.read(b) != -1) {
            fos.write(cipher.doFinal(b));
        }
        fos.close();
        fis.close();
    }

    /**
     * archive
     */
    public static void encryptZip(String srcFile, String destfile,
            String keyfile) throws Exception {
        SecureRandom sr = new SecureRandom();
        KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA");
        kg.initialize(512, sr);
        // generate key
        KeyPair kp = kg.generateKeyPair();
        // get privateKey
        ZipEncrypt.privateKey = kp.getPrivate();
        // get publicKey
        ZipEncrypt.publicKey = kp.getPublic();
        File f = new File(keyfile);
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream dos = new ObjectOutputStream(fos);
        dos.writeObject(ZipEncrypt.publicKey);

        File temp = new File(UUID.randomUUID().toString() + ".zip");
        temp.deleteOnExit();
        // archive
        zip(srcFile, temp.getAbsolutePath());
        // add privatekey
        encrypt(temp.getAbsolutePath(), destfile, privateKey);
        temp.delete();
    }

    /**
     * unzip
     */
    public static void decryptUnzip(String srcfile, String destfile,
            Key publicKey) throws Exception {
        // add public key
        File temp = new File(UUID.randomUUID().toString() + ".zip");
        temp.deleteOnExit();
        decrypt(srcfile, temp.getAbsolutePath(), publicKey);
        // unzip
        unZip(destfile, temp.getAbsolutePath());
        temp.delete();
    }

    public static void main(String args[]) throws Exception {
//		File f = new File(".");
        Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("./conf.properties");
//		prop.load(fis);
//		// input folder
//		String srcPath = prop.getProperty("SRC_PATH");
//		// output file
//		String destZip = prop.getProperty("DEST_FILE");
//		// output publickey
        //String keyfile = prop.getProperty("E:\\desktop.ini");
//		ZipEncrypt.encryptZip(srcPath, destZip, keyfile);
        //archive the parameters of encryptzip are input folder,output file,output keyfile 
       // ZipEncrypt.encryptZip("E:\\FlashVeri", "E:\\testcrypto.zip", "E:\\desktop2.ini");
		//unarchive
        ZipEncrypt.decryptUnzip("E:\\FlashVeri\\veri\\1.zip", "E:\\FlashVeri\\veri",ZipEncrypt.getKey("E:\\FlashVeri\\veri\\desktop.ini"));

    }
}
