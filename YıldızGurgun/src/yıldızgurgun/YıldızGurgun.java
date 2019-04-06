
package yıldızgurgun;

import java.util.Scanner;


public class YıldızGurgun {

public static void main(String[] args) {
Scanner klv=new Scanner(System.in);
int yıldızSayi;
        System.out.println("Kac satırlık ucgen ıstıyorsunuz");
        yıldızSayi=klv.nextInt();
    for(int n=0;n<=yıldızSayi;n++){//bu dongu 0 dan baslayip yıldızSayisina kadar artaacak
 for(int k=0;k<=n;k++){//bu dongu n kadar yildiz yazacak
                System.out.print("*");
            }
       System.out.println("");// n kadar yıldız yazdıktan sonra bir alt satira gec
   }
    } 
