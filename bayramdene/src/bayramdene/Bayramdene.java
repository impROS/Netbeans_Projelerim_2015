
package bayramdene;

import java.util.Scanner;
public class Bayramdene {
    public static void main(String[] args) {
   Scanner giris = new Scanner(System.in);
        String cevap = giris.next();
        while(!cevap.equalsIgnoreCase("E")){
        System.out.println("CEVABINIZ ="+cevap);
        cevap=giris.next();
        }
    }
    
}
