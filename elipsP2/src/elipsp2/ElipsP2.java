package elipsp2;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.TexturePaint;
import javax.swing.event.*;
import java.awt.geom.*;
import java.net.URL;
import java.awt.image.*;
import java.util.*;

public class ElipsP2 extends JPanel {

    TexturePaint tp = getImageTexture("M101_galaksisi.jpg");

    public TexturePaint getImageTexture(String imageFile) {
        URL url = getClass().getResource(imageFile);
        Image img = getToolkit().getImage(url);
        try {
            MediaTracker tracker = new MediaTracker(this);
            tracker.addImage(img, 0);
            tracker.waitForID(0);
        } catch (Exception e) {
        }
        int width = img.getWidth(this);
        int height = img.getHeight(this);
        BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = buffImg.getGraphics();
        g.drawImage(img, 0, 0, this);
        Rectangle2D rect = new Rectangle(0, 0, width, height);
        return new TexturePaint(buffImg, rect);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(tp);
        g2.setFont(new Font("Serif", Font.BOLD, 24));
//g2.setColor(Color.RED);
//this.setBackground(new Color(255,255,255));
        Ellipse2D x = new Ellipse2D.Double(100, 225, 800, 500);
        g2.fill(x);
    }
}
