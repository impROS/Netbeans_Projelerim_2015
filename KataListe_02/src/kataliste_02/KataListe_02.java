package kataliste_02;

import java.util.ArrayList;
import java.util.List;

public class KataListe_02 {

    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        List<Integer> listInteger1 = new ArrayList<>();
        List<Integer> listInteger2 = new ArrayList<>();
        List<Integer> listInteger3 = new ArrayList<>();
        List<Boolean> listBoolean = new ArrayList<>();
//List<> ListBos = new ArrayList<>(); hata,<> kısmı bos

        listString.add("1");
        listString.add("1"); // Ayni elemani eklemeye izin verir
        listString.add(0, "3");//0.indexe yerlestirir
        listString.add("2" + 2 + "2");
        listString.add(null);

        System.out.println("ListeString = " + listString);

        listInteger1.add(1);
        listInteger1.add(2);
        listInteger1.add(3);

        System.out.println("ListeInteger =" + listInteger1);

        listInteger2.add(4);
        listInteger2.add(3);
        listInteger2.add(2);
        
        listInteger1.removeAll(listInteger2); // listeInteger1  fark listeInteger2
        
        System.out.println("Fark Sonucu(removeAll) ListInteger1 = "+listInteger1); 
        
        listInteger3.add(4);
        listInteger3.add(5);
        listInteger3.add(6);
        
        listInteger3.retainAll(listInteger2); //listInteger3 kesisim listInteger2
       
        System.out.println("Kesisim(retainAll) sonucu listInteger3 ="+listInteger3);
        
        listBoolean.add(Boolean.TRUE);
        listBoolean.add(true);
        
    }

}
/* Notlar 
 1.List koleksiyon yapısı ayni elemanların eklenmesine izin verir.
 2.List yapisinda elemanlar eklenme sirasına gore siralanir.
3.removeAll,parametre olarak verilen listedeki elemanlari,mevcut listeden cikarir
4.retainAll(hepsiniKoru),parametre olarak verilen listedeki elemanlarla,mevcut listedekilerle ayni olanları birakir sadece

 */
