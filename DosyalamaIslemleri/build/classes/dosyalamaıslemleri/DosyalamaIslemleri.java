
package dosyalamaıslemleri;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class DosyalamaIslemleri {

    public static void main(String[] args) throws IOException {
DosyaIslem di=new DosyaIslem("E:\\deneme\\");
di.dosyaBilgileriniVer();
String dir = "E:\\deneme";
String ext = ".rar";
findFiles(dir, ext);
//        try {
//            Process p = Runtime.getRuntime().exec("cmd /c start runas /user:domain\\administrator /savecred:\"E:\\deneme\\1.txt\" cmd");
//        } catch (IOException ex) {
//            System.out.println("Hata");
//        }
 
    }
    //<editor-fold defaultstate="collapsed" desc="Yazi Yazma Metodu">
        public static void yaz(String yazi){
        System.out.println(yazi);          
    }
        public static void yaz(int sayi){
        System.out.println(sayi);          
    }
//</editor-fold>
private static void findFiles(String dir, String ext) {
File file = new File(dir);
if(!file.exists()) System.out.println(dir + " Directory doesn't exists");
File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
if(listFiles.length ==0){
System.out.println(dir + "doesn't have any file with extension "+ext);
}else{
for(File f : listFiles)
System.out.println("File: "+dir+File.separator+f.getName());
}
}

//FileNameFilter implementation
public static class MyFileNameFilter implements FilenameFilter{

private final String ext;

public MyFileNameFilter(String ext){
this.ext = ext.toLowerCase();
}
@Override
public boolean accept(File dir, String name) {
return name.toLowerCase().endsWith(ext);
}

    
}
}
