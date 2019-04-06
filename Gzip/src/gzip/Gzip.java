package gzip;

import java.io.*;
import java.util.zip.*;
import javax.swing.JOptionPane;

public class Gzip {

    public static int sChunk = 8192;

    public static void main(String[] args) {
        if (args.length != 1) {
            JOptionPane.showInputDialog(null, "Kullanim : java Gzip girisDosyasi");

        }
//cikti dosyasi olustur
        String zipName = args[0] + ".gz";
        
        GZIPOutputStream zipOut;
        try {
            FileOutputStream out = new FileOutputStream(zipName);
            zipOut = new GZIPOutputStream(out);
        } catch (IOException ex) {
            JOptionPane.showInputDialog(null, "Dosya Olusturma Hatasi : " + zipName + ".");
            return;
        }
        byte[] buffer = new byte[sChunk];
        //dosyayi sikistir
        try {
            try (FileInputStream in = new FileInputStream(args[0])) {
                int length;
                while ((length = in.read(buffer, 0, sChunk)) != -1) {
                    zipOut.write(buffer, 0, length);
                }
                System.out.println(" basarili");
            }
        } catch (IOException ex) {
            JOptionPane.showInputDialog(null, "Dosya Sikistirma Hatasi : " + args[0] + ".");
        }
        try {
            zipOut.close();
        } catch (IOException e) {
            System.out.println("Hata");
        }

    }
}
