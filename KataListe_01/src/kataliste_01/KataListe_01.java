package kataliste_01;

import java.util.ArrayList;
import java.util.List;

public class KataListe_01 {

    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        List<String> al2 = new ArrayList<String>();

        al.add("ahmet");
        al.add("mehmet");
        al.add("ali");
        al.add( "veli");
        System.out.println(al);
        System.out.println(al2);
        al2.addAll(al);
        System.out.println(al2);
        System.out.println("--------------------");
        al.remove("ali");
        System.out.println("Liste 1 :" + al);
        al2.remove(0);
        System.out.println("Liste 2 :" + al2);
        al2.removeAll(al);
        System.out.println("Liste 2 :" + al2);
    }

}
