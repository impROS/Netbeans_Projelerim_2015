package exe2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
public class Exe2 {
    public static void main(String[] args) throws IOException, InterruptedException {
SimpleDateFormat bicim3=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
GregorianCalendar gcalender=new GregorianCalendar();
String dateStart = bicim3.format(gcalender.getTime());
SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
yaz(dateStart);
       File dir=new File("D:\\Winrar"); 
        File f = new File("D:\\Winrar\\list.txt");
           Runtime rt = Runtime.getRuntime();
           TarihYaz();
           String dizin;
           yaz("Sifreler Deneniyor..");
      

           for(int i=0;i<100000;i++){
           dizin=listele(dir);
               Process pr = rt.exec("cmd.exe /c D:\\Winrar\\Winrar.exe  -IBCK x -p"+i+" -c- D:\\Winrar\\cikti.rar D:\\Winrar -y");
              pr.waitFor();
              listele(dir);
                  if(!dizin.equals(listele(dir))){
               yaz("Sifre Bulundu.Sifre ="+i);
               GregorianCalendar gcalender2=new GregorianCalendar();
               String dateStop = bicim3.format(gcalender2.getTime());
   yaz(dateStop);

 
		//HH converts hour in 24 hours format (0-23), day calculation
		
 
		Date d1 = null;
		Date d2 = null;
 
		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);
 
			//in milliseconds
			long diff = d2.getTime() - d1.getTime();
 
			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);
 System.out.print("Gecen Sure =");
			System.out.print(diffDays + " gun, ");
			System.out.print(diffHours + " saat, ");
			System.out.print(diffMinutes + " dakika, ");
			System.out.print(diffSeconds + " saniye.");
 
		} catch (Exception e) {
		}

               TarihYaz();
               System.exit(0);
               }
           }
           yaz("Sifre Bulunamadi");
           
    }
    public static void yaz(String yazi){
    System.out.println(yazi);
    }
     static String TarihYaz() {
   String veriler="D:\\Winrar\\sure.txt";
        try{
        SimpleDateFormat bicim3=new SimpleDateFormat("dd.M.yyyy hh:mm:ss");
GregorianCalendar gcalender=new GregorianCalendar();
String yazi2;
    yazi2 = bicim3.format(gcalender.getTime());
        BufferedWriter veriBag= new BufferedWriter(new FileWriter(veriler,true));
        veriBag.write(yazi2);
        veriBag.newLine();
        veriBag.close();
        }
        catch(IOException ex) {
        }
        return null;
}
         public static String listele(File dir){
    File[] list=dir.listFiles();       
    String dizin;
      dizin=list[0].getName();
    for(int i=1;i<list.length;i++){
      dizin+=list[i].getName();
    } 
        return dizin;
  }
}
