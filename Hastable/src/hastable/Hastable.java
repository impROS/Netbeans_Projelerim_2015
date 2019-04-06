package hastable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hastable {

    public static void main(String[] args) {
        String names[] = {"Merkur", "Venus", "Dunya"};
        int sayi[] = {1, 2, 3, 4};

        Hashtable hash = new Hashtable();

        for (int i = 1; i < 3; i++) {
            hash.put(sayi[i],names[i] );
        }

        for (int i = 1; i < 3; i++) {
            String strKelime =  ""+hash.get(names[i]);
            System.out.println("Kelime = " + strKelime);
        }
    }

}
