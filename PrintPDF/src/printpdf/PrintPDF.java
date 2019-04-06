
package printpdf;

import java.io.File;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;


public class PrintPDF {

 public static void printIt(String filePath) {
  try {
   PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
   DocPrintJob printJob = defaultPrintService.createPrintJob();
   PrintRequestAttributeSet as = new HashPrintRequestAttributeSet();
   File pdfFile = new File(filePath);
   SimpleDoc simpleDoc = new SimpleDoc(pdfFile.toURI().toURL(),DocFlavor.URL.AUTOSENSE, null);
   as.add(MediaSizeName.ISO_A4);
   printJob.print(simpleDoc, as);
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
 
 public static void main(String[] args) {
  printIt("test.pdf");
 }
}