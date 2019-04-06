package katadosyaıslemleri_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KataDosyaIslemleri_01 {

    public static void main(String[] args) throws IOException {

        String strYazi = "impROS -2 ";

        File dosya = new File("dosya.txt");
        if (!dosya.exists()) {
            dosya.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(dosya, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        
        bufferedWriter.write(strYazi);
        bufferedWriter.newLine();
        bufferedWriter.close();

        //Dosya Okuma
        dosya = new File("E:\\Ekran Goruntuleri\\masaüstü yönetim.jpg");
        
        System.out.println("----------------Okuma Islemleri");
        FileReader dosyaOkuyucu = new FileReader(dosya);
        BufferedReader tamponOkuyucu = new  BufferedReader(dosyaOkuyucu);
        
        while((strYazi=tamponOkuyucu.readLine()) !=null){
            System.out.println(strYazi);
        }
        tamponOkuyucu.close();
    }

}
