
package grafikcizim;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GrafikCizim {
static int veri1,veri2 ;
private static JButton buton;
    public static void main(String[] args) {
        //Class çağırma ve tanımlama
        GrafikCizelgesi grafik =new GrafikCizelgesi();
        Deneme1 d1 =new Deneme1();
        //Scanner ve değer giris
        GrafikCizim g1=new GrafikCizim();
        Scanner giris = new Scanner(System.in);
        System.out.println("Veri1 i giriniz");
        veri1=giris.nextInt();
        System.out.println("Veri2 yi giriniz");
        veri2=giris.nextInt();
        
       // Form oluşturma
       JFrame form1=new JFrame("Çizim Programı");
       form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       form1.getContentPane().setBackground(Color.YELLOW); 
//      buton =new JButton("Tamam");
//      buton.setBounds(60, 43, 100, 20);
   
       form1.pack();
       form1.setVisible(true);
       form1.setSize(500, 500);
       form1.setLocationRelativeTo(null);
     //  form1.add(grafik);
       
       
       /////Deneme1 Formu
   form1.add(grafik);
    }  

}
