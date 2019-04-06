package noktalamaısaretitemizle;

import java.util.Arrays;

public class NoktalamaIsaretiTemizle {

    public static void main(String[] args) {
        String strDeneme = "impROS. aa"
                + ",%+^'&+///?";
       String[] arrKelime = strDeneme.replaceAll("\\p{P}", "").split("\\s");
        System.out.println(Arrays.toString(arrKelime));
        for (String kelime : arrKelime) {
		System.out.println(kelime);
	}
        
        String cumle = "-Hangi takımı tutuyorsun?      "
			+ "-Beşiktaş(!) "
			+ "-Bir gün herkes      Beşiktaşlı olmasın; "
			+ "-Bırakın o ayrıcalık bizde kalsın... ";
	String[] kelimeler = cumle.replaceAll("\\p{P}", "").trim().split("\\s");
	for (String kelime : kelimeler) {
		System.out.println(kelime);
	}
    }

}
