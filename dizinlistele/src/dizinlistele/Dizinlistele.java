
package dizinlistele;

import java.io.*;

public class Dizinlistele {
    public static void main(String[] args) {
         File dir=new File("D:\\Winrar");   
 listTest(dir);
  }  
    
    
    public static String listTest(File dir){
    File[] list=dir.listFiles();       
    String dizin;
      dizin=list[0].getName();
    for(int i=1;i<list.length;i++){
      dizin+=list[i].getName();
    } 
        return dizin;
  }

}