package katasoyutsiniflar_01;

public class KataSoyutSiniflar_01 extends SoyutSinif {

    public static void main(String[] args) {
        //SoyutSinif soyutSinif =  new SoyutSinif(); //soyut siniftan nesne uretilmez
        KataSoyutSiniflar_01 altSinif = new KataSoyutSiniflar_01(5, 2);
        System.out.println("alan1 ve alan2 " + altSinif.alan1 + " " + altSinif.alan2);
        altSinif.somutPublicVoid();
    }

    public KataSoyutSiniflar_01(int alan1, int alan2) { //soyut yapiciyi da implements etmek zorundayız
        super(alan1, alan2);
    }

    @Override
    public void soyutpublicVoid() {

    }

    @Override
    int soyutInt() {
        return 2;
    }

    @Override
    int soyutAlanHesapla(int alan1, int alan2) {
        return alan1 * alan2;
    }

}
