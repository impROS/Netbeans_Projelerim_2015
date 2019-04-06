package katagorselform_02;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class gorselForm extends JFrame {
public gorselForm(){
setLayout(new FlowLayout());

JTextArea  txtYazi = new JTextArea("impROS");
add(txtYazi);

JComboBox cmbAd= new JComboBox(new String[]{"imparator","Ridvan","Orhan","Seyhmus"});
add(cmbAd);

JButton btnTamam = new JButton("Tamam");
add(btnTamam);

}
}
