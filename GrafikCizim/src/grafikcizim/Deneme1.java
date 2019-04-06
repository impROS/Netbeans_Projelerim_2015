
package grafikcizim;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.awt.RepaintArea;


public class Deneme1 extends JPanel{

    public Deneme1() {
 setLayout(new FlowLayout());
        JButton buton = new JButton("Deneme");
        add(buton);
        ButonDinleyici dinle =new ButonDinleyici();
        buton.addActionListener(dinle);
    }
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        this.setBackground(Color.red);
        g.setColor(Color.YELLOW);
        g.drawLine(11, 11, 100, 200);
    }
    
   
    
}
 class ButonDinleyici implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
//        Deneme1 d1=new Deneme1();
//       Graphics h = null;
//       d1.paintComponent(h);
       //  d1.repaint();
        System.out.println("Butona Basıldi");
    }
 
 }