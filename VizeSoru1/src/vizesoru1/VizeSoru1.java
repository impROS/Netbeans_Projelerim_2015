//impROS 

/* Soru = Girilen bir dizinin ilk ve son elemaninin 0 olup olmadigini kontrol eden bir class yazin,
bu classdaki metot eger ilk ve son  eleman 0 ise  true,degilse false degerini dondurecek.
Sonra da bir tane classla programi calistirabilir hale getirip sinayiniz.*/
package vizesoru1;

public class VizeSoru1 {

    public static void main(String[] args) {
        SifirMi sifirmiclass =new SifirMi(); //SifirMi classımızdan sifirmiclass adında  bir nesne olusturduk 
        //ve artik bunun üzerinden SifirMi classının tüm özelliklerine erişebileceğiz
       int[] Dizi={1,2,5,6,0};//deneme amacli bir dizi olusturduk,bu diziyi degistrip programi sinayabilirsiniz
       if(sifirmiclass.sifirMi(Dizi)){//eger Dizinin kosulumuza uyuyor   ise
           System.out.println("Dizinin ilk ve son harfi 0 dır");//olumlu yaz
       }
       else{//degilse
        System.out.println("İlk Eleman veya son eleman sifir değildir");//olumsuz yaz
       }
    }
    
}
