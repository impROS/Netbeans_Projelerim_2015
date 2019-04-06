
package txtyazi;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class TxtYazi {

    public static void main(String[] args) throws IOException {
        Scanner giris = new Scanner(System.in);
        String yazi=giris.nextLine();
        while(yazi.equals("2"))
 DosyayaYaz(yazi);
    }
    static void DosyayaYaz(String yazi2) throws IOException{
        Scanner giris=new Scanner(System.in);
        String yol="K:\\deneme3.txt";
    FileWriter dosya = new FileWriter(yol);
        BufferedWriter yazici = new BufferedWriter(dosya);
                yazi2=giris.nextLine();
                yazici.write(yazi2);
                yazici.write(yazi2);
                  yazici.close();
}
  
             }
   
