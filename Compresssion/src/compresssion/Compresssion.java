
package compresssion;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;


public class Compresssion {
public static void main(String[] args) throws IOException {

        File input = new File("test.jpg");
        BufferedImage image = ImageIO.read(input);

        File compressedImageFile = new File("compress.jpg");
        ImageWriter writer;
        ImageOutputStream ios;
        try (OutputStream os = new FileOutputStream(compressedImageFile)) {
            Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
            writer = (ImageWriter) writers.next();
            ios = ImageIO.createImageOutputStream(os);
            writer.setOutput(ios);
            ImageWriteParam param = writer.getDefaultWriteParam();
            param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            param.setCompressionQuality(0.7f);
            writer.write(null, new IIOImage(image, null, null), param);
        }
        ios.close();
        writer.dispose();
    }
}