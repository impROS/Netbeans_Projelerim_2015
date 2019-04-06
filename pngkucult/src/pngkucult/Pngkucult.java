package pngkucult;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class Pngkucult {

    public static void main(String[] args) throws IOException {
        File input = new File("logo.png");

        InputStream is = new FileInputStream(input);
        BufferedImage image = ImageIO.read(is);

        File compressedImageFile = new File(input.getName());

        OutputStream os = new FileOutputStream(compressedImageFile);

        Iterator<ImageWriter> writers
                = ImageIO.getImageWritersByFormatName("png"); // here "png" does not work
        ImageWriter writer = (ImageWriter) writers.next();

        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
        writer.setOutput(ios);

        ImageWriteParam param = writer.getDefaultWriteParam();

        if (param.canWriteCompressed()) {
            // NOTE: Any method named [set|get]Compression.* throws UnsupportedOperationException if false
            param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            param.setCompressionQuality(0.5f);
        }

        writer.write(null, new IIOImage(image, null, null), param);
        System.out.println("bitti");
    }

}
