package pdftarayici;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import static pdftarayici.PdfInfoClass.arrBilgiler;

public class PdfTaraClass extends Thread {

    private File fileAranacakKlasor;
    private ArrayList<File> arrBulunanPdfler = new ArrayList<>();
    ArrayList<String> arrPdfDataVeriler = new ArrayList<>();

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        //<editor-fold defaultstate="collapsed" desc="Islemler">
        pdfBul(fileAranacakKlasor);

        arrBulunanPdfler.stream().forEach((File tarananPdf) -> {

            String strPdfIcerik = pdfOku(tarananPdf);

            byte ptext[] = strPdfIcerik.getBytes();
            try {
                strPdfIcerik = new String(ptext, "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                System.out.println("Cevirme Hatali");
            }

            strPdfIcerik = strPdfIcerik.toLowerCase().trim();
            strPdfIcerik = strPdfIcerik.replaceAll("\\p{P}", "").replaceAll("[^a-zA-Z]+", "");

            strPdfIcerik = strPdfIcerik.toLowerCase().trim();
            String[] arrPdfKelimeler = strPdfIcerik.split(" ");
            strPdfIcerik = "";
            LinkedList list = new LinkedList();
            for (String strKelime : arrPdfKelimeler) {
                list.add(strKelime);
                strPdfIcerik += strKelime;
            }

            PdfInfoClass pdfBilgileri = new PdfInfoClass();
            try {
                String strDosyaHash = tarananPdf.hashCode() + "";

                arrPdfDataVeriler.add(strDosyaHash);

                pdfBilgileri.pdfBilgi(tarananPdf);

                for (String tmpBilgi : arrBilgiler) {
                    // System.out.println("String : " + tmpBilgi);
                    if (tmpBilgi == null || tmpBilgi.isEmpty()) {
                        arrPdfDataVeriler.add("   -  ");
                        System.out.println("Girildi");
                    } else {
                        arrPdfDataVeriler.add(tmpBilgi);
                    }

                }
                arrPdfDataVeriler.add(strPdfIcerik);

                try {
                    kayitEkle(arrPdfDataVeriler);
                } catch (Exception e) {
                    System.out.println("Kayıt Eklenemedi " + e.getMessage());
                }

                arrPdfDataVeriler.clear();
            } catch (Exception ex) {
                System.out.println("Bilgi alırken hata" + ex.getMessage());
            }
            // System.out.println("Eklendi" + strPdfIcerik);
            // System.out.println(veritabani.oku(tarananPdf.getAbsolutePath()));;
        });
//</editor-fold>

        System.out.println("Bitti");
        long stop = System.currentTimeMillis();
        long duration = stop - start;
        long saniye = TimeUnit.MILLISECONDS.toSeconds(duration);
        long dakika = TimeUnit.MILLISECONDS.toMinutes(duration);
        long saat = TimeUnit.MILLISECONDS.toHours(duration);
        System.out.println("Geçen Sure :: " + saniye + " Saniye, " + dakika + " Dakika, " + saat + " Saat.");
    }

    public void kayitEkle(ArrayList<String> arrPdfBilgileri) {

        String hashCode = arrPdfBilgileri.get(0).replaceAll("\\p{P}", "");;
//        System.out.println("HashCode" + hashCode);

        String yazar = arrPdfBilgileri.get(1).replaceAll("\\p{P}", "");;
//        System.out.println("Yazar : " + yazar);

        String baslik = arrPdfBilgileri.get(2).replaceAll("\\p{P}", "");;
//        System.out.println("Baslik : " + baslik);

        String konu = arrPdfBilgileri.get(3).replaceAll("\\p{P}", "");;
//        System.out.println("Konu : " + konu);

        String anahtarKelime = arrPdfBilgileri.get(4).replaceAll("\\p{P}", "");;
//        System.out.println("Anahtar : " + anahtarKelime);

        String olusturan = arrPdfBilgileri.get(5).replaceAll("\\p{P}", "");;
//        System.out.println("Olusturan" + olusturan);

        String yapimci = arrPdfBilgileri.get(6).replaceAll("\\p{P}", "");;
//        System.out.println("Yapimci : " + yapimci);

        String olusturulmaTarihi = arrPdfBilgileri.get(7).replaceAll("\\p{P}", "");;
//        System.out.println("Olusturulma Tarihi : " + olusturulmaTarihi);

        String duzenlenmeTarihi = arrPdfBilgileri.get(8).replaceAll("\\p{P}", "");;
//        System.out.println("Duzenlenme Tarihi : " + duzenlenmeTarihi);

        String trapped = arrPdfBilgileri.get(9).replaceAll("\\p{P}", "");;
//       System.out.println("Trapped : " + trapped);

        String icerik = "\n" + arrPdfBilgileri.get(10).replaceAll("\\p{P}", "");
        System.out.println("İçerik Uzunluk : " + icerik.length());
        icerik = icerik.replaceAll("\\s", "");
        System.out.println("İçerik Uzunluk Yeni : " + icerik.length());
        icerik = icerik.replaceAll("[^a-zA-Z0-9]+", "");
        System.out.println("İçerik Uzunluk Yeni : " + icerik.length());
        icerik = icerik.replaceAll("[^a-zA-Z]+", "");
        System.out.println("İçerik Uzunluk Yeni : " + icerik.length());

        if (icerik.length() > 32000) {
            icerik = icerik.substring(0, 32000);
            System.out.println("İcerik Kucultuldu");
        }

        // String theString2 = IOUtils.toString(new FileInputStream(new File(rootDir + "/properties/filename.text")), "UTF-8");
        //String icerik ="impROS";
        //.replaceAll("̆", "").replace("&", "").replaceAll("|", "").replaceAll("́", "").replaceAll("'", "").replaceAll(",", "").replaceAll(".", "")
        //System.out.println("İcerik :"+icerik);
        System.out.println(hashCode + yazar + baslik + konu + anahtarKelime + olusturan + yapimci + olusturulmaTarihi + duzenlenmeTarihi + trapped);
        DerbyData derbyData = new DerbyData();
        derbyData.pdfBilgiEkle(hashCode, yazar, baslik, konu, anahtarKelime, olusturan, yapimci, olusturulmaTarihi, duzenlenmeTarihi, trapped, icerik);

    }

    public PdfTaraClass(String strAranacakKlasor) {
        fileAranacakKlasor = new File(strAranacakKlasor);
    }
    LinkedList<Integer> fileHashCode = new LinkedList<>();
    List<File> arrDosyalar = new ArrayList<>();

    public void pdfBul(File fileAranacakKlasor) {
        try {
            File[] pdfDizin = fileAranacakKlasor.listFiles();
            for (File klasoricindekiler : pdfDizin) {

                if (klasoricindekiler.isDirectory()) {
                    pdfBul(klasoricindekiler);
                } else {
                    if (klasoricindekiler.getName().toLowerCase().endsWith(".pdf")) {
                        arrBulunanPdfler.add(klasoricindekiler);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private String pdfOku(File tarananPdf) {
        String strPdfIcerik = "";
        try {
            PDDocument document = PDDocument.load(tarananPdf);

            if (!document.isEncrypted()) {
                PDFTextStripperByArea pdfAyirici = new PDFTextStripperByArea();
                pdfAyirici.setSortByPosition(true);
                PDFTextStripper textAyirici = new PDFTextStripper();
                strPdfIcerik = textAyirici.getText(document);

                strPdfIcerik = strPdfIcerik.replace("Đ", "İ").replace("›", "ı").replace("¤", "g").replace("fl", "ş");
                  document.close();
            }
          
        } catch (Exception e) {
            System.err.println("Hata || " + e.getMessage());
        }
        return strPdfIcerik;

    }

    public static void dosyaYaz(String strYazi) throws IOException {
        File dosya = new File("Dosya1.txt");

        if (!dosya.exists()) {
            dosya.createNewFile();
        }

        FileWriter dosyaYazici = new FileWriter(dosya, true);
        try (BufferedWriter tamponYazici = new BufferedWriter(dosyaYazici)) {
            tamponYazici.write(strYazi);
            tamponYazici.newLine();
        }
    }

    public static String dosyaOku(String strYol) throws IOException {
        File dosya = new File(strYol);
        FileReader dosyaOkuyucu = new FileReader(dosya);
        BufferedReader tamponOkuyucu = new BufferedReader(dosyaOkuyucu);
        String strYazi;
        String strIcerik = "";
        while ((strYazi = tamponOkuyucu.readLine()) != null) {
            strIcerik += strYazi;
        }
        return strIcerik;
    }

}
