
package swingcomponent;

import java.awt.FlowLayout;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.*;
public class Gorsel extends JFrame {
 public static JButton button2=new JButton("Tamam");
    public Gorsel() {
             super("Swing Component");
setLayout(new FlowLayout());

//      ImageIcon resim =new ImageIcon();
//      add(resim);
     add(button2);
     
     JComboBox  combo = new JComboBox(new String[]{"impROS","Rıdvan","Deneme"});
     add(combo);
    }
          private class ClickListener implements ActionListener {
    private int clickCount = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button2) {
        clickCount++;
        if (clickCount == 1)
          button2.setText("clicked!");
 
      }
    }
  }
}
