package soru2;

public class Soru2 {

    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int sonuc;
        sonuc = (++x) + 3 * (++y);
        System.out.println("Sonuc = " + sonuc + ",x = " + x + ",y= " + y);
        sonuc = (x--) + 3 * (y--);
        System.out.println("Sonuc = " + sonuc + ",x = " + x + ",y= " + y);
    }

}
