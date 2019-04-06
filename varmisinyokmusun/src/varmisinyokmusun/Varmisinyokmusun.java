
package varmisinyokmusun;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Varmisinyokmusun {

    public static void Mesaj(String Mesaj) {
        System.out.print("n" + Mesaj);
    }

    public static int RastgeleSec(int Max) {
        Random r = new Random();
        int Secim = r.nextInt(Max);
        return Secim;
    }

    public static void ParalariKutularaAt(int[] para, int[] RandomPara) {

        int Rast;
        for (int i = 0; i < 22; i++) {

            Rast = RastgeleSec(22);

            if (para[Rast] != 0) {
                RandomPara[i] = para[Rast];
                para[Rast] = 0;
            } else {
                i--;
            }
        }

    }

    public static void KutularinIciniYaz(int[] RandomPara) {
        for (int i = 0; i < 22; i++) {
            System.out.print("n" + (i + 1) + ". kutu:" + RandomPara[i]);
        }
    }

    public static String TeklifVer(int[] AcilanKutular, int[] ParaKutulari) {

        long AcilmayanKutuToplami = 0;
        long AcilanKutuToplami = 0;
        int AcilanKutuSayisi = 0;

        for (int i = 0; i < 22; i++) {

            if (AcilanKutular[i] != 0) {
                AcilanKutuToplami += ParaKutulari[i];
                //Mesaj("Toplanan " + (i+1) + ". Kutu : " + ParaKutulari[i]);
                AcilanKutuSayisi++;
            } else {
                AcilmayanKutuToplami += ParaKutulari[i];
            }
        }
        return Long.toString((AcilmayanKutuToplami - AcilanKutuToplami) / AcilanKutuSayisi);
    }

    public static void KutuDurumlari(int[] AcilanKutular, int[] ParaKutulari) {

        for (int i = 0; i < 22; i++) {

            String Durum, Kutu;
           
            if((ParaKutulari[i] != AcilanKutular[i])){
                Durum = "Açılmadı";
                Kutu = "[" + (i + 1) + "] . Kutu : " + ParaKutulari[i];
            }
            else {
                Durum = "AÇILDI";
                Kutu = " " +(i + 1) + " . Kutu : " + ParaKutulari[i];
            }
           
            Mesaj( Kutu + " " + Durum);
        }
    }

    public static void main(String[] args) throws IOException {

        int[] para = {1, 2, 5, 10, 25, 50, 100, 200, 300, 400, 500, 5000, 10000, 15000, 25000, 50000, 75000, 100000, 150000, 250000, 500000, 500000};
        int[] ParaKutulari = new int[22];
        BufferedReader Klavye = new BufferedReader(new InputStreamReader(System.in));
        int[] AcilanKutular = new int[22];

        ParalariKutularaAt(para, ParaKutulari);

        //KutularinIciniYaz(ParaKutulari);
        //Yarismaci Kutu Seciyor
        int YarismaciKutusu = RastgeleSec(22);
        Mesaj("Seçtiğiniz kutu  :" + YarismaciKutusu);

        int KutuNo = 0;
        do {
            Mesaj("-----------------Kutu Durumları------------------");
            KutuDurumlari(AcilanKutular, ParaKutulari);
            Mesaj("-----------------Açılmayan Kutu Sayısı " + (22 - KutuNo) + "------------");

            Mesaj("Açmak İçin Kutu numarası seçiniz: ");
            int SecilenKutu = new Integer(Klavye.readLine());

            //Mesaj("Kutu" + SecilenKutu + " içeriği :" + ParaKutulari[SecilenKutu-1]);
            if (SecilenKutu - 1 == YarismaciKutusu) {
                Mesaj("Kendi kutunuzu açamazsınız");
                continue;
            }

            AcilanKutular[SecilenKutu - 1] = ParaKutulari[SecilenKutu - 1];

            if (KutuNo % 2 == 0) {
                Mesaj("Banka Teklifi :" + TeklifVer(AcilanKutular, ParaKutulari));
            }

            KutuNo++;

        } while (KutuNo < 18);
    }

}