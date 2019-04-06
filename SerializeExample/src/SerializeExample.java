
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class SerializeExample {

public static void main(String[] args) {
    Ogrenci ogrenci1=new Ogrenci(1,"Ali,",20);
yaz(ogrenci1);
 Ogrenci ogrenci2=new Ogrenci(2,"Veli,",30);
yaz(ogrenci2);

         oku();
	}
public static void yaz(Ogrenci ogrenci){
		
		ObjectOutputStream out = null;
		FileOutputStream fileOut = null;

		try {
			fileOut = new FileOutputStream("ogrenci.ser");
			out = new ObjectOutputStream(fileOut);
			out.writeObject(ogrenci);
		} catch (IOException i) {
			i.printStackTrace();
		}
		finally {
			try {
				if (out != null)
                                    out.close();
                                if (fileOut != null)
				    fileOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
public static void oku(){
FileInputStream fileIn = null;
		ObjectInputStream in = null;

		try {
			fileIn = new FileInputStream("ogrenci.ser");
			in = new ObjectInputStream(fileIn);

			Ogrenci ogrenci = (Ogrenci) in.readObject();

			System.out.println("Dosyadan okunan ogrenci nesnesi: "
					+ ogrenci.getOgrNo() + " " + ogrenci.getIsim()+ogrenci.getYas());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
                                if (in != null)
				    in.close();
				if (fileIn != null)
                                    fileIn.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
}
}