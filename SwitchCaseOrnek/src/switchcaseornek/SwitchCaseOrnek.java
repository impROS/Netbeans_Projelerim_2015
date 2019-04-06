//impROS
package switchcaseornek;
public class SwitchCaseOrnek {

    public static void main(String[] args) {
             String yazi = "impROS";

       switch(yazi.charAt(3)){//yazi adli String degiskenin 3.indexi aliyor.Program buna göre dallanacak.
           case 'i': System.out.println("i'yi sectiniz");
               break;//break komutu döngüyü durdurmaya yarar.Bunu yazmazsak alt satırları da okur.
           case 'm': System.out.println("m'yi sectiniz");
               break;
           case 'p': System.out.println("p'yi sectiniz");
               break;
           case 'R': System.out.println("R'yi sectiniz");
               break;
           case 'O': System.out.println("O'yu sectiniz");
               break;
           case 'S': System.out.println("S'yi sectiniz");
               break;
           default:System.out.println("Deger Araligi bulunamadi");//hiçbir aralik bulunmazsa default a gelir
    }
    }
}
