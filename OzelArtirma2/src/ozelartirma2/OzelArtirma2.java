//impROS
//Ozel Artirma
package ozelartirma2;
public class OzelArtirma2 {
public static void main(String[] args) {
   int x=0;
   int y=1;
   int sonuc;
   //artirma veya azaltma solda olunca(++sayac) sorun yok ama sagda olunca(sayac++), oncelik her zaman baska islemde,sonrasÄ±nda artÄ±rmada oluyor
   sonuc=(x++) * (--y);//sayac1 de ozel artÄ±rma islemi sagda oldugu icin once isleme girer, sonra artar yani isleme 1 olarak girer,ama islemden 2 olarak cikar
   System.out.println("sayac1= "+x+" sayac2= "+y+" sonuc= "+sonuc);
   
   sonuc=(--x) * (y++);//burda da sagda olan artirma islemi sayac2++,o yuzden sayac2 once --sayac ile isleme girecek sonra da azalacak
   System.out.println("sayac1= "+x+" sayac2= "+y+" sonuc= "+sonuc);
    }
}
