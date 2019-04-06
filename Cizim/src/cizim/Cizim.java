
package cizim;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Cizim {

    public static void main(String[] args) {
       Cizim2 pencere =new Cizim2();
       GrafikCi pencere =new Cizim2();
     
       
    pencere.setTitle("Deneme22");
    pencere.setLocationRelativeTo(null);
    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pencere.setSize(300,300);
        Graphics g = null;
    pencere.paintComponents(g);
     
    pencere.setVisible(true);
    }


    
}
