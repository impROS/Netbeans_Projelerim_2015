
package multithreading;

public class IsParcacigi2 implements Runnable{
private int yazmaSayisi;
private int yazilacak;

    public IsParcacigi2(int yazilacak , int yazmaSayisi) {
        this.yazmaSayisi = yazmaSayisi;
        this.yazilacak = yazilacak;
    }

    @Override
    public void run() {
       for(int i=0;i<yazmaSayisi;i++){
           System.out.print(yazilacak);
       }
    }
    
}
