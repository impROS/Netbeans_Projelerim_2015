
package mesajkutusu;
import javax.swing.JOptionPane;  

public class MesajKutusu {

    public static void main(String[] args) 
    {
        String yazi1,yazi2;
        int sayi1,sayi2,toplam,fark,bolum,carpim;
        yazi1 = JOptionPane.showInputDialog( "İlk degeri giriniz" );
        sayi1 = Integer.parseInt( yazi1 );  
         yazi2 = JOptionPane.showInputDialog( "İkinci degeri giriniz" );
        sayi2 = Integer.parseInt( yazi2 );   
        toplam=sayi1+sayi2;
        fark=sayi1-sayi2;
        carpim=sayi1*sayi2;
        bolum=sayi1/sayi2;
JOptionPane.showMessageDialog(null, "Girilen sayiların toplamı = " +toplam,"Toplam",JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null, "Girilen sayiların farkı = "+fark,"Fark",JOptionPane.WARNING_MESSAGE);
JOptionPane.showMessageDialog(null, "Girilen sayiların carpımı = "+carpim,"Carpim",JOptionPane.QUESTION_MESSAGE);
JOptionPane.showMessageDialog(null, "Girilen sayiların bolum = "+bolum,"Bolum",JOptionPane.ERROR_MESSAGE);
System.exit(0); 
    }
    
}
