package hesaplama4;

public class Hesaplama4 {

    int sabit = 2;
    private int ozelsabit = 1;

    public static class Toplama4 { // Statik uye dahili sinif

        static int toplam; // dogru
        int sonuc; // dogru

        public int toplamaYap(int a, int b) {
// return (a+b) + sabit ; ! Hata !
            sonuc = toplam = a + b;
            return sonuc;
        }

        public void dekontOlustur() {
            /* -sabit- alanina ve
             -ekranaBas() yordamına ulasabilmek icin
             Hesaplama4 sinifina ait nesne olusturmamiz gerekir.
             */
            Hesaplama4 hs4 = new Hesaplama4(); //dikkat
            int a = hs4.ozelsabit; // dogru
            hs4.ekranaBas(); //dogru
            System.out.println("Dekont olusturuyor = "
                    + hs4.sabit + " - " + a);
        }
    } // class Toplama4

    public class Cikartma4 { //Uye dahili sinif

        int sonuc;
// static int sonuc1 ; // ! hata !

        public int cikartmaYap(int a, int b) {
            ekranaBas(); // dikkat
            sonuc = (a - b) - ozelsabit;
            return sonuc; // dikkat
        }
    } // class Cikartma4

    private void ekranaBas() {
        System.out.println("Hesaplama4.ekranaBas()");
    }

    public static void main(String args[]) {
// ! Hata !
// Hesaplama4.Toplama4 ht=new Hesaplama4().new Toplama4();
        Toplama4 tp4 = new Toplama4();
        tp4.dekontOlustur();
        int sonuc = tp4.toplamaYap(10, 5);
        System.out.println("Sonuc = 10 + 5 = " + sonuc);
        System.out.println("Hesaplama4Classi");
    }
} // class Hesaplama4

class Hesaplama4Kullan {

    public static void main(String args[]) {
// ! Hata !
// Hesaplama4.Toplama4 ht=new Hesaplama4().new Toplama4() ;
        Hesaplama4.Toplama4 tp4 = new Hesaplama4.Toplama4();
        int sonuc = tp4.toplamaYap(10, 5);
        System.out.println("Sonuc = 10 + 5 = " + sonuc);
        System.out.println("Hesaplama4KullanClassi");
    }
} // class Hesaplama4Kullan


//NOTLAR
/*
1.Run-Set Project Configuration-Customize-Main classın saginda browse diyip 
classı degistirebiliyoruz

*/