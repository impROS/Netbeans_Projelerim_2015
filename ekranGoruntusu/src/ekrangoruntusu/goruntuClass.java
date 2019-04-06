
package ekrangoruntusu;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class goruntuClass extends KeyAdapter implements Runnable {
//    @Override
//    public void keyPressed(KeyEvent e) {
//        super.keyPressed(e); //
//        
//        switch(e.getKeyCode()){
//            case KeyEvent.VK_UP :
//               
//               //goruntuClass.capture("E:\\deneme\\"+s1+".jpg"); 
//
//               goruntuClass.capture("E:\\deneme\\"+fotoAd+".jpg"); 
//        }
//    }

    public  synchronized  static void capture(String saveDictionary) {
        try {

     // görüntünün alınacağı boyutları Toolkit yardımıyla alıyoruz.
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

     // BufferedImage ve Robot sınıfları yardımıyla ekran belirlediğimiz boyuta göre
     // ekran görüntüsünü alıyoruz. 
            BufferedImage capture = new Robot()
                    .createScreenCapture(new Rectangle(screenSize));

     // metoda gelen kayıt dizini için dosya oluşturup
            File yol = new File(saveDictionary);

     // klasör olup olmadığını kontrol ediyoruz
            if (!yol.isDirectory()) { // eğer klasör yoksa
                yol.mkdirs(); // klasörü oluşturuyoruz

            }

     // son olarak BufferedImage nesnesinde bulunan resmi ImageIO sınıfı
     // yardımıyla kayıt dizinine kaydediyoruz.
            ImageIO.write(capture, "jpg", yol);
        } catch (Exception e) {
        }
    }

    @Override
    public void run() {
        
    }
    
}
