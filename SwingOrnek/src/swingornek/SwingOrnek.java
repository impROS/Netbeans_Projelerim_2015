//impROS
package swingornek;

import java.awt.Color;
import javax.swing.*;

public class SwingOrnek {

    public static void main(String[] args) {
//    JFrame pencere = new JFrame("impROS");
//    JButton buton = new JButton("dengeme");
//    
//    pencere.add(buton);
//    buton.setBackground(Color.red);
//    pencere.setSize(400,400);
//    pencere.setLocationRelativeTo(null);
//    pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    pencere.setVisible(true);
//        LayoutDeneme pencere = new LayoutDeneme();
        LayoutDeneme borderlayout = new LayoutDeneme();
        borderlayout.setTitle("impROS Layout");
        borderlayout.setLocationRelativeTo(null);
        borderlayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderlayout.setSize(200,300);
        borderlayout.setVisible(true);
    }
    
}
