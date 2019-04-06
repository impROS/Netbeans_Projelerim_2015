package bilgisayarıkapat_process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BilgisayarıKapat_Process {

    public static void main(String[] args) {
        try {
            Process p1 = Runtime.getRuntime().exec("deneme.exe");
        } catch (IOException e) {
        }
    }

}
