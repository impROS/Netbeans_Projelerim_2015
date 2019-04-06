
package privatedene;

import java.util.Scanner;

public class PrivateDene {

    public static void main(String[] args) {
 Scanner giris = new Scanner(System.in);
 System.out.println("cekeceginiz miktarı gir");
 Double cekilen2=giris.nextDouble();
 
 PrivateDeneme veri = new PrivateDeneme();
 double sayi2=veri.hesap2-4;
 System.out.println(veri.yeniBakiye(cekilen2));
    }
    
}
