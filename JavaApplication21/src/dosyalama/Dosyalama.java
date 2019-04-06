package dosyalama;

import java.io.*;

import java.util.*;

public class Dosyalama {

   
 public static void main(String[] args) throws IOException  {
   
     Scanner verial=new Scanner(System.in);
        
    
    System.out.println("oluşturulacak 10 dosya ismini giriniz.."); 
  int sayac=0;   
  
        while(sayac<10)
        {
  
          
            System.out.print(".dosya ismini giriniz: ");
      
  String ad=verial.nextLine();
    
    File f=new File(ad+".txt");
    
    if(!f.exists()) { 
            f.createNewFile();
    
        System.out.println(f.getName()+" adlı "+" .dosyanız başarı ile oluşturulmuştur.. :) ");
      
  sayac++;   
        
    System.out.println("sayac= " +sayac);
}
        
else {
         
     System.out.println("böyle bir dosya zaten var başka bir dosya ismini gir!"); 
      
        System.out.println("sayyac= " +sayac);
}
           
 System.out.println();
   
     
        }
        

        
        String cvp;
        
   
     do {
         
   System.out.println();
            
        
    System.out.println("silmek istediğiniz dosya ismini giriniz..");  
       
     String ad1=verial.nextLine();
         
   File f=new File(ad1+".txt");
        
    
    if(!f.exists()) {
            System.out.println("mevcut dizinde böyle bir dosya yoktur..");
    
    }    

        else {
            f.delete(); 
System.out.println(f.getName()+" adlı dosya başarı ile silinmiştir.. :)");
}
        
        
        
    System.out.println("devam etmek istiyor musunuz?(e\\h)");
      
  
         cvp=verial.next();
      
  }while(cvp.equalsIgnoreCase("e")) ;
   
     
                    
    
    } 
   
 
}

