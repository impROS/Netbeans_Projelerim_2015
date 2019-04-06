package zekasorucozum;

import java.util.ArrayList;
import java.util.List;

public class ZekaSoruCozum {

    public static void main(String[] args) {
        int kilicli, olen, sayac = 0;

        List kisiler = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            kisiler.add(i);
        }
        System.out.println("" + kisiler.toString());
        kilicli = (int) kisiler.get(0);

        while (kisiler.size() != 1 || kisiler.size() != 0 || kisiler.size() != 2) {
            for (int k = 0; k < kisiler.size(); k++) {
                kilicli = (int) kisiler.get(k);
                System.out.println("kilicli=" + kilicli);
                olen = (int) kisiler.get(k + 1);
                System.out.println("olen=" + olen);
                if (k % 2 == 1) {
                    olen = (int) kisiler.get(k + 1);
                    try {
                        olen = (int) kisiler.get(k + 1);
                        kisiler.remove(k + 1);

                    } catch (Exception ex) {
                        kisiler.remove(0);
                        olen = (int) kisiler.get(0);
                        break;
                    }

                }
            }
            System.out.println("kalan=" + kisiler.toString());
        }
    }

}
