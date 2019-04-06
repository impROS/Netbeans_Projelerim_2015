
package grafik;
import java.awt.*;

import javax.swing.*;
public class Grafik2 extends JComponent {

public Grafik2(){    }

@Override
public void paintComponent(Graphics g)    {

super.paintComponent(g);

//dikdörtgen dizimi

g.setColor(Color.red); //Şeklin rengini belirleme

g.fillRect(0, 0, 50,50);

// String değer yazdırma(Yazı yazma)

g.setColor(Color.black);

g.drawString("Örnek Uygulama",50,50);

//Daire veya oval cisim çizdirme

g.setColor(Color.green);

g.drawOval(100,100, 20, 20);

//Çizgi Çizdirme

g.setColor(Color.blue);

g.drawLine(0, 0, 44,44 );

//Burada fillRect ve drawRect komutları aynı işlemi görür..çizimlerde ikisinide kullanabiliriz

//Farkları fill komutunda çizilen şeklin iç bölgesi de alınır draw da ise sadece kenarlar alınır…

}
}