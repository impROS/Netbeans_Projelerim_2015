
package inideneme2;

import java.io.File;


public class IniDeneme2 {

    public static void main(String[] args) {
///iniIslem iniIslem = new iniIslem(new File("setting.ini"));
iniIslem iniIslem = new iniIslem(new File("C:\\Users\\x.impROS.x\\Documents\\NetBeansProjects\\veriTaban2015\\sozluk.ini"));
//        for (int i = 0; i < 10000; i++) {
//            iniIslem.yeniAnahtar("deneme"+i,"deneme"+i+"impROS");
//        }
        System.out.println("Oku araba : "+iniIslem.oku("bakmak"));
//        System.out.println("Oku deneme600 : "+iniIslem.oku("deneme600"));
//        System.out.println("Oku deneme333 : "+iniIslem.oku("deneme333"));
//        System.out.println("Oku deneme5 : "+iniIslem.oku("deneme5"));
//        System.out.println("Oku deneme9999 : "+iniIslem.oku("deneme9999"));
//        System.out.println("Oku deneme10000 : "+iniIslem.oku("deneme10000"));
    }
    
}
