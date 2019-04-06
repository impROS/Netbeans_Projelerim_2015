
package swingornek;

import java.awt.*;
import javax.swing.*;

public class LayoutDeneme extends JFrame {
    public LayoutDeneme(){
//    FlowLayout layout = new FlowLayout(FlowLayout.LEFT,15,30);1
   //    setLayout(layout);1     
        
//        GridLayout gridLayout =new GridLayout(3,2,5,5);2
//setLayout(gridLayout);2
        BorderLayout borderlayout = new BorderLayout(10,15);
   setLayout(borderlayout);
   add(new JButton("bati"),BorderLayout.WEST); 
   add(new JButton("DOGU"),BorderLayout.EAST); 
   add(new JButton("kuzey"),BorderLayout.NORTH); 
   add(new JButton("guney"),BorderLayout.SOUTH); 
   add(new JButton("merkez"),BorderLayout.CENTER); 
        
    
    add(new JLabel("ad"));
    add(new JTextField(20));
    
    add(new JLabel("soyad"));
    add(new JTextField(20));
    
    add(new JLabel("yas"));
    add(new JTextField(4));
  
    
    
    }
}
