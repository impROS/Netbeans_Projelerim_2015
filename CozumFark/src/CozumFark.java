import java.util.Scanner;

public class CozumFark {

	static int min, max;

	public static void main(String[] args) {
		String sayilar = sayilariAl();
		System.out.println("Sayilar = "+sayilar);
		
		String eksikSayilar = farkBul(sayilar);
		System.out.println("Eksik Sayilar = " + eksikSayilar);
		
	}

	static String sayilariAl() {
		Scanner giris = new Scanner(System.in);
		int girilenSayi;
		String strSayilar = "";
		System.out
				.println("Lutfen Tek Tek Sayilarý Giriniz.\nCikmak icin 0 a basiniz");
		girilenSayi = giris.nextInt();
		min = girilenSayi;
		while (girilenSayi != 0) {
			if (girilenSayi == 0) {
			
			} else {
				
				strSayilar += girilenSayi + ",";
				max = girilenSayi;
			}
			girilenSayi = giris.nextInt();
		}
		return strSayilar;
	}

	static String farkBul(String strSayilar) {

		String strEksikSayilar = "";
int tempIlkSayi;
		int beginIndex = 0;
		int endIndex = 0;

		while (endIndex != -1) {
			
			endIndex = strSayilar.indexOf(",", beginIndex);
		
			int ilkSayi = Integer.parseInt(strSayilar.substring(beginIndex,endIndex));
			tempIlkSayi=ilkSayi;
			System.out.println("ilk sayi = "+ilkSayi);
			
			beginIndex = endIndex;
		

			endIndex = strSayilar.indexOf(",", beginIndex+1);
			int ikinciSayi = Integer.parseInt(strSayilar.substring(beginIndex+1, endIndex));
			System.out.println("ikinciSayi =  "+ikinciSayi);
			
			beginIndex = endIndex;
			
			System.out.println("endindex = "+endIndex);
			
			
			
			if(endIndex == -1){
				ikinciSayi=ilkSayi;
				
				
			}else{
				 tempIlkSayi = ilkSayi+1;

			while (tempIlkSayi != ikinciSayi) {
				strEksikSayilar += tempIlkSayi + "  ";
				tempIlkSayi++;
			}
				
			}
			

		}
System.out.println(strEksikSayilar);
		return strEksikSayilar;
	}
}