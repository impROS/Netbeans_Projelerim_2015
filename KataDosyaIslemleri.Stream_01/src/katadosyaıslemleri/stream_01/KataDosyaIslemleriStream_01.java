package katadosyaıslemleri.stream_01;
import java.util.*;
import java.io.*;
public class KataDosyaIslemleriStream_01 {

    public static void main(String[] args)throws IOException  {
        System.out.println("----Dosya Okunuyor----");
byte[] veriler = new byte[10];
File binaryDosya = new File("resimOkunan.jpg");
FileInputStream binaryDosyaOkuyucu = new FileInputStream(binaryDosya);
BufferedInputStream tamponBinaryOkuyucu = new BufferedInputStream(binaryDosyaOkuyucu);
veriler = new byte[(int)binaryDosya.length()];
tamponBinaryOkuyucu.read(veriler, 0, veriler.length);
tamponBinaryOkuyucu.close();
System.out.println("----Dosya Okundu----");

//Yazma


binaryDosya = new File("resimYazilan.jpg");
System.out.println("----Dosya Yaziliyor----");
FileOutputStream binaryYazici = new FileOutputStream(binaryDosya);
BufferedOutputStream tamponBinaryYazici = new BufferedOutputStream(binaryYazici);

tamponBinaryYazici.write(veriler);
tamponBinaryYazici.close();
System.out.println("----Dosya Yazildı----");
    }

}
