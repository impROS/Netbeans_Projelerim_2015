package asalsayibul;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class asalYazdir extends Thread {
 long altLimit,ustLimit;
    public asalYazdir(long altLimit,long ustLimit) {
    this.altLimit = altLimit;
    this.ustLimit =ustLimit;
    }

    @Override
    public void run() {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
            for (long i = altLimit; i < ustLimit; i++) {
                try {
                    out.write(String.valueOf(i));
                     out.write('\n');
                } catch (IOException ex) {
                    System.out.println("HATA!");
                }
            }
        } catch (UnsupportedEncodingException ex) {

        } finally {
            try {
                out.close();
            } catch (IOException ex) {

            }
        }
    }

}
