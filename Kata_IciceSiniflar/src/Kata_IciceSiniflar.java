


public class Kata_IciceSiniflar {

    void yaz(String strYazi) {
        System.out.println(strYazi);
    }
    void yaz(int sayi) {
        System.out.println(sayi);
    }

    class Hesaplama {

        int sonuc;

        class toplama {

            void topla(int sayi1, int sayi2) {
                sonuc = sayi1 + sayi2;
                yaz(sonuc);
            }
        }

        class cikarma {

            void cikar(int sayi1, int sayi2) {
                sonuc = sayi1 - sayi2;
                yaz(sonuc);
            }
        }

        protected class carpma {

            void carp(int sayi1, int sayi2) {
                sonuc = sayi1 * sayi2;
                yaz(sonuc);
            }
        }

        private class bolme {

            void bolme(int sayi1, int sayi2) {
                sonuc = sayi1 / sayi2;
                yaz(sonuc);
            }
        }

    }

    public static void main(String[] args) {
        Kata_IciceSiniflar ustSinif = new Kata_IciceSiniflar();
        ustSinif.new Hesaplama().new toplama().topla(4, 2);
        ustSinif.new Hesaplama().new cikarma().cikar(4, 2);
        ustSinif.new Hesaplama().new bolme().bolme(4, 2);
        ustSinif.new Hesaplama().new carpma().carp(4, 2);
    }

}
