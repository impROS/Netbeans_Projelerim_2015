
package deneveriyolla;

import java.util.Scanner;

public class DeneVeriYolla {
    public static void main(String[] args) {
   VeriYolla2 veri = new VeriYolla2();
   String ileti;
   int sembolSayisi;
   Scanner klavye = new Scanner(System.in);
   ileti = klavye.next();
   veri.mesaj = ileti;
   sembolSayisi=veri.veriYazdir();
   System.out.println("Sembol Sayisi="+sembolSayisi);
    }
    
}
