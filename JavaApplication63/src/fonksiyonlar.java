
package JApplet;

import javax.swing.JApplet;


public class fonksiyonlar extends JApplet {

    @Override
    public void init() {

        //Deger aktarılan fakat geriye değer döndermeyen Metot
        Metot1(3);

        //Deger aktarılmadan geriye değer dönderen Metot
        int Metot2denDonenVeri=Metot2();
        System.out.println(Metot2denDonenVeri);

        //Deger aktarılan ve geriye değer dönderen Metot
        int Metot3denDonenVeri=Metot3(5);
        System.out.println(Metot3denDonenVeri);
    }

    public void Metot1(int GelenVeri1){
        System.out.println(GelenVeri1);
    }

    public int Metot2(){
        return 4;
    }
   
    public int Metot3(int GelenVeri1){
        return GelenVeri1*2;
    }
}
