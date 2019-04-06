package joptiondeneme;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class JOptionDeneme {

    public static void main(String[] args) {
JTextArea ciktiAlani = new JTextArea();
ciktiAlani.scrollRectToVisible(null);
ciktiAlani.setText("2√3");
JOptionPane.showMessageDialog(null,ciktiAlani,"deger",JOptionPane.INFORMATION_MESSAGE);
    }

}
