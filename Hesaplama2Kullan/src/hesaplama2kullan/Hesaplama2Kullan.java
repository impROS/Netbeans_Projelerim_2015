package hesaplama2kullan;

class Hesaplama2 {

    public class Toplama2 { // Dahili uye sinif - public

        public int toplamaYap(int a, int b) {
            return a + b;
        }
    } // class Toplama2

    protected class Cikartma2 { // Dahili uye sinif - protected

        public int cikartmaYap(int a, int b) {
            return a - b;
        }
    } // class Cikartma2

    class Carpma2 { // Dahili uye sinif - friendly

        public int carpmaYap(int a, int b) {
            return a * b;
        }
    } // class Carpma2

    private class Bolme2 { // Dahili uye sinif - private

        public int bolmeYap(int a, int b) {
            return a / b;
        }
    } // class Bolme2
} // class Hesaplama2

public class Hesaplama2Kullan {

    public static void main(String args[]) {
        Hesaplama2.Toplama2 ht = new Hesaplama2().new Toplama2();
        Hesaplama2.Cikartma2 hck = new Hesaplama2().new Cikartma2();
        Hesaplama2.Carpma2 hcp = new Hesaplama2().new Carpma2();
// Hesaplama2.Bolme3 hb = new Hesaplama2().new Bolme2() ;
// ! Hata !
        int sonuc1 = ht.toplamaYap(10, 5);
        int sonuc2 = hck.cikartmaYap(10, 5);
        int sonuc3 = hcp.carpmaYap(10, 5);
// int sonuc4 = hb.bolmeYap(10,5); // ! Hata !
        System.out.println("Toplama Sonuc = " + sonuc1);
        System.out.println("Cikartma Sonuc = " + sonuc2);
        System.out.println("Carpma Sonuc = " + sonuc3);
    }
}
