//impROS
package sorucozum33;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;

public class SoruCozum33 {

    static Dictionary<Integer, String[]> veritabani = new Hashtable<>();

    public static void main(String[] args) {

        int id1 = 001;
        String[] arrBilgiler1 = {"Ridvan", "Akar", "20"};
        veritabani.put(id1, arrBilgiler1);

        int id2 = 002;
        String[] arrBilgiler2 = {"Seymus", "Akar", "25"};
        veritabani.put(id2, arrBilgiler2);

    System.out.println("ID 002 : " + Arrays.toString(veritabani.get(002)));//002 li veri bilgilerini goster

        bilgiDegistir(002, "Seyhmus", "Akar", "24");//dikkat yas degisti

   System.out.println("Yeni Veritani ");
   System.out.println("ID 002 : " +Arrays.toString( veritabani.get(002)));//002 li veri bilgilerini goster

    }

    static void bilgiDegistir(int id, String ad, String soyAd, String yas) {
        String[] arrTemp = {ad, soyAd, yas};
        veritabani.put(id, arrTemp);
    }
    }
