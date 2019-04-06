package pdfoku;

import java.io.File;
import java.util.Arrays;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PdfOku {

    public static void main(String[] args) {

        try {
            PDDocument document = null;
            document = PDDocument.load(new File("test4.pdf"));
            document.getClass();
            if (!document.isEncrypted()) {
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);
                PDFTextStripper Tstripper = new PDFTextStripper();
                String st = Tstripper.getText(document);
      
                System.out.println("------------");
                st = st.replace("Đ", "İ").replace("›", "ı").replace("¤", "g").replace("fl", "ş");

              System.out.println("PDF : " + st);
                System.out.println("----------");
            }
        } catch (Exception e) {
            System.err.println("Hata || " + e.getMessage());
        }

    }

    void filtre(String strTmp) {
        String[] arrSOzel = {"film"};
        if (strTmp.indexOf("fl") != -1) {
            String[] arrKelimeler = strTmp.split(" ");
            System.out.println("************" + Arrays.toString(arrKelimeler));
            for (String strKelime : arrKelimeler) {
                for (String strFiltre : arrSOzel) {
                    if (strKelime.indexOf(strFiltre) == -1) {
                        // System.out.println("***************"+strKelime+" "+strFiltre );
                        strTmp = strTmp.replace("fl", "ş");
                        //  System.out.println("*************** YEni : "+strKelime+" "+strFiltre );
                    }
                }
            }
        }
    }
}
