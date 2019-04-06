package ımagemovecanvas;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ImageMoveCanvas extends Canvas implements KeyListener {

    private Image image1;
    private Image image2;
    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 50;
    private int y2 = 50;

    public ImageMoveCanvas(Image image1, Image image2) {
        this.image1 = image1;
        this.image2 = image2;
        addKeyListener(this);
        java.util.Timer t = new java.util.Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                x2 += 10;
                y2 += 10;
                repaint();
            }
        };
        t.schedule(task, 0, 1000);
    }

    public void paint(Graphics g) {
        g.drawImage(image2, x2, y2, this);
        g.drawImage(image1, x1, y1, this);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            x1--;
            repaint();
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            x1++;
            repaint();
        } else if (keyCode == KeyEvent.VK_UP) {
            y1--;
            repaint();
        } else if (keyCode == KeyEvent.VK_DOWN) {
            y1++;
            repaint();
        }
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(10, 10, 300, 300);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        String folder = "C:\\Users\\x.impROS.x\\Documents\\NetBeansProjects\\ImageMoveCanvas\\";
        Image image1 = toolkit.getImage(folder + "cat.gif");
        Image image2 = toolkit.getImage(folder + "mjouse.gif");
        ImageMoveCanvas canvas = new ImageMoveCanvas(image1, image2);
        frame.add(canvas);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
