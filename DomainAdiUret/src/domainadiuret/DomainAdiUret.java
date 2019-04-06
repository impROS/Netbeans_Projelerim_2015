package domainadiuret;

public class DomainAdiUret {

    public static void main(String[] args) {
String[] kelimeler ={"yazilim","bank","bankasi","code","kod","soft"};
        domaninUret(kelimeler);
    }

    public static void domaninUret(String[] strKelimeler){
        for (int i = 0; i < strKelimeler.length; i++) {
        for (int j = 0; j < strKelimeler.length; j++) {
            for (int k = 1; k < 3; k++) {
                if(k==1){
                 System.out.println(strKelimeler[i]+strKelimeler[j]+".com");
                }
                else if(k==2){
                 System.out.println(strKelimeler[i]+strKelimeler[j]+".net");
                }
            }
            
            
        }
        }
    }
}
