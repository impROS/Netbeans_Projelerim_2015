package pdftarayici;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

public class PdfInfoClass {
//java.util.GregorianCalendar[time=1441348422000,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=unknown,offset=10800000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2015,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=247,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=33,SECOND=42,MILLISECOND=0,ZONE_OFFSET=10800000,DST_OFFSET=0]

    static ArrayList<String> arrBilgiler = new ArrayList<>();

    public ArrayList<String> pdfBilgi(File filename) {
      
        arrBilgiler.clear();
        try {

            PDDocument document = PDDocument.load(filename);
            PDDocumentInformation info = document.getDocumentInformation();
            //<editor-fold defaultstate="collapsed" desc="Bossa Eksi Degerini Ver">
      
//            if (info.getTitle() == null || info.getTitle().isEmpty()) {
//                arrBilgiler.add("   -  ");
//            } else {
//                arrBilgiler.add(filename.getName());
//            }
   
            if (info.getTitle() == null || info.getTitle().isEmpty()) {
                arrBilgiler.add("   -  ");
            } else {
                arrBilgiler.add(info.getTitle() + "");
            }
    
            if (info.getAuthor() == null || info.getAuthor().isEmpty()) {
                arrBilgiler.add("   -  ");
            } else {
                arrBilgiler.add(info.getAuthor() + "");
            }
           
            if (info.getSubject() == null || info.getSubject().isEmpty()) {
                arrBilgiler.add("   -  ");
            } else {
                arrBilgiler.add(info.getSubject() + "");
            }
         
            if (info.getKeywords() == null || info.getKeywords().isEmpty()) {
                arrBilgiler.add("   -  ");
            } else {
                arrBilgiler.add(info.getKeywords() + "");
            }
        
            if (info.getCreator() == null || info.getCreator().isEmpty()) {
                arrBilgiler.add("   -  ");
            } else {
                arrBilgiler.add(info.getCreator() + "");
            }
      
            if (info.getProducer() == null || info.getProducer().isEmpty()) {
                arrBilgiler.add("   -  ");
            } else {
                arrBilgiler.add(info.getProducer() + "");
            }
//</editor-fold>
            DateFormat df = df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            Calendar takvim;
            Date zaman;
            if (info.getModificationDate() == null) {
                arrBilgiler.add("0000/00/00 00:00:00");
            } else {

                takvim = info.getCreationDate();
                zaman = takvim.getTime();
             
                arrBilgiler.add(df.format(zaman));

            }

            if (info.getModificationDate() == null) {
                arrBilgiler.add("0000/00/00 00:00:00");
            
            } else {

                takvim = info.getModificationDate();
                zaman = takvim.getTime();
             
                arrBilgiler.add(df.format(zaman));
            

            }

            String strTrapped = info.getTrapped();
          
            if (info.getTrapped() == null || info.getTrapped().isEmpty()) {
                arrBilgiler.add("   -  ");
           
            } else {
                arrBilgiler.add(strTrapped);
             
            }

        } catch (IOException ex) {
            System.out.println("Tarama hata" + ex.getMessage());
        }

  
        return arrBilgiler;
    }
}
