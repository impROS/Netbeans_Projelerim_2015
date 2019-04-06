/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dene3;

import java.util.*;
import java.awt.*;
import java.io.*;//runnable interfacei kullanarak

class UretInteger implements Runnable {

    private TutInteger pTut;
    private Thread thread;

    public UretInteger(TutInteger h) {
        pTut = h;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        for (int count = 0; count < 10; count++) {
            pTut.setOrtakInt(count);
            System.out.println("Ortak Integer " + count + " Olarak olusturuldu");
            
        }
    }
}

class KullanInteger implements Runnable {

    private TutInteger cTut;
    private Thread thread;

    public KullanInteger(TutInteger h) {
        cTut = h;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        int Intdegeri = 0;
        while (Intdegeri != 9) {
            
            Intdegeri = cTut.getOrtakInt();
            System.out.println("Kullan Integer " + Intdegeri + "degerini yakaladi");
        }
    }
}

class TutInteger {

    private int OrtakInt;

    public void setOrtakInt(int Intdegeri) {
        OrtakInt = Intdegeri;
    }

    public int getOrtakInt() {
        return OrtakInt;
    }
}

public class OrtakHucreR {

    public static void main(String[] args) {
        TutInteger h = new TutInteger();
        new UretInteger(h);
        new KullanInteger(h);
    }
}
