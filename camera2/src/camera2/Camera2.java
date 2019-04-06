package camera2;

import JMyron.JMyron;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;
import javax.swing.JComponent;
import javax.swing.JFrame;
import JMyron.*;
public class Camera2 {

    public static void main(String[] args) {

//initializer
        int width = 100;//insert your numbers here
        int height = 100;
        JMyron jmyron = new JMyron();
        jmyron.start(width, height);
//in a loop
        jmyron.update();
        int[] image = jmyron.image();

       
    }
    
     public static void saveJPG(Image img, String s)
      {
        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = bi.createGraphics();
        g2.drawImage(img, null, null);
       
        FileOutputStream out = null;
        try
        {
          out = new FileOutputStream(s);
        }
        catch (java.io.FileNotFoundException io)
        {
          System.out.println("File Not Found");
        }
       
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
        JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(bi);
        param.setQuality(0.5f,false);
        encoder.setJPEGEncodeParam(param);
       
        try
        {
          encoder.encode(bi);
          out.close();
        }
        catch (java.io.IOException io)
        {
          System.out.println("IOException");
        }
      }

}
	class VideoPane extends JComponent
	{
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
                @Override
		public void paint(Graphics g)
		{
			m.update();//update the camera view
			int[] img = m.image(); //get the normal image of the camera
			bi.setRGB(0,0,width,height,img,0,width);
			g.drawImage(bi, 0, 0, width, height, this);
		}
	}

