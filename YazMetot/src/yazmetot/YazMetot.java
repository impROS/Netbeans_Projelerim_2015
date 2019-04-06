//impROS
package yazmetot;
public class YazMetot {
    public static void main(String[] args) {
        String stringDegisken = "impROS";
        int sayidegisken = 2;
        //metoda parametre yollama sekilleri
    yaz("impROS");
    yaz("impROS "+stringDegisken);
    yaz(stringDegisken);
    yaz(sayidegisken+"");//sayi degiskeninin yanina bos bir string degeri yazdırarak int degiskenini stringe cevirdik ve  ekranda yazmaya uygun hale geldi
    }
    
public static void yaz(String yazi){ //Yazma metodumuz
    System.out.println(yazi);
    }
}
//impROS