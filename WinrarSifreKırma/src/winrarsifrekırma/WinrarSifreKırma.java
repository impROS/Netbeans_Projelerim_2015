
package winrarsifrekırma;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WinrarSifreKırma {
 
    public static void main(String[] args) throws IOException {
        Scanner giris = new Scanner(System.in);
        System.out.println("Dosya Adini Giriniz");
        String rarAdi =giris.next()+".rar";
      int i=10000;  
      String str;
 for(int j=1;j<100;j++){
           
  File file =new File("D:\\Winrar\\sayi"+j+".bat");
   
        if (!file.exists()) {
            file.createNewFile();
        }
 
        FileWriter fileWriter = new FileWriter(file, false);
        try (BufferedWriter bWriter = new BufferedWriter(fileWriter)) {
     
              
                 //  str = i+"";
                     for( int k=i;k<i+10000;k++){
                          str = "Winrar -IBCK x -p0"+k+" -c- "+rarAdi+" -y";
                         
       bWriter.write(str);
             bWriter.newLine();
         }
                     i+=10000;
           
            }
           
        }
    }
    }
   
