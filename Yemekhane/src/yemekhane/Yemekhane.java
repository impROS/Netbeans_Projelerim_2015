
package yemekhane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Yemekhane {

    public static void main(String[] args) {
    DosyaOkumaWithScanner("E:\\1.txt");
    }
    	public static void DosyaOkumaWithScanner(String dosyaUrl){
		File file = new File(dosyaUrl);
		try {
			
			Scanner scanner = new Scanner(file);
//			while(scanner.hasNext()){ // kelime kelime okur. boşluklar silinir.
//				System.out.print(scanner.next());
//			}
			String kontrol;
                        int kontrol2=0;
			while(scanner.hasNextLine()){
                            kontrol=scanner.nextLine();
                            kontrol = kontrol.replaceAll("( )+", " ");
                            if(kontrol.length()>2){
                                if(kontrol2==0){
                                if(kontrol.charAt(kontrol.length()-2)==2){
                                    
                                }
                                }
                                //   kontrol2= 1;
                                
                            if(!kontrol.isEmpty()){
                               
           
				System.out.println(kontrol); // satır satır okur
                            }
                            }
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("Dosya Bulunamadı..");
		}
		
	}
}
