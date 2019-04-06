
package deserializeexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {

public static void main(String args[]) {

		FileInputStream fileIn = null;
		ObjectInputStream in = null;

		try {
			fileIn = new FileInputStream("ogrenci.ser");
			in = new ObjectInputStream(fileIn);

			Ogrenci ogrenci = (Ogrenci) in.readObject();

			System.out.println("Dosyadan okunan ogrenci nesnesi: "
					+ ogrenci.getOgrNo() + " " + ogrenci.getIsim());

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
