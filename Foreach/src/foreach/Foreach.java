
package foreach;

import java.util.ArrayList;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
List<Integer> sayilar = new ArrayList<>();
            sayilar.add(1);
            sayilar.add(2);
            sayilar.add(3);
            sayilar.add(4);
            sayilar.add(5);
        //
            sayilar.stream().forEach((i) -> {
                System.out.println(i);
        });
                       for(int i : sayilar){
                  System.out.println(i);
            }
    }
    
}
