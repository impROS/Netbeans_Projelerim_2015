
package grafik;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import javafx.scene.shape.Polyline;
import javax.swing.JComponent;

public class Grafik3 extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.setColor(Color.red);
g.setFont(new Font("SansSerif",Font.BOLD,124));
//////  İ yi çizme
g.drawLine(20, 100, 50,100 );
g.drawLine(50, 100, 50,200 );
g.drawLine(50, 200, 20,200 );
g.drawLine(20, 200, 20,100 );
////////////////
//g.setColor(Color.green);
g.drawOval(20,50, 30, 30);
////////////m yi çizme
g.drawLine(60, 100, 60, 200);
g.drawLine(60, 200, 90, 200);
g.drawLine(90, 200, 90, 120);
g.drawLine(90, 120, 140, 120);
g.drawLine(140, 120, 140, 200);
g.drawLine(140, 200, 170, 200);
g.drawLine(170, 200, 170, 120);
g.drawLine(170, 120, 220, 120);
g.drawLine(220, 120, 220,200);
g.drawLine(220, 200, 250,200);
g.drawLine(250, 100, 250,200);
g.drawLine(250, 100, 60,100);

//////////////p
g.drawLine(260, 100, 260,300 );

g.drawLine(260, 300, 290,300 );
g.drawLine(290, 100, 290,300 );
g.drawArc(240, 100, 100, 120, 270, 180);
g.drawArc(250, 120, 80, 70, 270, 180);
g.drawLine(290, 100, 260, 100);
/////////////////R
g.drawLine(350,20,350,200);
g.drawLine(350,200,380,200);
g.drawLine(380,200,380,100);
g.drawLine(380,100,440,200);
g.drawLine(440,200,470,200);
g.drawLine(470,200,407,95);
g.drawArc(320,20,120,80,270,175);
g.drawLine(350,20,385,20);
g.drawLine(380,40,380,80);
g.drawArc(350, 40, 60, 40,270,180);
g.drawOval(470, 20, 150, 180);
g.drawOval(490, 40, 105, 150);
////////////////S
g.drawLine(640, 20, 640, 110);
g.drawLine(640, 20, 740, 20);
g.drawLine(640, 110, 740, 110);
g.drawLine(740, 110, 740, 180);
g.drawLine(740, 180, 640, 180);
g.drawLine(640, 180, 640, 200);
g.drawLine(640, 200, 760, 200);
g.drawLine(760, 200, 760, 90);
g.drawLine(760, 90, 660, 90);
g.drawLine(660, 90, 660, 40);
g.drawLine(660, 40, 740, 40);
g.drawLine(740, 40, 740, 20);
////ayrac
g.setColor(Color.GREEN);
g.drawLine(780, 0, 780, 250);
g.drawLine(780, 250, 550, 250);
g.drawLine(550, 250, 550, 1000);

///drawsChar impROS
g.setColor(Color.ORANGE);
char[] karakter = {'i','m','p','R','O','S'};
g.drawChars(karakter,0, karakter.length, 0, 500);
//////////////Polygon
int[] x={800,850,900,880};
int[] y={200,400,70,500};
Polygon poligon = new Polygon(x,y,4);
g.drawPolygon(poligon);
//Polyline poli=new Polyline();
//poli.
g.drawPolygon(poligon);
g.drawPolyline(y,x,3);
////
g.setColor(Color.red);
        Polygon p = new Polygon();
      for (int i = 0; i < 360; i++)
      p.addPoint((int)  (850 + 50 * Math.cos(i * 2 * Math.PI / 360)),
                 (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 360)));
      g.drawPolygon(p);
///////////////////
      Polygon p2=new Polygon();
      
      p2.addPoint(900, 50);
      p2.addPoint(925, 50);
      p2.addPoint(950, 20);
 p2.addPoint(950, 100);
    p2.addPoint(950, 100);
  p2.addPoint(925, 75);
  p2.addPoint(900, 75);
   
      g.drawPolygon(p2);
      g.drawArc(500,500,20,30,270,180);
      ////
       g.fillRoundRect(700, 400, 100, 100, 50, 25);
       g.drawRect(Grafik.sayi1, 200, 50, 50);
    }
    
}
