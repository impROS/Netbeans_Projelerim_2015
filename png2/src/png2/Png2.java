package png2;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;
import java.awt.image.renderable.ParameterBlock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import javax.media.jai.operator.FileLoadDescriptor;

import org.apache.commons.transaction.util.FileHelper;

import com.sun.media.jai.codec.SeekableStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Png2 {

// Function to do the compression
// jpg, gif, bmp, png file formats are accepted for the formatting.
    private  void compressFile(String realPath, File in, String fileName) {

        Image img;
        BufferedImage input = null;

        try {

            if (fileName.endsWith(".jpg") || fileName.endsWith(".JPG")) {
                RenderedImage img1 = (RenderedImage) JAI.create("fileload", in.getAbsolutePath());

                input = getBufferedImage(fromRenderedToBuffered(img1));
            } else if (fileName.endsWith(".gif") || fileName.endsWith(".GIF")) {

                RenderedOp img1 = FileLoadDescriptor.create(in
                        .getAbsolutePath(), null, null, null);

                input = getBufferedImage(img1.getAsBufferedImage());

            } else if (fileName.endsWith(".bmp") || fileName.endsWith(".BMP")) {

                //  Wrap the InputStream in a SeekableStream.
                InputStream is;
                try {

                    is = new FileInputStream(in);
                    SeekableStream s = SeekableStream.wrapInputStream(is, false);

                    // Create the ParameterBlock and add the SeekableStream to it.
                    ParameterBlock pb = new ParameterBlock();
                    pb.add(s);

                    // Perform the BMP operation
                    RenderedOp img1 = JAI.create("BMP", pb);

                    input = getBufferedImage(img1.getAsBufferedImage());

                    is.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } else if (fileName.endsWith(".png") || fileName.endsWith(".PNG")) {

                // Wrap the InputStream in a SeekableStream.
                InputStream is;
                try {
                    is = new FileInputStream(in);
                    SeekableStream s = SeekableStream.wrapInputStream(is, false);

                    // Create the ParameterBlock and add the SeekableStream to it.
                    ParameterBlock pb = new ParameterBlock();
                    pb.add(s);

                    // Perform the PNG operation
                    RenderedOp img1 = JAI.create("PNG", pb);

                    input = getBufferedImage(img1.getAsBufferedImage());

                    is.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }

            if (input == null) {
                return;
            }

// Get Writer and set compression
            Iterator iter = ImageIO.getImageWritersByFormatName("jpg");

            if (iter.hasNext()) {

                ImageWriter writer = (ImageWriter) iter.next();
                ImageWriteParam iwp = writer.getDefaultWriteParam();
             
                iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                float values[] = iwp.getCompressionQualityValues();

                iwp.setCompressionQuality(values[2]);
                String newName = realPath + "/" + "Compress" + getFileName(fileName);

                File outFile = new File(newName);
                FileImageOutputStream output;

                output = new FileImageOutputStream(outFile);
                writer.setOutput(output);
                IIOImage image = new IIOImage(input, null, null);
                System.out.println(
                        "Writing " + values[2] + "%");
                writer.write(null, image, iwp);

                input.flush();
                output.flush();
                output.close();
                writer.dispose();
                writer = null;
                outFile = null;
                image = null;
                input = null;
                output = null;
            }
        } catch (FileNotFoundException finfExcp) {
            System.out.println(finfExcp);
        } catch (IOException ioExcp) {
            System.out.println(ioExcp);
        }
    }

    private BufferedImage getBufferedImage(Image img) {

//		if the image is already a BufferedImage, cast and return it
//		if ((img instanceof BufferedImage)) {
//			return (BufferedImage) img;
//		}
		// otherwise, create a new BufferedImage and draw the original
        // image on it
        int w = img.getWidth(null);
        int h = img.getHeight(null);
        int thumbWidth = 330;
        int thumbHeight = 250;

        // if width is less than 330 keep the width as it is.
        if (w < thumbWidth) {
            thumbWidth = w;
        }

        // if height is less than 250 keep the height as it is.
        if (h < thumbHeight) {
            thumbHeight = h;
        }

        //if less than 330*250 then do not compress
        if (w > 330 || h > 250) {

            double imageRatio = (double) w / (double) h;
            double thumbRatio = (double) thumbWidth / (double) thumbWidth;

            if (thumbRatio < imageRatio) {
                thumbHeight = (int) (thumbWidth / imageRatio);
            } else {
                thumbWidth = (int) (thumbHeight * imageRatio);
            }
        }
		// draw original image to thumbnail image object and
        // scale it to the new size on-the-fly
        BufferedImage bi = new BufferedImage(thumbWidth, thumbHeight,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bi.createGraphics();
        g2d.drawImage(img, 0, 0, thumbWidth, thumbHeight, null);
        g2d.dispose();
        return bi;
    }

    public static BufferedImage fromRenderedToBuffered(RenderedImage img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        ColorModel cm = img.getColorModel();
        int w = img.getWidth();
        int h = img.getHeight();
        WritableRaster raster = cm.createCompatibleWritableRaster(w, h);
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        Hashtable props = new Hashtable();
        String[] keys = img.getPropertyNames();

        if (keys != null) {
            for (int i = 0; i < keys.length; i++) {
                props.put(keys[i], img.getProperty(keys[i]));
            }
        }
        BufferedImage ret = new BufferedImage(cm, raster,
                isAlphaPremultiplied,
                props);
        img.copyData(raster);
        cm = null;
        return ret;
    }

    /**
     * @param fileName
     * @return
     */
    private String getFileName(String fileName) {
        String filName = fileName;
        if (!filName.endsWith(".jpg")) {
            if (filName.endsWith(".bmp")) {
                filName = filName.replaceAll(".bmp", ".jpg");
            }
            if (filName.endsWith(".jpeg")) {
                filName = filName.replaceAll(".jpeg", ".jpg");
            }
            if (filName.endsWith(".png")) {
                filName = filName.replaceAll(".png", ".jpg");
            }
            if (filName.endsWith(".gif")) {
                filName = filName.replaceAll(".gif", ".jpg");
            }
        }
        return filName;
    }

    public static void main(String[] args) {
Png2 resDeneme   = new Png2();
resDeneme.compressFile("C:\\Users\\x.impROS.x\\Desktop\\Resim Deneme Klasörü\\Girdiler", 
        new File("C:\\Users\\x.impROS.x\\Desktop\\Resim Deneme Klasörü\\Girdiler\\lena.png"), "lena.png");
    }

}
