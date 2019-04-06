package ekrangoruntusu;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class Klavye extends JFrame implements ActionListener, Runnable {

    static String fotoAd;
    JTextArea j1;
    Date d1 = new Date();
    String s1;

    public Klavye() {
        super("");
        setLayout(new FlowLayout());
        
        j1 = new JTextArea(d1.getTime() + "");
        add(j1);

        JButton b1 = new JButton("Çek");
        add(b1);
        
        b1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        d1 = new Date();
        fotoAd = j1.getText();
        String yazi = d1.getTime() + "";
        j1.setText(yazi);
        try {
            this.setVisible(false);
            Thread.sleep(500);
        } catch (InterruptedException ex) {

        }

        gizle();
        goruntuClass.capture("E:\\Ekran Goruntuleri\\" + fotoAd + ".jpg");

        this.setVisible(true);

//        goruntuClass g1=new    goruntuClass();
//        addKeyListener(g1);
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.

    }

    public synchronized void gizle() {
        this.setVisible(false);

    }

    @Override
    public void run() {

    }

}
