
package ogrencinotsistemi;
import java.util.InputMismatchException;
import java.util.Scanner;
public class OgrenciNotSistemi {

   	private static Scanner giris;

    public static void main(String[] args) {

	giris = new Scanner(System.in);
	int[][] ogrenciNot=new int[3][4];
	String [] isim=new String[3];
	int satir=0;
	for(satir=0;satir<3;satir++){
		yaz((satir+1)+".Ogrencinin Adini Giriniz");
		isim[satir]=giris.next();
		for(int i=0;i<4;i++){
			yaz(isim[satir]+" adli ogrencinin "+(i+1) +".notunu giriniz");

				girNot(ogrenciNot,satir,i);
				//ogrenciNot[satir][i]=giris.nextInt();
				//flag=true;
				}
//				catch(InputMismatchException hata1){
//				}
//				}
		//girNot(ogrenciNot,satir,i);

		}
	
	for(int i=0;i<3;i++){
		System.out.print(isim[i]+" isimli ogrencinin notlari = ");
		for(int k=0;k<4;k++){
	System.out.print(ogrenciNot[i][k]);	

	if(k<3){
		System.out.print(" - ");
	}
		}
		System.out.print(" ==> En Dusuk Notu = "+min(ogrenciNot,i)+" , En Yuksek Notu = "+max(ogrenciNot,i)+ " , Not Ortalaması = "+ort(ogrenciNot,i));
		yaz("");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
	}
}
public static int min(int[][] dizi,int no){
	int min=dizi[no][0];
	//yaz(dizi.length+""); =3
	for(int i=1;i<4;i++){
		if(dizi[no][i]<min){
			min=dizi[no][i];
		}
	}
	
	return min ;
}

public static int max(int[][] dizi,int no){
	int max=dizi[no][0];
	//yaz(dizi.length+""); =3
	for(int i=1;i<4;i++){
		if(dizi[no][i]>max){
			max=dizi[no][i];
		}
	}
	return max ;
}

public static double ort(int[][] dizi,int no){
	double ort=0,indexDeger=0;
	for(int i=0;i<4;i++){
		
			indexDeger=dizi[no][i];
			ort +=indexDeger;
		}
	ort/=4;
	return ort ;
}

	 public static void yaz(String yazi){
		 System.out.println(yazi);
	 }
	 static void girNot(int dizi[][],int no,int sira) {
		giris=new Scanner(System.in);
		try{
		 dizi[no][sira]=giris.nextInt();
		}
		catch(InputMismatchException hata){
			yaz("Lutfen Notu Sayi Olarak Giriniz");
			girNot(dizi,no,sira);
	 }
}
}