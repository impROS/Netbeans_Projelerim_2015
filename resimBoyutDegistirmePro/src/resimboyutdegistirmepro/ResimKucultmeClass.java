package resimboyutdegistirmepro;

import com.idrsolutions.image.png.PngCompressor;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class ResimKucultmeClass extends Thread {

    PicSizeAnamenu anamenu = new PicSizeAnamenu();
    float kalite = 5;
    int yuzdelik = 1;
    static double progressBarValue;
    ArrayList<File> arrResimler = new ArrayList<>();

    public ResimKucultmeClass(ArrayList<File> arrTmpResimler, float kalite) {
        arrResimler.addAll(arrTmpResimler);
        this.kalite = kalite /= 10;;
    }

    public void sayacArtir() {
        yuzdelik++;
    }

    public int getSayac() {
        return yuzdelik;
    }

    @Override
    public void run() {
        ImageWriter writer = null;
        ImageOutputStream ios = null;
        yuzdelik = 0;
        long start = System.currentTimeMillis();
        for (File resim : arrResimler) {
            sayacArtir();
            try {
                System.out.println("1");
                try {
                    progressBarValue = getSayac() * 100 / PicSizeAnamenu.arrResimler.size();
                } catch (ArithmeticException e) {
                    progressBarValue = 1;
                }

                System.out.println("Kalite : " + kalite);

                BufferedImage image;

                if (resim.getName().endsWith("png")) {

                    try {
                        // yaziYaz(, "impROS");
                     //   addImageWatermark(PicSizeAnamenu.logo, resim, new File(PicSizeAnamenu.resimKaydetDizin + "\\" + resim.getName()));
                        // addTextWatermark("impROS", new File(compressedImageFile.getAbsolutePath()), new File("C:\\Users\\x.impROS.x\\Desktop\\Resim Cikti4\\"+compressedImageFile.getName()));
                    } catch (Exception ex) {
                        System.out.println("Yazi Yazilamadi");
                    }
                    resim = new File(PicSizeAnamenu.resimKaydetDizin + "\\" + resim.getName());
                    PngCompressor.compress(resim, resim);
                } else if (resim.getName().endsWith(".jpg")) {
                    try {
                        // yaziYaz(, "impROS");
                       // addImageWatermark(PicSizeAnamenu.logo, resim, new File("C:\\Users\\x.impROS.x\\Documents\\NetBeansProjects\\resimBoyutDegistirmePro\\tmp\\" + resim.getName()));
                        // addTextWatermark("impROS", new File(compressedImageFile.getAbsolutePath()), new File("C:\\Users\\x.impROS.x\\Desktop\\Resim Cikti4\\"+compressedImageFile.getName()));
                    } catch (Exception ex) {
                        System.out.println("Yazi Yazilamadi");
                    }
                    File compressedImageFile = new File(PicSizeAnamenu.resimKaydetDizin + "\\" + resim.getName());
                   // resim = new File("C:\\Users\\x.impROS.x\\Documents\\NetBeansProjects\\resimBoyutDegistirmePro\\tmp\\" + resim.getName());
                    try (OutputStream os = new FileOutputStream(compressedImageFile)) {
                        image = ImageIO.read(pngTojpg2(resim));
                        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
                        writer = (ImageWriter) writers.next();
                        ios = ImageIO.createImageOutputStream(os);
                        writer.setOutput(ios);
                        ImageWriteParam param = writer.getDefaultWriteParam();
                        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                        param.setCompressionQuality(kalite);

                        writer.write(null, new IIOImage(image, null, null), param);
                        ios.close();
                        resim.delete();
                        writer.dispose();
                    }
                }

            } catch (IOException ex) {
                System.err.println("Hata || " + ex.getMessage());
            } finally {
                writer.dispose();
            }

        }
        long stop = System.currentTimeMillis();
        long duration = stop - start;
        long saniye = TimeUnit.MILLISECONDS.toSeconds(duration) % 3600;
        long dakika = TimeUnit.MILLISECONDS.toMinutes(duration) & 60;
        long saat = TimeUnit.MILLISECONDS.toHours(duration);
        System.out.println("Geçen Sure :: " + saniye + " Saniye, " + dakika + " Dakika, " + saat + " Saat.");
        PicSizeAnamenu.strGecenZaman = ("Geçen Sure :: " + saniye + " Saniye, " + dakika + " Dakika, " + saat + " Saat.");
    }

    public static void yaziYaz(String resimDosyasi, String yazilacakYazi) throws Exception {
        Image image = new ImageIcon(resimDosyasi).getImage();
        BufferedImage bufferedImage = ImageIO.read(new File(resimDosyasi));
        BufferedImage scaledBI = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g = scaledBI.createGraphics();
        g.setComposite(AlphaComposite.Src);
        g.drawImage(image, 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), null);

        Font font = new Font("SansSerif ", Font.BOLD, 20);
        g.setFont(font);

        int genislik = (bufferedImage.getWidth() / 2) - (yazilacakYazi.length() * 7);
        int yukseklik = (bufferedImage.getHeight() / 2);
        g.drawString(yazilacakYazi, genislik, yukseklik);
        g.dispose();
        ImageIO.write(scaledBI, "jpg", new File(resimDosyasi));
    }

    private File pngTojpg2(File pngResim) {

        BufferedImage bufferGambar;
        try {

            bufferGambar = ImageIO.read(pngResim);

            BufferedImage newBufferGambar = new BufferedImage(bufferGambar.getWidth(), bufferGambar.getHeight(), BufferedImage.TYPE_INT_RGB);

            newBufferGambar.createGraphics().drawImage(bufferGambar, 0, 0, Color.white, null);
            ImageIO.write(newBufferGambar, "jpg", new File("pngConverToJpg.jpg"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + pngResim.getAbsoluteFile());
        }
        return new File("pngConverToJpg.jpg");

    }

    public void listele(File klasor) {

        try {
            File[] klasoricindekiler = klasor.listFiles();
            for (File klasoricindekiler1 : klasoricindekiler) {
                if (klasoricindekiler1.isDirectory()) {

                    listele(klasoricindekiler1);
                } else {
                    if (klasoricindekiler1.getName().toLowerCase().endsWith(".png") || klasoricindekiler1.getName().toLowerCase().endsWith(".jpg")) {
                        arrResimler.add(klasoricindekiler1);

                        anamenu.listModel.addElement(klasoricindekiler1);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void addTextWatermark(String text, File sourceImageFile, File destImageFile) {
        try {
            BufferedImage sourceImage = ImageIO.read(sourceImageFile);
            Graphics2D g2d = (Graphics2D) sourceImage.getGraphics();

            // initializes necessary graphic properties
            AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 10f);
            g2d.setComposite(alphaChannel);
            g2d.setColor(Color.BLUE);
            g2d.setFont(new Font("Arial", Font.BOLD, 64));
            FontMetrics fontMetrics = g2d.getFontMetrics();
            Rectangle2D rect = fontMetrics.getStringBounds(text, g2d);

            // calculates the coordinate where the String is painted
            int centerX = (sourceImage.getWidth() - (int) rect.getWidth()) / 2;
            int centerY = sourceImage.getHeight() / 2;

            // paints the textual watermark
            g2d.drawString(text, centerX, centerY);

            ImageIO.write(sourceImage, "png", destImageFile);
            g2d.dispose();

            System.out.println("The tex watermark is added to the image.");

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    static void addImageWatermark(File watermarkImageFile, File sourceImageFile, File destImageFile) {
        try {
            BufferedImage sourceImage = ImageIO.read(sourceImageFile);
            BufferedImage watermarkImage = ImageIO.read(watermarkImageFile);

            // initializes necessary graphic properties
            Graphics2D g2d = (Graphics2D) sourceImage.getGraphics();
            AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f);
            g2d.setComposite(alphaChannel);

            // calculates the coordinate where the image is painted
            int topLeftX = (sourceImage.getWidth() - watermarkImage.getWidth()) / 2;
            int topLeftY = (sourceImage.getHeight() - watermarkImage.getHeight()) / 2;

            // paints the image watermark
            g2d.drawImage(watermarkImage, topLeftX, topLeftY, null);

            ImageIO.write(sourceImage, "png", destImageFile);
            g2d.dispose();

            System.out.println("Watermark Resime Eklendi");

        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
