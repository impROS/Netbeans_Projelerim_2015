
package grafikcizim;
import java.awt.*; // for Graphics,Color
import java.util.*;// for Random, Date
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.random;
import javax.swing.JComponent;


public class GrafikCizelgesi extends JComponent{
public static int COLOR = (int) (Math.random() * 256);
    @Override
    protected void paintComponent(Graphics g) {
 super.paintComponent(g); 
   g.setColor(Color.red);
   ////oklar
    g.drawLine(30, 30, 30, 230);
        g.drawLine(30, 230, 230, 230);
        
     ///rastgele renk == >  // g.setColor(new Color(COLOR), (COLOR), (COLOR));

        ///veri yerleşimi
        g.fillRect(35, 230-GrafikCizim.veri1, 10, GrafikCizim.veri1);
        g.drawString(230-GrafikCizim.veri1+"",15,230-GrafikCizim.veri1);
        g.drawString(220-GrafikCizim.veri1+"",15,220-GrafikCizim.veri1);
        g.drawString(210-GrafikCizim.veri1+"",15,210-GrafikCizim.veri1);
        g.drawString(200-GrafikCizim.veri1+"",15,200-GrafikCizim.veri1);
        g.drawString(190-GrafikCizim.veri1+"",15,190-GrafikCizim.veri1);
         renkDegis(g);
                    
        g.fillRect(50, 230-GrafikCizim.veri2, 10, GrafikCizim.veri2);
       //   g.drawString(GrafikCizim.veri2+"",15,230-GrafikCizim.veri2);
         renkDegis(g);
                    
        g.fillRect(65, 230-(GrafikCizim.veri2+GrafikCizim.veri1), 10, (GrafikCizim.veri1+GrafikCizim.veri2));
     
        
    }
  public static void renkDegis(Graphics h){
    int renkKodu = (int)(Math.random()*256);
   Color renk=new Color(renkKodu, renkKodu, renkKodu);
   h.setColor(renk);
  
  }
}
