
package ucak;
import java.util.Scanner;
public class Ucak {

 
public static Scanner  giris =new Scanner(System.in);
 public static void main(String[] args) {
     int[] koltuklar={0,0,0,0,0,0,0,0,0,0};
	String[] koltukSahibi=new String[10];
     int secim =secim(),koltukSecim;
     String sorgu ;
while(secim!=0){
		if(secim==0){
			yaz("impROS Hava Yolları İyi Gunler Diler");
			System.exit(0);
		}
		else if(secim==1){
                    yaz("Sigara İcecek Misiniz ?");
                    sorgu = giris.next();
                    
                    if(sorgu.equalsIgnoreCase("E")) {
                    int bosKontrol=1;
                    for(int i=5;i<10;i++){
                        if(koltuklar[i]==0){
                        bosKontrol=koltuklar[i];
                        }
				yaz((i+1)+".Koltuk = "+koltuklar[i]);
			}
                    if(bosKontrol==0){
			yaz("Secmek istediginiz koltuk numarasını giriniz");
			koltukSecim=giris.nextInt();
                        while(koltukSecim<6 || koltukSecim >10){
                        yaz("Secmek istediginiz koltuk hatali.Lutfen tekrar giriniz");
			koltukSecim=giris.nextInt();
                        }
			if(koltuklar[koltukSecim-1]==1 ){
				yaz("Bu Koltuk Dolu,Secemezsiniz.Lutfen baska bir koltuk seciniz");
			}
			else if(koltuklar[koltukSecim-1]==0){
				yaz("Koltuk Sahibinin İsmini Giriniz");
				sorgu=giris.next();
				koltukSahibi[koltukSecim-1]=sorgu;
				koltuklar[koltukSecim-1]=1;
			}
                    }
                    else if(bosKontrol==1){
                    yaz("Sigara İcen Bolumde Tum Koltuklar Dolu.Sigara İcilmeyen Bolumde Rezervasyon Yapmak İster Misiniz ?");
                    }
                    }
                    else if(sorgu.equalsIgnoreCase("H")) {
                        int bosKontrol = 1;
                    for(int i=0;i<5;i++){
                        if(koltuklar[i]==0){
                        bosKontrol=koltuklar[i];
                        }
				yaz((i+1)+".Koltuk = "+koltuklar[i]);
			}
                    if(bosKontrol==0){
			yaz("Secmek istediginiz koltuk numarasını giriniz");
			koltukSecim=giris.nextInt();
                        while(koltukSecim<1 || koltukSecim >6){
                        yaz("Secmek istediginiz koltuk hatali.Lutfen tekrar giriniz");
			koltukSecim=giris.nextInt();
                        }
			if(koltuklar[koltukSecim-1]==1 ){
				yaz("Bu Koltuk Dolu,Secemezsiniz.Lutfen baska bir koltuk seciniz");
			}
			else if(koltuklar[koltukSecim-1]==0){
				yaz("Koltuk Sahibinin İsmini Giriniz");
				sorgu=giris.next();
				koltukSahibi[koltukSecim-1]=sorgu;
				koltuklar[koltukSecim-1]=1;
			}
                    }
                    else if(bosKontrol==1){
                    yaz("Sigara İcilmeyen Bolumde Tum Koltuklar Dolu.Sigara İcilen Bolumde Rezervasyon Yapmak İster Misiniz ?");
                    }
		}
                }
		else if(secim==2){
			yaz("Sorgulamak istediginiz ismi giriniz");
			sorgu=giris.next();
			for(int j=0;j<10; j++){
			if(sorgu.equalsIgnoreCase(koltukSahibi[j])){
				yaz("Kayit Bulundu.Koltuk Numaranız = "+(j+1));
				break;
			}
	if(j==9){
	yaz("Kayit Bulunamadi");
	}
			}
		}
		 secim=secim();
	}

 }
 static int secim(){
         yaz("Lutfen Seciminizi Yapiniz\n0-Cikis\n1-Kayit\n2-Kayit Sorgulama");
 int secim2;
        secim2 = giris.nextInt();
 return secim2;
 }
    public static void yaz(String yazi){
	System.out.println(yazi);
	
}   
public static void yaz(int sayi){
	System.out.println(sayi);
	
}
}
