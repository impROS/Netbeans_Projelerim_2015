package ikilik;

import java.util.Scanner;

public class Ikilik {

    public static void main(String[] args) {
        System.out.println("Basla");
        Scanner giris = new Scanner(System.in);
        int sayi1 = giris.nextInt();

        int kalan = 0;
        String ikilik = "";
        String yeniIkılık = "";
        while (true) {
                if (sayi1 == 1 ) {
                ikilik += 1;
                System.out.println("eklendi");
                break;
            }
            ikilik += sayi1 % 2 + "";
            System.out.println("İkilik"+ikilik);
            sayi1 = sayi1 / 2;
        
         
        }
        
           System.out.println("Eski : "+ikilik);
            for (int i = ikilik.length(); i > 0; i--) {
                yeniIkılık += ikilik.charAt(i-1);
            }
        System.out.println(sayi1 + " : " + yeniIkılık);
    }

}
