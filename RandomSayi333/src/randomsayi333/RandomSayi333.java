
package randomsayi333;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RandomSayi333 {

    public static void main(String[] args)
    {
              List liste = new ArrayList();
       List yeniliste = new ArrayList();
        Scanner giris = new Scanner(System.in);
        int tahmin=50;
        int tahminalt=0;
        int tahminust=100;
           liste.add(tahmin);
        String karar,karar2;
        System.out.println(tahmin);
        karar=giris.next();
        int sayac=1;
        int sondanikincideger=0;
        int sayi2 = 100;
        int sayi3=100;
                int dizigenisligi = 0;
           while(!"e".equals(karar))      
        {
            sayac++;
            System.out.println("asagi mi yukari mi");
            karar2=giris.next();
        if("a".equals(karar2))
        {
                                dizigenisligi=(int)liste.size();
     sayi2=(int) liste.get(dizigenisligi-2);
            dizigenisligi=(int)liste.size();
        tahmin=(sayi2+tahmin)/2;
        liste.add(tahmin);
        tahminalt=tahmin;

        }
        else if("y".equals(karar2))
        {
    

             //System.out.println("dizi genisligi="+dizigenisligi);
        tahmin=(sayi2+tahmin)/2;
        liste.add(tahmin);
        tahminust=tahmin;
              dizigenisligi=(int)liste.size();
     sayi3=(int) liste.get(dizigenisligi-2);
        }
        
        System.out.println(tahmin);
        System.out.println("evet  mi hayir mi");
        karar=giris.next();
        }
               System.out.println("Tebrikler"+sayac+"defada bildim");
    }
    
}
