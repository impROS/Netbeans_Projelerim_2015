
package grafik;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;


public class Grafil4 extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawLine(30, 30, 30, 230);
        g.drawLine(30, 230, 230, 230);
        g.fillArc(500, 500, 50, 50, 270, 260);
        g.fillOval(500, 500, 50, 50);
       
        g.setColor(Color.red);
        
        g.fillOval(520, 500, 30, 50);
        
    }
//    public  void ciz(Graphics g,int veri1,int veri2){
// 
//    g.drawRect(32, 230, 10, veri1);
//    g.drawRect(32, 230, 10, veri1);
//    }
}
