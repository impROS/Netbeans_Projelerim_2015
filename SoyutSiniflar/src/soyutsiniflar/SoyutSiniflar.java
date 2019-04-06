
package soyutsiniflar;

public class SoyutSiniflar extends SoyutSinif {
public static SoyutSiniflar s1=new SoyutSiniflar();
    public static void main(String[] args) {
s1.alanHesapla();
    }

   
    @Override//Soyut sinifimizdan extends ettigimiz alanHesapla metodunu override etmek zorundayız
    public  void alanHesapla() {
        System.out.println("Alan Hesap adlı soyut sınıf kullanıldı");
    }
   
}
