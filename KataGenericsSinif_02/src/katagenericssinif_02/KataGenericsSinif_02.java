package katagenericssinif_02;

public class KataGenericsSinif_02 {

    public static void main(String[] args) {
        GenericSinif<Integer> intNesnesi = new GenericSinif<>(10);
        GenericSinif<String> stringNesnesi = new GenericSinif<>(10);

        intNesnesi.ekle(1);
        intNesnesi.ekle(2);
        intNesnesi.ekle(3);

        intNesnesi.yazdir();

        intNesnesi.cikar(2);
        
        intNesnesi.yazdir();
        //////////////////
        stringNesnesi.ekle("bir");
        stringNesnesi.ekle("iki");
        stringNesnesi.ekle("uc");

        stringNesnesi.yazdir();

        stringNesnesi.cikar("bir");

        stringNesnesi.yazdir();

    }

}
