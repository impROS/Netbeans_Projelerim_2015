package kataprocess_01;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KataProcess_01 {

    static int i = 0;
    static String[] arrExeler = {"1.exe", "2.exe"};

    public static void main(String[] args) {
        yontem2(arrExeler[i]);
    }

    static void yontem1() {
        String[] arrExeler2 = {"1.exe", "2.exe"};
        try {
            Process p1 = Runtime.getRuntime().exec(arrExeler2);
        } catch (IOException ex) {
            System.out.println("Hata : " + ex.getMessage());
        }
    }

    static void yontem2(String exe) {

        try {
            ProcessBuilder proc = new ProcessBuilder(exe);
           proc.start();
            i++;

            yontem2(arrExeler[i]);
        } catch (ArrayIndexOutOfBoundsException ex2) {
            System.out.println("Dizi Bitti");
            return;
        } catch (IOException ex) {
            System.out.println("Hata2 : " + ex.getMessage());
        }
    }
}

