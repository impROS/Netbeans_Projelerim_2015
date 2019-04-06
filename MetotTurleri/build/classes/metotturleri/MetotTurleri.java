
package metotturleri;
public class MetotTurleri {
    public static void main(String[] args) {
       KareKokHesapla1(1,2);//burda sadece metodu cagirdik, cunku geri kalan islemi kendi yapti 
int sonuc1= KareKokHesapla2(1,2);//burda metodun yolladigi cevabı "sonuc1"  adli hafizada tuttuk,sonra bunu ekranda yazdirdik.Yani cevabı o soyledi,islemi biz yaptik
       System.out.println("1 + 2 = "+sonuc1+"   -Bunu KareKokHesapla2 hesapladı,ama  Main Metodu yazdi-");
    }
    ////////////////////////////////////////////////////////
   static void KareKokHesapla1(int sayi1,int sayi2){//Deger Dondurmeyen Metot
    int sonuc = sayi1+sayi2;//cevabi hesapladi
  System.out.println(sayi1 + " + "+sayi2+" = "+sonuc+"   -Bunu KareKokHesapla2   Metodu hesapladi,ve yine kendisi yazdi-");
//Ama gerekli islemleri kendi yaptı,kendini cagiran metoda bir cevap yollamadi
    }
    ////////////////////////////////////////////////////////
   static int KareKokHesapla2(int sayi3,int sayi4){//Deger Donduren Metot
        return sayi3+sayi4;//degeri(yani cevabı) burdan,kendini cagıran metoda yolluyor
    }
    ////////////////////////////////////////////////////////
}
//impROS