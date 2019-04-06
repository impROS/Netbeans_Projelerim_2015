package javaapplication66;
import java.util.*;
public class Javaapplication66 {
public static void main(String[] args) {
      Scanner klv=new Scanner(System.in);
      
      double[][] sales=new double[5][6];
      int urun,numara,secim;
      double dolardegeri,sayi=2.59,toplamSatis,toplamsatilanUrun;
      System.out.println("Bölüm seçmek için 1 numarasını giriniz.");
      secim=klv.nextInt();
      while(secim!=1 || secim!=1)
      {
        System.out.println("YANLIŞ BÖLÜM NUMARASI.LÜTFEN TEKRAR GİRİNİZ.");
        secim=klv.nextInt();
        }
       
      
while(secim<=4)      
{
    
       System.out.println("Lütfen satış temsilcisinin numarasını giriniz.");
       numara=klv.nextInt();
       
       if(numara==1)
       { 
           System.out.println("Birici satiş temsilcisine ait bölümdür.");
           System.out.println("Lütfen ürün numarasini giriniz.");
           urun=klv.nextInt();
  
           switch(urun)
           {
               case 0 :
               System.out.print("Ürün fiyatı [0,0]=");
               sales[0][0] = sales[0][0]+klv.nextDouble();
               dolardegeri=sales[0][0]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 1 :
               System.out.print("Ürün fiyatı [0,1]=");
               sales[0][1] = sales[0][1]+klv.nextDouble(); 
               dolardegeri=sales[0][1]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break; 
               case 2 :
               System.out.print("Ürün fiyatı [0,2]=");
               sales[0][2] = sales[0][2]+klv.nextDouble(); 
               dolardegeri=sales[0][2]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 3 :
               System.out.print("Ürün fiyatı [0,3]=");
               sales[0][3] =sales[0][3]+klv.nextDouble();  
               dolardegeri=sales[0][3]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 4 :
               System.out.print("Ürün fiyatı [0,4]=");
               sales[0][4] = sales[0][4]+klv.nextDouble();
               dolardegeri=sales[0][4]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               default:
               System.out.println("Böyle bir ürün numarasi yoktur.");
              
            }
       } 
       else if(numara==2)
        { 
           System.out.println("İKİNCİ satiş temsilcisine ait bölümdür.");
           System.out.println("Lütfen ürün numarasini giriniz.");
           urun=klv.nextInt();
           
           switch(urun)
           {
               case 0 :
               System.out.print("Ürün fiyatı [1,0]=");
               sales[1][0] =sales[1][0]+ klv.nextDouble();
               dolardegeri=sales[1][0]/sayi;
               System.out.println("dolar degeri ="+dolardegeri); 
             
               break;
               case 1 :
               System.out.print("Ürün fiytı [1,1]=");
               sales[1][1] = sales[1][1]+klv.nextDouble(); 
               dolardegeri=sales[1][1]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break; 
               case 2 :
               System.out.print("Ürün fiyatı [1,2]=");
               sales[1][2] = sales[1][2]+klv.nextDouble();
               dolardegeri=sales[1][2]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 3 :
               System.out.print("Ürün fiyatı [1,3]=");
               sales[1][3] = sales[1][3]+klv.nextDouble();
               dolardegeri=sales[1][3]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 4 :
               System.out.print("Ürün fiyatı [1,4]=");
               sales[1][4] = sales[1][4]+klv.nextDouble();
               dolardegeri=sales[1][4]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               default:
               System.out.println("Böyle bir ürün numarasi yoktur.");
           }
        }
       if(numara==3)
       { 
           System.out.println("ÜÇÜNCÜ satiş temsilcisine ait bölümdür.");
           System.out.println("Lütfen ürün numarasini giriniz.");
           urun=klv.nextInt();
  
           switch(urun)
           {
               case 0 :
               System.out.print("Ürün fiyatı [2,0]=");
               sales[2][0] = sales[2][0]+klv.nextDouble();
               dolardegeri=sales[2][0]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 1 :
               System.out.print("Ürün fiyatı [2,1]=");
               sales[2][1] = sales[2][1]+klv.nextDouble(); 
               dolardegeri=sales[2][1]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break; 
               case 2 :
               System.out.print("Ürün fiyatı [2,2]=");
               sales[2][2] = sales[2][2]+klv.nextDouble();
               dolardegeri=sales[2][2]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 3 :
               System.out.print("Ürün fyatı [2,3]=");
               sales[2][3] =sales[2][3]+ klv.nextDouble();
               dolardegeri=sales[2][3]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 4 :
               System.out.print("Ürün fiyatı [3,4]=");
               sales[2][4] = sales[2][4]+klv.nextDouble();
               dolardegeri=sales[2][4]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               default:
               System.out.println("Böyle bir ürün numarasi yoktur.");
              
            }
       } 
       if(numara==4)
       { 
           System.out.println("DÖRDÜNCÜ satiş temsilcisine ait bölümdür.");
           System.out.println("Lütfen ürün numarasini giriniz.");
           urun=klv.nextInt();
  
           switch(urun)
           {
               case 0 :
               System.out.print("Ürün fiyatı[3,0]=");
               sales[3][0] = sales[3][0]+klv.nextDouble();
               dolardegeri=sales[3][0]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 1 :
               System.out.print("Ürün fiyatı [3,1]=");
               sales[3][1] =sales[3][1]+ klv.nextDouble();
               dolardegeri=sales[3][1]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break; 
               case 2 :
               System.out.print("Ürün fiyatı [3,2]=");
               sales[3][2] = sales[3][2]+klv.nextDouble();
               dolardegeri=sales[3][2]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 3 :
               System.out.print("Ürün fiyatı [3,3]=");
               sales[3][3] =sales[3][3]+ klv.nextDouble(); 
               dolardegeri=sales[3][3]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               case 4 :
               System.out.print("Ürün fiyatı [3,4]=");
               sales[3][4] =sales[3][4]+ klv.nextDouble(); 
               dolardegeri=sales[3][4]/sayi;
               System.out.println("dolar degeri ="+dolardegeri);
               break;
               default:
               System.out.println("Böyle bir ürün numarasi yoktur.");
              
            }
       } 
       if(numara>5){
         System.out.println("BÖYLE BİR BÖLÜM YOKTUR.");
         }
          
         System.out.println("BAŞKA BÖLÜME GİTMEK İSTER MİSİNİZ?EVET İÇİN 1'E HAYIR İSE 5'E BASINIZ.");
         secim=klv.nextInt();
        
       for (int i=0;i<5;i++){
           for(int j=0;j<6;j++){
               System.out.print(sales[i][j]+"   ");
           }
           System.out.println("   ");
        }
       for (int i=0;i<4;i++){
           toplamSatis=0;
                   for(int j=0;j<5;j++)
                   toplamSatis=toplamSatis+sales[i][j];
                   System.out.println(i+1+". satıcının toplam satisi: "+toplamSatis);
                   }
       
       System.out.println();
       
       toplamsatilanUrun=0;
       for(int j=0;j<5;j++)
       {
           toplamsatilanUrun=0;
           toplamSatis=0;
           for(int i=0;i<4;i++)
           {
           toplamSatis=toplamSatis+sales[i][j];
           toplamsatilanUrun=toplamsatilanUrun+sales[i][j];
           
           }
           System.out.println(j+1+".ürünün toplam satisi :"+toplamsatilanUrun);
       }
      
}
}
}
