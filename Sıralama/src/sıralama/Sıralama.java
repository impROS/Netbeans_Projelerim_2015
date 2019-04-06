
package sıralama;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sıralama {

  
    public static void main(String[] args) {
       DosyaOkumaWithScanner("E:\\2.txt");
    }
    public static void DosyaOkumaWithScanner(String dosyaUrl){
		File file = new File(dosyaUrl);
		try {
			
			Scanner scanner = new Scanner(file);
//			while(scanner.hasNext()){ // kelime kelime okur. boşluklar silinir.
//				System.out.print(scanner.next());
//			}
			
			while(scanner.hasNext()){
				System.out.println(scanner.next()); // satır satır okur
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı..");
		}
		
	}
}
