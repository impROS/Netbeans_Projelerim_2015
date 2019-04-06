
package cizim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;


public class Grafik extends JLabel {

    public Grafik(String text) {
        super(text);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
   g.setColor(Color.BLUE);
   g.setFont(new Font("SansSerif",Font.BOLD,14));
   g.drawLine(0, 0, 50, 50);
   
    }
    
    
}
