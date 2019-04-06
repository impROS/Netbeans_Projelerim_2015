package ping;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class Ping {

    public static void main(String args[]) {
        args[0]="www.google.com.tr";
        try {
            try (Socket t = new Socket(args[0], 7)) {
                DataInputStream dis = new DataInputStream(t.getInputStream());
                PrintStream ps = new PrintStream(t.getOutputStream());
                ps.println("Hello");
                String str = dis.readLine();
                if (str.equals("Hello")) {
                    System.out.println("Alive!");
                } else {
                    System.out.println("Dead or echo port not responding");
                }
            }
        } catch (IOException e) {
        }
    }
}
