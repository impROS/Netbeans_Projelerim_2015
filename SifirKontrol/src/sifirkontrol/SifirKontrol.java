
package sifirkontrol;

public class SifirKontrol {

    public static void main(String[] args) {
SifirMi sifirClass =new SifirMi();

int[] dizi2={1,3,0,5,0};

if(sifirClass.SifirMiDegilMi(dizi2)){
    System.out.println("Dizinin ilk ve son elemanı 0 dır");
}
else{
    System.out.println("Dizinin ilk ve son elemanı 0 değildir");
}
    }
    
}
