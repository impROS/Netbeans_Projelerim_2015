
package grafik;
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
public class Grafik {

//Şimdi de  Ana class’ımızı oluşturuyoruz….

// ANA CLASS….

//gerekli kütüphaneleri yüklüyoruz
static int sayi1;

public static void main(String[] args){

    Scanner giris = new Scanner(System.in);
//sayi1=giris.nextInt();
// diğer class’tan nesne tanımlamak

Grafik2 nesne=new Grafik2();
Grafik3 nesne2=new Grafik3();
Grafil4 nesne3=new Grafil4();

//int sayi1=giris.nextInt();
//int sayi2=giris.nextInt();
Graphics g2 = null;
//nesne3.ciz(g2,sayi1, sayi2);
//Yeni bir frame penceresi tanımlamak

JFrame frame=new JFrame("Frame Adı");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
frame.setBackground(Color.red); //Arka plan rengi

//Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
final Toolkit toolkit = Toolkit.getDefaultToolkit();
    final Dimension screenSize = toolkit.getScreenSize();
    final int x = (screenSize.width - frame.getWidth()) / 2;
    final int y = (screenSize.height - frame.getHeight()) / 2;
    frame.setPreferredSize(new Dimension(x*2,y+(y-150)));
    frame.setLocation(0, 100);
     //Frame boyutu
frame.pack(); // Frame eklediğimiz tüm bu özlliklerin onayını sağlayan kod??

frame.setVisible(true); // Frameî etkinleştirme(bu değer False olursa görünmez)

//frame.add(nesne); // diğer class’taki çizimlerin Frame’e eklenmesi..
frame.add(nesne2); // diğer class’taki çizimlerin Frame’e eklenmesi..
 // diğer class’taki çizimlerin Frame’e eklenmesi..

//JFrame frame2=new JFrame("Frame 222Adı");
//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////
//frame2.setBackground(Color.red); //Arka plan rengi
//frame2.add(nesne3);
// frame.setPreferredSize(new Dimension(x*2,y+(y-150)));
//    frame.setLocation(0, 100);
//frame.pack();
//frame2.setVisible(true);
//bu bölümde çıkan frame ekranının özelliklerini belirliyoruz ve en son  frame.add(nesne);  ile Çizim classındaki tüm çizimleri bu frame aktarıyoruz….

}}