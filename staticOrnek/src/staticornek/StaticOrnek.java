package staticornek;
public class StaticOrnek {
 public static void main(String[] args) {
     //denemeclass dosyasından 2 tane farklı nesne olusturduk
        denemeclass deneme =new denemeclass();
        denemeclass deneme2 = new denemeclass();
        
        //olusturdugumuz nesnelerin degerini yazdirdik
        System.out.println("deneme.a degiskeni = "+deneme.a+"---"+"deneme.sayi1 degiskeni = "+deneme.sayi1);
        System.out.println("deneme2.a degiskeni = "+deneme2.a+"--"+"deneme2.sayi1 degiskeni = "+deneme2.sayi1);
        
        deneme.a=2;//olusturdugumuz deneme nesnesinin "static olan" a degiskenine 2 yi atadik
        deneme.sayi1=3;//ayni sekil deneme nesnesinin "static olmayan " sayi1 degiskenine 3 u atadik
        
        //burda deneme nesnesinin elemanlarını yazdirdik
 System.out.println("deneme.a degiskeni = "+deneme.a+"---"+"deneme.sayi1 degiskeni = "+deneme.sayi1); 
 //burda deneme2 nesnesinin elamanlarını yazdirdik
System.out.println("deneme2.a degiskeni = "+deneme2.a+"--"+"deneme2.sayi1 degiskeni = "+deneme2.sayi1);  

 /**puf nokta biz deneme2 nesnesinin a degiskenini degistirmedigimiz halde, deneme nesnesin a degiskenini degistirmemizle beraber,
 deneme2 nesnesinin de "static olan" a degiskeni degisti,ama "static olmayan"   sayi1 nesnesi degismedi */
//yani static(yerel) degiskenler  tum nesnelerde aynidir.1 nesne icinde farklı,baska bir nesne icinde farklı nesne alamazlar,
//tum nesneler tarafından ortak kullanılırlar 
    } 
}
