
package dosyalamaıslemleri;
import static dosyalamaıslemleri.DosyalamaIslemleri.yaz;//onemli
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.IOException;
public class DosyaIslem {
    private String konum;
   
    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public DosyaIslem(String konum) {
        this.konum = konum;
   
    }
         public void dosyaBilgileriniVer() throws IOException{
         File dosya=new File(konum);
         if(dosya.exists()){
             
      yaz("Dosya da Klasor Bulundu");
        if(dosya.isFile()){
        yaz("Dosya dır");
        }
        if(dosya.isDirectory()){
        yaz("Klasordur");
        }
        yaz("Dosya adi ="+dosya.getName());
        yaz("Dosya Boyutu"+dosya.length()+" Byte dır");
        yaz("Dosya tam yol mudur ?"+dosya.isAbsolute());
        yaz("dosya klasor tam yolu-absolutepath"+dosya.getAbsolutePath());
        yaz("dosya  tam yolu-absoluteFile"+dosya.getAbsoluteFile());
        yaz("Dosyanın bulundugu klasor"+dosya.getParent());
        yaz("dosyanın bulundugu konum"+dosya.getParent());
             try {
                 yaz("dosya.getCanonicalFile()"+dosya.getCanonicalFile());
             } catch (IOException ex) {
                 Logger.getLogger(DosyaIslem.class.getName()).log(Level.SEVERE, null, ex);
             }
        yaz("dosya.canExecute()"+dosya.canExecute());
        yaz("dosya.toString()"+dosya.toString());
        yaz("dosya.canWrite()"+dosya.canWrite());
        yaz("dosya.getClass()"+dosya.getClass());
        yaz("dosya.getParentFile()"+dosya.getParentFile());
        yaz("getFreeSpace()"+dosya.getFreeSpace());
        yaz("dosya.getTotalSpace()"+dosya.getTotalSpace());
        yaz("getUsableSpace()"+dosya.getUsableSpace());
        yaz("dosya.isHidden()"+dosya.isHidden());
        yaz("dosya.lastModified()"+dosya.lastModified());
//        yaz("dosya.list()"+
         System.out.println("sadece ad dosya.list()"+Arrays.toString(dosya.list()));
        yaz("tam adres olarak veriyor dosya.listFiles("+Arrays.toString(dosya.listFiles()));//tam adres olarak veriyor
     //   yaz(dosya.renameTo("impROS.txt")+"");
        yaz("-------------------");
        yaz("okunabilir yap"+dosya.setReadable(true));
        yaz("yazılabilir yap"+dosya.setWritable(true));
        yaz("--------------------------");
   	 Process p = Runtime.getRuntime().exec("attrib -h -r -a -s " + dosya.getPath()+ " /S");
         //attrib komutları
//      ATTRIB [+R | -R] [+A | -A] [+S | -S] [+H | -H] [[drive:][path]filename] [/S]
//+ Sets an attribute.
//- Clears an attribute.
//R Read-only file attribute.
//A Archive file attribute.
//S System file attribute.
//H Hidden file attribute.
///S Processes files in all directories in the specified path.
//         }
         yaz("-------------------------");
         }
         else{
         yaz("Dosya da Klasor Bulunamadı");
         }
}
}