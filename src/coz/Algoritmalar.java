
package coz;

public class Algoritmalar {
//	public static List dizi2=new ArrayList();
	public  int fark=0;
	public int sayi=0;
public  int[] karesi( int[] liste){
	int[] dizi2 =new int[3];
	for(int i=0;i<3;i++){
		int kare = liste[i]*liste[(int) i];
		dizi2[i]=kare;
		liste[i]=dizi2[i];
	}
	return liste;
}
public  int[] kubu( int[] dizi){
	int[] dizi2 =new int[3];
	for(int i=0;i<3;i++){
		int kare = dizi[i]*dizi[i]*dizi[i];
		dizi2[i]=kare;
		dizi[i]=dizi2[i];
	}
	return dizi;
}
public  int[] toplamaAlg(int [] dizi){
	int i=0;
	 fark =  dizi[i+1]-dizi[i];
	for(i=0;i<3;i++){
		dizi[i]+=fark;
	}
	return dizi;
}
public  boolean kareToplamAlg(int[] dizi){
 sayi =dizi[0];
	sayi=(int) Math.pow(sayi, 2);
for(int i=-5;i<10;i++){
	if(sayi+i==dizi[1]){
		fark=i;
		for(int j=1;j<2;j++){
			sayi=dizi[j];
			sayi=(int) Math.pow(sayi, 2)+fark;
			if(sayi!=dizi[j+1]){
				return false;
			}
		}
		return true;
	}
}
return false;
}

public  boolean kubToplamAlg(int[] dizi){
	 sayi =dizi[0];
		sayi=(int) Math.pow(sayi, 3);
	for(int i=-5;i<10;i++){
		if(sayi+i==dizi[1]){
			fark=i;
			for(int j=1;j<2;j++){
				sayi=dizi[j];
				sayi=(int) Math.pow(sayi, 3)+fark;
				if(sayi!=dizi[j+1]){
					return false;
				}
			}
			return true;
		}
	}
	return false;
	}

//public  int kareToplamAlgFarkBul(int[] dizi,int[] dizi2){//ilkinin karesinden kac eksik?
//fark=dizi2[0]-(dizi[0]*dizi[0]);
//return fark;
//}
public Boolean carpmaAlg(int[] dizi){
	int j;
	for(j=1;j<6;j++){
	 for(int i=0;i<dizi.length-1;i++){ 
		if (dizi[i+1]!=dizi[i]*j){
			break;
		}
		if(i==dizi.length-2){
			//AlgoritmaCozucu.yaz(j);
			//AlgoritmaCozucu.yaz(i);
		return true;	
		}
		}
	 }
	//AlgoritmaCozucu.yaz(j);
		return false;
}
	
}
