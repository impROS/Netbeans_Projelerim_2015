package kopyalama2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.Date;

public class Kopyalama2 {

    public static void main(String[] args) throws IOException {
        File kaynak = new File("E:\\deneme.mp4");
        File hedef = new File("g:\\deneme333.mp4");

        copyFile1(kaynak, hedef);
    //  copyFile2(kaynak, hedef);
    }
    static Date date = new Date();

    public static void copyFile1(File from, File to) throws IOException {

        if (to.exists() && to.length() == from.length()) {
            System.out.println("Dosya Zaten Var");
            System.out.println("to : " + to.length());
            System.out.println("from : " + to.length());

        } else {
            Files.copy(from.toPath(), to.toPath());
            System.out.println("basarili");
            System.out.println("to : " + to.length());
            System.out.println("from : " + to.length());
        }
    }
    static byte[] veriler;

    static byte[] binaryOku(File dosya) throws IOException {

        FileInputStream binaryOku = new FileInputStream(dosya);
        BufferedInputStream binaryTampon = new BufferedInputStream(binaryOku);
        veriler = new byte[(int) dosya.length()];
        binaryTampon.read(veriler, 0, veriler.length);
        binaryTampon.close();
        for (byte veri : veriler) {
            //System.out.println(veri);
        }
        return veriler;
    }

    public static void copyFile2(File sourceFile, File destFile) throws IOException {
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        } finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
    }

}
