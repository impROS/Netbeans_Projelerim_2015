package tesffilethash;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;

public class TesfFiletHash {

    public static void main(String[] args) {//249856

        File f = new File("E:\\13 Ekim Salı\\28 Ağustos 2015\\14 Ağustos\\MULTIBOOT_V2 izmirteknikdestek.com.0.rar");
        System.out.println(f.length());
    }

    static long getCRCCode(String strFile) {
        try {
            File f = new File(strFile);
            FileInputStream fis = new FileInputStream(f);
            CRC32 crcMaker = new CRC32();
            byte[] buffer = new byte[65536];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                crcMaker.update(buffer, 0, bytesRead);
            }
            long crc = crcMaker.getValue(); 
            return crc;
        } catch (IOException ex) {
            System.err.println("Hata || " + ex.getMessage());
            return 0;
        }
    }

}
