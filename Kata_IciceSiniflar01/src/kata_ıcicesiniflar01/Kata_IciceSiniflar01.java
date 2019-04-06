package kata_ıcicesiniflar01;

public class Kata_IciceSiniflar01 {

    void yaz(String strYazi) {
        System.out.println(strYazi);
    }

    void yaz(int sayi) {
        System.out.println(sayi);
    }
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

    public static void main(String[] args) {
        Kata_IciceSiniflar01 ustSinif = new Kata_IciceSiniflar01();
        ustSinif.new toplama().topla(4, 2);
        ustSinif.new cikarma().cikar(4, 2);
        ustSinif.new bolme().bolme(4, 2);
        ustSinif.new carpma().carp(4, 2);
    }

}
