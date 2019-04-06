package improsalgoritmacozucu;
import java.util.Arrays;
import java.util.Scanner;
public class impROSAlgoritmaCozucu {
	private static Scanner giris;
	public static void main(String[] parametreler){
		giris = new Scanner(System.in);
		int i=0;
		int[] dizi =new int[3];
		Boolean kontrol = false;
while(i!=3){
	yaz(i+".elamını giriniz");
	dizi[i]=giris.nextInt();
i++;
}
int[] diziyedek=new int[3];
System.arraycopy(dizi, 0,diziyedek,0,3);
yaz("Dizi1 = "+Arrays.toString(dizi));
ayrac();
Algoritmalar algo = new Algoritmalar();

algo.karesi(dizi);
//yaz("kareleri"+Arrays.toString(dizi));
kontrol =karsilastir(diziyedek,dizi);
yaz("Kare algoritması = "+ kontrol);
if(kontrol){
	yaz("**************************************************");
	yaz("Algoritma Bulundu!Dizi Algoritması = n kare");
	yaz("**************************************************");
}
diziSifirla(diziyedek,dizi);

algo.kubu(dizi);
//yaz("Kubleri"+Arrays.toString(dizi));
kontrol =karsilastir(diziyedek,dizi);
ayrac();
yaz("Kub algoritması = "+kontrol);
if(kontrol){
	yaz("**************************************************");
	yaz("Algoritma Bulundu!Dizi Algoritması = n kup");
	yaz("**************************************************");
}
diziSifirla(diziyedek,dizi);
ayrac();

algo.toplamaAlg(dizi);
//yaz("Toplama Sonuc = "+Arrays.toString(dizi));
kontrol =karsilastir(diziyedek,dizi);
yaz("Toplama algoritması = "+kontrol);
if(kontrol){
	yaz("**************************************************");
	yaz("Algoritma Bulundu!Dizi Algoritması = n+"+algo.fark);
	yaz("**************************************************");
}
	diziSifirla(diziyedek,dizi);
	ayrac();
	
	dizi=algo.kareToplamAlg(dizi);
	yaz(Arrays.toString(dizi));
	kontrol =karsilastir(diziyedek,dizi);
yaz("Kare+Toplama algoritması = "+kontrol);
	if(kontrol){
		yaz("**************************************************");
		yaz("Algoritma Bulundu!Dizi Algoritması = n kare+"+algo.kareToplamAlgFarkBul(diziyedek,dizi));
		yaz("**************************************************");
}
	diziSifirla(diziyedek,dizi);
	ayrac();
	
	
	algo.carpmaAlg(dizi);
	yaz(Arrays.toString(dizi));
	kontrol =algo.carpmaAlg(dizi);
yaz("Carpma algoritması = "+kontrol);
	if(kontrol){
		yaz("**************************************************");
		try{
		int carpan=diziyedek[1]/diziyedek[0];
		yaz("Algoritma Bulundu!Dizi Algoritması = n * "+carpan);
		yaz("**************************************************");
		}
		catch(java.lang.ArithmeticException hata){
			yaz("**************************************************");
		yaz("Algoritma Bulundu!Dizi Algoritması = n * 0");
		yaz("**************************************************");
				}
		
}
	ayrac();
	
	
	}
	public static Boolean karsilastir(int[] dizi,int[] dizi2){
		for(int i=0;i<dizi.length-1;i++){
			if(dizi[(i+1)]!=dizi2[i]){
				return false;
			}
		}
		return true;
	}
	public static void yaz(String yazi){// yazma
		System.out.println(yazi);
	}
	public static void yaz(int sayi){
		System.out.println(sayi);
	}
public static void diziSifirla(int[] diziYedek,int[] kaynakDizi){
	System.arraycopy(diziYedek, 0,kaynakDizi,0,3);
}
public static void ayrac(){
	System.out.println("-------------------------------------------");
}
}