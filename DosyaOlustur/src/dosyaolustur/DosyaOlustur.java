
package dosyaolustur;

import java.io.File;
import java.io.IOException;

public class DosyaOlustur {

    public static void main(String[] args) {c
DosyaOlustur("dsfdsfdsf");
    }
    public static void DosyaOlustur(String URL){
		File f = new File("k:\\"+URL); //  yol belirtmeyip sadece dosya ismi belirttiğimiz zaman otomatik olarak bulunduğu klasöre göre işlem yapar.
										 // yani burada benim bilgisayara göre ; C:\Users\Buyukaptan\workspace\DosyaIslemleri konumuna göre işlem yapar.(Yol belirtmezsek)
		try {
			if(!f.exists()){ // eğer dosya yoksa 
				f.createNewFile(); // dosyamızı oluşturur. 
                                f.mkdir("k:\\sad");
				System.out.println(f.getName()+ " adlı dosya Oluşturuldu..");
			}else{
				System.out.println("Dosya olduğundan oluşturma işlemi yapılmayacaktır. ");
			}
		} catch (IOException e) { // hata yakalama
			// TODO: handle exception
			e.printStackTrace();
		}
}
}
