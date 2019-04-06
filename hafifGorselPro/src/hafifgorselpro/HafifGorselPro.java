//impROS 
//Biraz gorsel program yapma
//program amacı dışardan girilen iki sayiyi toplamak
package hafifgorselpro;
import javax.swing.JOptionPane;  //JOptionPane  yi kutuphaneden çağırdık
public class HafifGorselPro {

    public static void main(String[] args)
    {
     String yazi1,yazi2; //string degerlerimizi tanimladik
     int sayi1,sayi2,toplam;//integer degerlerimizi tanimladik
     yazi1 = JOptionPane.showInputDialog( "İlk degeri giriniz" ); //inputbox acip kullanıcıdan yaziyi tanimladik
     sayi1 = Integer.parseInt( yazi1 ); //yazi degiskenimizi integer a cevirdik ki sayisal islemler yapabilelim
     yazi2 = JOptionPane.showInputDialog( "İkinci degeri giriniz" );//ikinci sayiyi istedik
     sayi2 = Integer.parseInt( yazi2 ); //yine donusturme yaptık
     toplam=sayi1+sayi2;//iki sayiyi topladik
     JOptionPane.showMessageDialog(null, "Girilen sayiların toplamı = "+toplam); //bunu outbox da gosterdik
     JOptionPane.showMessageDialog(null, "impROS"); //bu da benim lakap :D 
 
    }
    
}
