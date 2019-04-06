
package hatayakalama;

import java.util.Scanner;
public class HataYakalama {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        try
            {
                 int sayi1 = giris.nextByte();
    
            }
            catch(Exception hata){
                  System.out.println("Hata : " + hata.toString());
            }
    }
    
}
