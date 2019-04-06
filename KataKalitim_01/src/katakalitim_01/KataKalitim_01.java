package katakalitim_01;

import java.util.logging.Logger;

public class KataKalitim_01 extends AnaSinif {

    public static void main(String[] args) {
        publicStaticVoidMetod();

        KataKalitim_01 kalitilmisSinif = new KataKalitim_01();

        System.out.println("kalitilmisSinif.protectedIntDegisken = " + kalitilmisSinif.protectedIntDegisken);
        System.out.println("kalitilmisSinif.publicIntDegisken = " + kalitilmisSinif.publicIntDegisken);
        System.out.println("kalitilmisSinif.publicFinalIntDegisken = " + kalitilmisSinif.publicFinalIntDegisken);
        //System.out.println("kalitilmisSinif.privateDegisken = "+kalitilmisSinif.privateDegisken); // Hata private extends edilmez

        kalitilmisSinif.protectedVoidMetot(null);
        // kalitilmisSinif.privateStatickMetot(); //hata
        // kalitilmisSinif.privateMetot(); //hata

        kalitilmisSinif.protectedIntDegisken = 333;// eskisi = 3
        // kalitilmisSinif.publicFinalIntDegisken = 222 // eskisi = 2 , hata verir cunku final
        kalitilmisSinif.publicIntDegisken = 111; //eskisi = 1 
        //kalitilmisSinif.privateIntDegisken = 000 ; //eskisi = 0 , hata verir cunku private

        publicStaticVoidMetod();
        System.out.println(kalitilmisSinif.stringDondur());
    }

    @Override
    protected void protectedVoidMetot(Object par0) {
        super.protectedVoidMetot(null);
        System.out.println("Kalitilmis Sinif Override etti"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String stringDondur() {
        return super.stringDondur() + "ROS"; //To change body of generated methods, choose Tools | Templates.
    }

}
