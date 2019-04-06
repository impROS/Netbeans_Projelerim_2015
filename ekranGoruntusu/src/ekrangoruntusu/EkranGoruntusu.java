package ekrangoruntusu;

import java.awt.event.KeyAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class EkranGoruntusu extends KeyAdapter {

    public static void main(String[] args) {
        Klavye k1 = new Klavye();
        k1.setSize(150, 100);
        k1.setTitle("");
        k1.setLocationRelativeTo(null);
        k1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon Icon = new ImageIcon("at.ico");
        k1.setIconImage(null);
        k1.setVisible(true);
    }
}
