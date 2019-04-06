package pngkucult2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;

public class PngKucult2 {

    public static void main(String[] args) {
        try {
            BufferedImage bufferedImage = ImageIO.read(new File("C:\\Users\\x.impROS.x\\Documents\\NetBeansProjects\\pngkucult\\lena.png"));
            
            Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
            
            ImageWriter imageWriter = (ImageWriter) writers.next();
            
            ImageWriteParam pngparams = imageWriter.getDefaultWriteParam();
            pngparams.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            pngparams.setCompressionQuality(0.5F);
            pngparams.setProgressiveMode(ImageWriteParam.MODE_DISABLED);
            pngparams.setDestinationType(
                    new ImageTypeSpecifier(bufferedImage.getColorModel(), bufferedImage.getSampleModel()));
        } catch (IOException ex) {
            Logger.getLogger(PngKucult2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
