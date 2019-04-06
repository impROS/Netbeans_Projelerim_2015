
package bufferedreader;

import java.io.*;
public class BufferedReader {


 public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
         File file = new File("1.txt");

    if (file.isDirectory()) {
      String[] files = file.list();
      for (int i = 0; i < files.length; i++){
            System.out.println("---Klasor Icerigi---");
        System.out.println(files[i]);
      }
    } else {
        System.out.println("---Dosya Icerigi---");
      FileReader fr = new FileReader(file);
      java.io.BufferedReader in = new java.io.BufferedReader(fr);
      String line;
      while ((line = in.readLine()) != null)
        System.out.println(line);
    }
    }
    
}
