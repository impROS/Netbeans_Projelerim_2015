
package randomyeni;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomYeni {

    public static void main(String[] args) {
        int dogru = 0;
        Scanner giris=new Scanner(System.in);
        List tlist = new ArrayList();//turkce dizi
        List elist = new ArrayList();//ingilizce dizi
        List randomlist =new ArrayList();
        List secenekler =new ArrayList();
        tlist.add( "Merhaba"); tlist.add( "Dunya"); tlist.add( "Araba"); tlist.add( "Ev"); tlist.add( "Buyuk"); tlist.add( "Fare");
        elist.add( "Hello");elist.add( "World");elist.add( "Car");elist.add( "House");elist.add( "Big");elist.add( "Mouse");
        int sayac=0;
        
       while(sayac!=4){
                 int randomsayi = ThreadLocalRandom.current().nextInt(0, tlist.size()); 
           if(sayac==0){
             
                     dogru = randomsayi;
               System.out.println(elist.get(randomsayi)+" Nedir?");
           }
     
           for (int j = 0; j <= randomlist.size()-1; j++){
while (randomsayi == (int)randomlist.get(j))
{
randomsayi = ThreadLocalRandom.current().nextInt(0, tlist.size()); 
}
       }
           sayac++;
           randomlist.add(randomsayi);
           secenekler.add(tlist.get(randomsayi));

       }
       //System.out.println(secenekler+""+secenekler.size());
       List yeniliste=new ArrayList();
       int sirala = 0;
 //      sirala = ThreadLocalRandom.current().nextInt(0, secenekler.size()); 
                  for (int j = secenekler.size(); j>0 ; j--){
 sirala = ThreadLocalRandom.current().nextInt(0, secenekler.size()); 
 yeniliste.add(secenekler.get(sirala));
 secenekler.remove(sirala);
                  }
                  for(int k=0;k<yeniliste.size();k++){
                  System.out.println((k+1)+"."+yeniliste.get(k));
                  }
//System.out.println(yeniliste);    
int secim=giris.nextInt()-1;
String yazi1= (String) tlist.get(dogru);
String yazi2= (String) yeniliste.get(secim);
if(yazi1.equals(yazi2)){
System.out.println("tebrikler");
}
else
    System.out.println("yanlis");
       }
   public static List ekle(String turkce,String ingilizce){
        Scanner ekle=new Scanner(System.in);

    return null;
    }

       }
              
