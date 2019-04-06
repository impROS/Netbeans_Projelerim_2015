/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ımage_grayscale;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author YASİR KILIÇ
 */
public class Image_grayscale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedImage image = null;
        File f = null;
        try {
            f = new File("resim3.png");
            image = ImageIO.read(f);

        } catch (Exception e) {
            e.printStackTrace();
        }
        int h = image.getHeight();
        int w = image.getWidth();

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {

                int p = image.getRGB(i, j);
                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;
                int avg = (r + g + b) / 3;
                p = (a << 24) | (avg << 16) | (avg << 8) | avg;
                image.setRGB(i, j, p);

            }

        }

        try {

            f = new File("x4.png");

            ImageIO.write(image, "png", f);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
