
package javaapplication64;
 import javax.swing.JApplet;

public class kendinicagiranmetot extends JApplet {


    public void init() {
        KendiniCagiranFonksiyon(10);
    }

    public void KendiniCagiranFonksiyon(int Sayi){
        Sayi--;

        System.out.println(Sayi);

        if(Sayi>0){
            KendiniCagiranFonksiyon(Sayi);
        }
    }

}