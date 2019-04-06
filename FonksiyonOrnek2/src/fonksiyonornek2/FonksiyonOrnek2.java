//impROS
//Fonksiyon Tanimlama
package fonksiyonornek2;
public class FonksiyonOrnek2 {

    public static void main(String[] args) 
    {
        int SayiGercek=2;//burda bir tamsayi tanimladik ve 2 ye esitledik
        int sonuc=kupAlma(SayiGercek); //burda sayimizi kubAlma fonksiyonumuza yolladik ve ciktisini sonuc adlı tamsayımızda tuttuk..
        System.out.println(SayiGercek+" sayisinin kubu = "+sonuc);//burda kullaniciya sonucu gosterdik
    }
    
    static int kupAlma(int SayiTemsili){//asil fonksiyonumuz burda tanimlandi..fonksiyonumuzun olusturulma sekli soyle:
/* (static "ne tur deger dondurecek" "Fonksiyon adi"("temsili degerler)"//burda temsili degerler dedigimiz fonksiyona yollayacagimiz gercek degerlerin yerini
        //tutan degerler..mesela integer turunde bir deger yollayacaksak integer turunde bir temsili degerimizin olması gerek..
        return SayiTemsili*SayiTemsili*SayiTemsili;//burda returnde sayiniz 3 kez kendisiyle carpimini yolla dedik..
        //burda dikkat edilmesi gereken nokta return komutunu yazmak zorundayız,aksi halde fonksiyon bir deger dondurmedigi icin hatalı olur..
        //return komutu ile sadece fonksiyonu hangi degisken turunde yaptıysak o tur degerler dondurebiliriz..*/
        return SayiTemsili*SayiTemsili*SayiTemsili;
    }
}
//impROS