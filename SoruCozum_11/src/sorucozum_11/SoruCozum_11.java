package sorucozum_11;

import java.util.ArrayList;
import java.util.List;

public class SoruCozum_11 {

    public static void main(String[] args) {

        List<String> yasayanlar = new ArrayList<String>();
        List<String> olenler = new ArrayList<String>();

        for (int i = 1; i <= 100; i++) {
            yasayanlar.add("" + i);
        }
        System.out.println("Yasayanlar " + yasayanlar);

        while (yasayanlar.size() > 1) {
            for (int i = 1; i < yasayanlar.size(); i += 2) {
                try {
                    olenler.add(yasayanlar.get(i));
                    if (i == yasayanlar.size() - 2) {
                        olenler.add(yasayanlar.get(0));
                    }
                } catch (Exception ex) {
                    System.out.println("hata");

                }
            }

            System.out.println("Olenler" + olenler);
            yasayanlar.removeAll(olenler);
            System.out.println("Yasayanlar " + yasayanlar);
            olenler = new ArrayList<String>();;
        }
        System.out.println("Yasayanlar " + yasayanlar);

    }

}
