package katagenericsozluk;
public class KataGenericSozluk {
public static void main(String[] args) {
        Sozluk<String, Integer> sozluk1 = new Sozluk<>();

        sozluk1.ekle("Ridvan", 44);
        sozluk1.ekle("Orhan", 55);
        sozluk1.ekle("Seyhmus", 66);

        sozluk1.yazdir();
        sozluk1.cikar("Ridvan");
        sozluk1.yazdir();

        System.out.println("Seyhmus un notu = " + sozluk1.getir("Seyhmus"));

        Sozluk<String, String> turingSozluk = new Sozluk<>();

        turingSozluk.ekle("Ev", "House");
        turingSozluk.ekle("Bilgisayar", "Computer");

        System.out.println("Ev = " + turingSozluk.getir("Ev"));
        System.out.println("Bilgisayar = " + turingSozluk.getir("Bilgisayar"));

        turingSozluk.yazdir();
    }
}
