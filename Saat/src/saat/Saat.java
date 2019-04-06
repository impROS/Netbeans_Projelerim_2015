package saat;

import java.awt.Font;
import java.util.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.text.*;

class saatThread extends Thread {

    Applet a;

    public saatThread(Applet ai) {
        a = ai;
    }

    @Override
    public void run() {
        while (true) {
            a.repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.toString());
            }
        }
    }
}

public class Saat extends Applet {

    Font F;
    Date D;
    DateFormat df;
    Locale tr;
    saatThread r;

    @Override
    public void init() {
        F = new Font("TimesRoman", Font.BOLD, 24);
        tr = new Locale("tr", "TR");
        D = new Date();
        df = DateFormat.getDateInstance(DateFormat.LONG, tr);
        r = new saatThread(this);
        r.start();
    }

    @Override
    public void paint(Graphics g) {
        df.format(D);
        D = new Date();
        g.setFont(F);
        try {
            g.drawString(D.toString(), 10, 50);
        } catch (NullPointerException e) {
        }
    }
}
