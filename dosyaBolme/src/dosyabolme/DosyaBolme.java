package dosyabolme;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class DosyaBolme {

    public static void main(String[] args) {
//        if (args.length != 2) {
//            System.err.println("Usage: java Main <input> <output>");
//            System.exit(-1);
//        }
        try {
            FileInputStream in = new FileInputStream("E:\\veribol\\deneme.mkv");

// Create compressed stream that writes to byte array output stream 
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            GZIPOutputStream out = new GZIPOutputStream(b);

            byte[] buf = new byte[512];
            int howmany;
            while ((howmany = in.read(buf)) > 0) {
                out.write(buf, 0, howmany);
            }
            in.close();
            out.flush();
            byte[] compressedBytes = b.toByteArray(); // get byte array 
            b.writeTo(new FileOutputStream(args[1])); // write to file 
            out.close(); // closes both out and b 
            System.out.println("compressed size: " + compressedBytes.length);
// ... do something with byte array 

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
