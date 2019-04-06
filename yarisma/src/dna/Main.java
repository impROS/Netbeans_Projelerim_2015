 package dna;

import java.io.*;

class Extra{
    public static void CizgiCiz(){
        for(int i=0; i<20; i++){
            System.out.print("-");
        }
        System.out.print("-n");
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
   
        int ySayisi,sSayisi = 0;
        BufferedReader okuyucu = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("Kac yarismaci yarisacak? ");
        ySayisi = Integer.valueOf(okuyucu.readLine());
        //ySayisi =new Integer(okuyucu.readLine()); Böylede olabilir
       
        System.out.println("Kac soru cevaplanacak? ");
        sSayisi = Integer.valueOf(okuyucu.readLine());
       
        String[][] cevaplar = new String[ySayisi][sSayisi];
       
        for(int i=0;i<cevaplar.length;i++)
        {
            for(int j=0;j<cevaplar[i].length;j++)
            {
                System.out.println((i+1)+". yarismacinin "+(j+1)+" sorusunun cevabı:    ");
                cevaplar[i][j] = okuyucu.readLine();
            }
        }
       
        Extra.CizgiCiz();

        System.out.print("t");
        for(int i=0;i<ySayisi;i++)
        {
            System.out.print((i+1)+".Yarismaci    ");
        }
       
        Extra.CizgiCiz();
       
        for(int i=0;i<sSayisi;i++)
        {
            System.out.print((i+1)+".");
           
            for(int j=0;j<ySayisi;j++)
            {
                System.out.print("t     "+cevaplar[j][i]+"    ");
            }
            System.out.println();
        }
    }
}
 	