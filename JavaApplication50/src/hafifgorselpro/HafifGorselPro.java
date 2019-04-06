//impROS 
//Biraz gorsel program yapma
//program amaci disardan girilen iki sayiyi toplamak
package hafifgorselpro;
import javax.swing.JOptionPane;  //JOptionPane  yi kutuphaneden cagirdik
public class HafifGorselPro 
{//class parantezimizi actik

    public static void main(String[] args)
    {//main parantezimizi actik
     String yazi1,yazi2; //string degerlerimizi tanimladik
     double sayi1,sayi2,toplam;//integer degerlerimizi tanimladik
     yazi1 = JOptionPane.showInputDialog( "Ilk degeri giriniz" ); //inputbox acip kullanicidan yaziyi tanimladik
     sayi1 = Integer.parseInt( yazi1 ); //yazi degiskenimizi integer a cevirdik ki sayisal islemler yapabilelim
     yazi2 = JOptionPane.showInputDialog( "Ikinci degeri giriniz" );//ikinci sayiyi istedik
     sayi2 = Integer.parseInt( yazi2 ); //yine donusturme yaptik
     toplam=sayi1+sayi2;//iki sayiyi topladik
     JOptionPane.showMessageDialog(null, "Girilen sayilarin toplami = "+toplam); //bunu outbox da gosterdik
     JOptionPane.showMessageDialog(null, "impROS"); //bu da benim lakap :D 
 System.exit(0); //burda programin kapatilmasini sagladik
    }//main parantezimizi kapattik
    
}//class parantezimizi kapattik
