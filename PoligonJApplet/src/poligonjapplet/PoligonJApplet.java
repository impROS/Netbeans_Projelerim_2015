
package poligonjapplet;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JApplet;
import javax.swing.JFrame;
import static poligonjapplet.PoligonJApplet.main;
import sun.applet.Main;
import static sun.applet.Main.main;

public class PoligonJApplet extends JApplet {

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
          Polygon p = new Polygon();
      for (int i = 0; i < 5; i++)
      p.addPoint((int) 
      (100 + 50 * Math.cos(i * 2 * Math.PI / 5)),
      (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 5)));
      g.drawPolygon(p);
    }
    

   public static void main(String[] args) {
JFrame frame = new JFrame();
      frame.setTitle("Polygon");
      frame.setSize(350, 250);
      frame.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      Container contentPane = frame.getContentPane();
     // contentPane.add;
      frame.setVisible(true);
   }
}