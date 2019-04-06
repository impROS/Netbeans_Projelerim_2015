
package enbuyukv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnBuyukv2 {


    public static void main(String[] args) {
  Scanner giris = new Scanner(System.in);
       List liste = new ArrayList();
       List yeniliste = new ArrayList();
       System.out.println("Kac elemanlı bir dizi istiyorsunuz?");
int kactane=giris.nextInt();
      int sayac = 0;
      int sayac2 =1;
while(sayac!=kactane)
{
    System.out.println(sayac2+". Sayiyi Giriniz");
    int sayi1=giris.nextInt();
liste.add(sayi1);
sayac++;
sayac2++;
}

int enbuyuk;
int dizigenisligi=(int) liste.size();

while(dizigenisligi!=0)
{
  int i=1;  
  enbuyuk=(int) liste.get(0);
while(i!=dizigenisligi)
{
    int sayi2=(int) liste.get(i);
    
while(enbuyuk<sayi2)
{
    enbuyuk=sayi2;
}

i++;

}
int sayiindexi=liste.indexOf(enbuyuk);
liste.remove(sayiindexi);
yeniliste.add(enbuyuk);
     
        dizigenisligi=(int)liste.size();
   }
dizigenisligi=(int)liste.size();
 //System.out.println(dizigenisligi);
  System.out.println(yeniliste);
     //  System.out.println(liste);
    }
}
