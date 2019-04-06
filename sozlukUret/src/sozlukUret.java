
public class sozlukUret {

    public static void main(String args[]) {
        threadSozcukCevirVeYaz is1 = new threadSozcukCevirVeYaz("turkceList3-1.txt", "cevrilen1.txt", "hata1.txt");
        threadSozcukCevirVeYaz is2 = new threadSozcukCevirVeYaz("turkceList3-2.txt", "cevrilen2.txt", "hata2.txt");
        threadSozcukCevirVeYaz is3 = new threadSozcukCevirVeYaz("turkceList3-3.txt", "cevrilen3.txt", "hata3.txt");
        threadSozcukCevirVeYaz is4 = new threadSozcukCevirVeYaz("turkceList3-4.txt", "cevrilen4.txt", "hata4.txt");
        threadSozcukCevirVeYaz is5 = new threadSozcukCevirVeYaz("turkceList3-5.txt", "cevrilen5.txt", "hata5.txt");

        is1.start();
        is2.start();
        is3.start();
        is4.start();
        is5.start();
    }

}
