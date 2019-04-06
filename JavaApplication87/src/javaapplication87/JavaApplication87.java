
package javaapplication87;


public class JavaApplication87 {


    public static void main(String[] args) {
 int sayac=1,sayac2;
  for(int i=0;i<10;i++){
  if(i>=5){
       if(i==9){ System.exit(0);}
  sayac2=i-sayac;
  sayac+=2;
 
  }else{
  sayac2=i;
  }
  
  for(int j=0;j<sayac2;j++){
      System.out.print("*");
  }
      System.out.println("");
  }
    }
    
}
