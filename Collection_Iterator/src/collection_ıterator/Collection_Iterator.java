package collection_ıterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_Iterator {

    public static void main(String[] args) {
        String[] strDizi1 = {"imparator", "Ridvan", "Orhan", "Seyhmus", "Ridvan"};
        // HashSet<String> kume=new HashSet<String>();  //Sıralı olmadan ekler
        LinkedHashSet<String> kume = new LinkedHashSet<>(); //Sıralı olarak ekler

        for (String s : strDizi1) {
            if (kume.add(s)) {
                System.out.println(s + " Eklendi");
            } else {
                System.err.println(s + " Zaten var oldugu icin eklenemedi");
            }
        }
        System.out.println("----------------------------------");
        kume.stream().forEach((s) -> {  //for(String s:kume)
            System.out.println("" + s);
        });
        System.out.println("----ıterator ile------------");

        Iterator<String> iterator1 = kume.iterator();
        while (iterator1.hasNext()) {
            System.out.println("" + iterator1.next());
        }
        System.out.println(""+kume.contains("imparator"));
        System.out.println(""+kume.contains("Deneme"));
        System.out.println(""+kume.toString());
        Object[] objDizi1 = kume.toArray();
        System.out.println(Arrays.toString(objDizi1));

    }

}
