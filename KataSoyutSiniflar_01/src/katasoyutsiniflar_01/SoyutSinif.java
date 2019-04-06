package katasoyutsiniflar_01;

public abstract class SoyutSinif {

    public int alan1, alan2;

    public SoyutSinif(int alan1, int alan2) {
        this.alan1 = alan1;
        this.alan2 = alan2;

    }

    public abstract void soyutpublicVoid();

    abstract int soyutInt();

    abstract int soyutAlanHesapla(int alan1, int alan2);

    public void somutPublicVoid() {
        System.out.println("somutPublicVoid");
    }

}
