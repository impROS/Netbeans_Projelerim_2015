
package simplecamera;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;
import javax.swing.JComponent;
import javax.swing.JFrame;
import JMyron.*;

public class SimpleCamera extends JFrame
{
	JMyron m;//a camera object
	int width = 320;
	int height = 240;
	VideoPane vp;
	int frameRate = 15; //fps

	public static void main(String[] args)
	{
		SimpleCamera sc = new SimpleCamera();
	}
		 
	public SimpleCamera()
	{
		setSize(width,height);
		m = new JMyron();//make a new instance of the object
		m.start(width,height);//start a capture at 320x240
		m.findGlobs(0);//disable the intelligence to speed up frame rate
		System.out.println("Myron " + m.version());
		
		vp = new VideoPane();
		getContentPane().add(vp);
		
		Timer videoTimer = new Timer(1000/frameRate, new ActionListener()
				{
					public void actionPerformed(ActionEvent evt)
					{
						vp.repaint();
					}

				});
		
		videoTimer.start();
		
		show();

	}
	 
	class VideoPane extends JComponent
	{
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
		public void paint(Graphics g)
		{
			m.update();//update the camera view
			int[] img = m.image(); //get the normal image of the camera
			bi.setRGB(0,0,width,height,img,0,width);
			g.drawImage(bi, 0, 0, width, height, this);
		}
	}
}
