package kataprocess_02;

import java.io.IOException;

public class KataProcess_02 {

    static int counterExeDizi = 0;
    static String[] arrExeler = {"1.exe", "2.exe"};

    public static void main(String[] args) {
        exeDizisiAc(arrExeler[counterExeDizi]);
        
        System.out.println("-----------2.Yontem-----------");
        exeAc("1.exe");
    }

    static void exeAc(String strExe) {
        try {
            Process exeAc = Runtime.getRuntime().exec(strExe);
            System.out.println("2.Yontem Basariyla Tamamlandi");
        } catch (IOException ex) {
            System.out.println("Hata : " + ex.getMessage());
        }
    }

    static void exeDizisiAc(String arrExe) {
        try {
            ProcessBuilder exeDizisiAc = new ProcessBuilder(arrExe);
            exeDizisiAc.start();
            counterExeDizi++;
            exeDizisiAc(arrExeler[counterExeDizi]);
        } catch (ArrayIndexOutOfBoundsException ex1) {
            System.out.println("islem tamamlandi");
        } catch (IOException ex2) {
            System.out.println("Hata" + ex2.getMessage());
        }
    }

}
