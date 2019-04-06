package dosyamd5deneme;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class DosyaMd5Deneme {

    public static void main(String[] args) throws IOException {
        
        
        File dosya = new File("C:\\Users\\x.impROS.x\\Desktop\\Diğer 3\\tasarım\\1-Sayı Sistemleri.doc");
        
        //  File f = new File("TestHash.java");
        FileInputStream fis = new FileInputStream(dosya);
        CRC32 crcMaker = new CRC32();
        byte[] buffer = new byte[65536];
        int bytesRead;
        while((bytesRead = fis.read(buffer)) != -1) {
            crcMaker.update(buffer, 0, bytesRead);
        }
        long crc = crcMaker.getValue(); // This is your error checking code
        System.out.println("CRC code is " + crc);
        
        
        int strDosyaHash = dosya.hashCode();
        System.out.println(dosya.getName() + " || " + strDosyaHash);

        dosya = new File("E:\\FlashVeri\\dosya2.doc");
        strDosyaHash = dosya.hashCode();
        System.out.println(dosya.getName() + " || " + strDosyaHash);
        
        dosya = new File("E:\\FlashVeri\\dosya3.doc");
        strDosyaHash = dosya.hashCode();
        System.out.println(dosya.getName() + " || " + strDosyaHash);

    }

}
