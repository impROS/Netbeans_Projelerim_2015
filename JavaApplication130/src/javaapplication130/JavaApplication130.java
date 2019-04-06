
import java.util.Scanner;

public class Sinif {

static Scanner klavye = new Scanner(System.in);
double en, boy, genislik;

void olculer() {
System.out.print("Ka­rgonuzun Ölçüleri : ");
System.out.println(e­n * boy * genislik);
}

public static void main(String[] args) {
Sinif degisken = new Sinif();
System.out.println("­Kargonun Boyunu Giriniz!");
degisken.boy = klavye.nextDouble();
System.out.println("­Kargonun Enini Giriniz!");
degisken.en = klavye.nextDouble();
System.out.println("­Kargonun Genişliğini Giriniz!");
degisken.genislik = klavye.nextDouble();

double carpim = degisken.boy * degisken.en * degisken.genislik;
degisken.olculer();

if (carpim >= 0 && carpim <= 50) {

System.out.println("­Bu Kargonun Taşınma Fiyatı : 56 TL'dir.");

} else if (carpim >= 51 && carpim <= 100) {

System.out.println("­Bu Kargonun Taşınma Fiyatı : 112 TL'dir.");

} else if (carpim >= 101 && carpim <= 150) {

System.out.println("­Bu Kargonun Taşınma Fiyatı : 196 TL'dir.");
} else if (carpim >= 151 && carpim <= 200) {

System.out.println("­Bu Kargonun Taşınma Fiyatı : 250 TL'dir.");
} else {

System.out.println("­Bu Kargo Taşımayacak Kadar Büyük!");
}