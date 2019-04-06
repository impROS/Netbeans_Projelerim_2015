
package resimyaziyazma;

import java.awt.AlphaComposite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class ResimYaziYazma {


public static void main(String[] args) throws Exception{
  Image image = new ImageIcon("3.png").getImage();
  BufferedImage bufferedImage = ImageIO.read(new File("3.png"));
  BufferedImage scaledBI = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g = scaledBI.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.drawImage(image, 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null);
        
           Font font= new Font("SansSerif ", Font.BOLD, 20);
           g.setFont(font);
        String yazi = "impROS";
        int genislik = (bufferedImage.getWidth()/2) -(yazi.length()*7);
        int yukseklik = bufferedImage.getHeight()/2;
        g.drawString(yazi, genislik, yukseklik);
        g.dispose();
        ImageIO.write(scaledBI, "jpg", new File("4 yazildi.jpg"));
 }
}

