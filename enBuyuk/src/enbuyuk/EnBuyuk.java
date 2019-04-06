//impROS

package enbuyuk;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EnBuyuk 
{

    public static void main(String[] args)
   {
       Scanner giris = new Scanner(System.in);
       List liste = new ArrayList();
       List yeniliste = new ArrayList();
       
int kactane=giris.nextInt();
      int sayac = 0;
      
while(sayac!=kactane)
{
    int sayi1=giris.nextInt();
liste.add(sayi1);
sayac++;
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
 System.out.println(dizigenisligi);
  System.out.println(yeniliste);
       System.out.println(liste);
    }
    
}
