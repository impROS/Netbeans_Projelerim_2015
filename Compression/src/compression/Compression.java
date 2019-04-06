
package compression;

import java.io.*;
import java.util.*;
import java.awt.image.*;

import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;

class Compresssion {

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
            param.setCompressionQuality(0.05f);
            writer.write(null, new IIOImage(image, null, null), param);
        }
        ios.close();
        writer.dispose();
    }
}
