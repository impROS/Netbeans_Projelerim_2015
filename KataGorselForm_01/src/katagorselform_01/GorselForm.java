
package katagorselform_01;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GorselForm extends JFrame{
    public GorselForm(){
    setLayout(new FlowLayout());
    
    JButton btnTamam = new JButton("Tamam");
    add(btnTamam);
    
    JComboBox cmbIsımler = new JComboBox(new String[]{"imparator","Ridvan","Orhan","Seyhmus"});
    add(cmbIsımler);
    
        JTextArea txtYazi = new JTextArea("impROS");
       txtYazi.setSize(100, 300);
       //txtYazi.setText(null);
       txtYazi.setSelectedTextColor(Color.red);
        add(txtYazi);
    }
}
