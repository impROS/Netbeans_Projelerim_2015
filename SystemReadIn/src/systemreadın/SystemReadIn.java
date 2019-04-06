package systemreadın;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SystemReadIn {

    public static void main(String[] args) {
        try {
            int strGirdi = System.in.read();
            System.out.println("Girilen = " + strGirdi);
        } catch (IOException ex) {
            System.out.println("Hata || " + ex.getMessage());
        }
    }

}
