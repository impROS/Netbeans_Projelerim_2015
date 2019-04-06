package usbpro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class dosyaZipleClass {

    private List<String> fileList;
    private static String OUTPUT_ZIP_FILE;
    private static String SOURCE_FOLDER = UsbPro.strKonakDosya; // SourceFolder path
    public static String strDosyaAdi;

    public dosyaZipleClass() {
        fileList = new ArrayList<>();
    }
    static dosyaZipleClass appZip = new dosyaZipleClass();

    public synchronized static void ziple() {
        Date simdikiZaman2 = new Date();
       // System.out.println(simdikiZaman2.toString());
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd-hh.mm.ss");
        strDosyaAdi = df.format(simdikiZaman2);
        System.out.println("StrDosya Adi : " + strDosyaAdi);
        OUTPUT_ZIP_FILE = UsbPro.strKonakDosya + "\\veri\\" + strDosyaAdi + ".zip";
        appZip.baslaZiple(OUTPUT_ZIP_FILE);
    }

    public void baslaZiple(String zipFile) {
        fileList.clear();
        appZip.generateFileList(new File(SOURCE_FOLDER));
        byte[] buffer = new byte[1024];
        String source = "";
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        try {
            try {
                source = SOURCE_FOLDER.substring(SOURCE_FOLDER.lastIndexOf("\\") + 1, SOURCE_FOLDER.length());
            } catch (Exception e) {
                source = SOURCE_FOLDER;
            }
            fos = new FileOutputStream(zipFile);
            zos = new ZipOutputStream(fos);

            System.out.println("Output to Zip : " + zipFile);
            FileInputStream in = null;

            for (String file : this.fileList) {
                System.out.println("File Added : " + file);
                System.out.println("File List : " + fileList);
                ZipEntry ze = new ZipEntry(source + File.separator + file);
                zos.putNextEntry(ze);
                try {
                    in = new FileInputStream(SOURCE_FOLDER + File.separator + file);
                    int len;
                    while ((len = in.read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }
                } finally {
                    in.close();

                }
            }
            UsbPro.dosyaSil(UsbPro.strKonakDosya);
            zos.closeEntry();
            zos.close();
           
            System.out.println("Folder successfully compressed");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                zos.close();
                fileList.clear();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void generateFileList(File node) {

        // add file only
        if (node.isFile()) {
            fileList.add(generateZipEntry(node.toString()));

        }

        if (node.isDirectory()) {
            String[] subNote = node.list();
            for (String filename : subNote) {
                generateFileList(new File(node, filename));
            }
        }

    }

    private String generateZipEntry(String file) {
        return file.substring(SOURCE_FOLDER.length() + 1, file.length());
    }
}
