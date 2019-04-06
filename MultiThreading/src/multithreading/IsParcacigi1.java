
package multithreading;

public class IsParcacigi1 implements Runnable{
    private char yazilacak;
    private int yazmaSayisi;

    public IsParcacigi1(char yazilacak, int yazmaSayisi) {
        this.yazilacak = yazilacak;
        this.yazmaSayisi = yazmaSayisi;
    }

    @Override
    public void run() {
       for(int i=0;i<yazmaSayisi;i++){
           System.out.print(yazilacak);
       }
    }

    

}
