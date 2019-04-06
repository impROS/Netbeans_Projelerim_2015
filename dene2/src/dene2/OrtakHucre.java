/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dene2;

public class OrtakHucre {

    public static void main(String args[]) {
        TutInteger h = new TutInteger();
        UretInteger p = new UretInteger(h);
        KullanInteger c = new KullanInteger(h);
        p.start();
        c.start();
    }
}

class UretInteger extends Thread {

    private TutInteger pTut;

    public UretInteger(TutInteger h) {
        pTut = h;
    }

    public void run() {
        for (int count = 0; count < 10; count++) {
            pTut.setOrtakInt(count);
            System.out.println("OrtakInteger " + count + " degerini uretti");
            try {
                sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                System.err.println("Exeption " + e.toString());
            }
        }
    }
}

class KullanInteger extends Thread {

    private TutInteger cTut;

    public KullanInteger(TutInteger h) {
        cTut = h;
    }

    public void run() {
        int Intdegeri = 0;
        while (Intdegeri != 9) {
            try {
                sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                System.err.println("Exeption " + e.toString());
            }
            Intdegeri = cTut.getOrtakInt();
            System.out.println("Kullan Integer" + Intdegeri + " degerini okudu");
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
