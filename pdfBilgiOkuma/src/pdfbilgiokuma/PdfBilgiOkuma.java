/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfbilgiokuma;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

/**
 *
 * @author x.impROS.x
 */
public class PdfBilgiOkuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String strPdfYol ="test5.pdf";
        pdfBilgiOku(strPdfYol);
        System.out.println("---------------");
          PDDocument document = PDDocument.load(new File(strPdfYol));
            PDDocumentInformation info = document.getDocumentInformation();
            info.setAuthor("impROS");
            info.setCreator("impROS");
            info.setTitle("impROS");
           // info.setTrapped("impROS");
            info.setSubject("impROS");
            info.setKeywords("impROS");
            info.getAuthor();
            document.close();
            pdfBilgiOku(strPdfYol);
            
    }
public static void pdfBilgiOku(String strPdf){
   
        try {
            PDDocument document = PDDocument.load(new File(strPdf));
            PDDocumentInformation info = document.getDocumentInformation();
            System.out.println("Page Count=" + document.getNumberOfPages());
            System.out.println("Title=" + info.getTitle());
            System.out.println("Author=" + info.getAuthor());
            System.out.println("Subject=" + info.getSubject());
            System.out.println("Keywords=" + info.getKeywords());
            System.out.println("Creator=" + info.getCreator());
            System.out.println("Producer=" + info.getProducer());
            
            
             DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        Calendar tarih = info.getCreationDate();
        Date zaman = tarih.getTime();
            System.out.println("Creation Date=" + zaman);
            System.out.println("Modification Date=" + info.getModificationDate());
            System.out.println("Trapped=" + info.getTrapped());
            document.close();
           
        } catch (IOException ex) {
            System.out.println("Hata");
        }
}
}
