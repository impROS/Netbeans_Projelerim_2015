package herseyiara;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

public class HerseyiAra {

    static File[] klasoricindekiler;
    static File dosya;
    static FileWriter dosyaYazici;
    static BufferedWriter tamponYazici;
    private static String AranacakKlasor;
    private static String DosyaAdi;

    public static void main(String[] args) {

        File file = new File("H:\\");
        dosyayiHazirla();
        System.out.println("Dosyalar Bulunuyor..Lutfen Bekleyin..");

        listele(file);

        System.out.println("Tum Islemler Basariyla Tamamlandi");
    }

    private static void listele(File klasor) {
        try {
            klasoricindekiler = klasor.listFiles();
            for (File dosyalar : klasoricindekiler) {
                if (dosyalar.isDirectory()) {
                    listele(dosyalar);
                } else {
                    dosyayaYaz(dosyalar);
                }
            }
        } catch (Exception ex) {
        }
    }

    public static List usbBul() {
        List<String> listUsb = new ArrayList<>();
        File[] paths;
        FileSystemView fsv = FileSystemView.getFileSystemView();

        paths = File.listRoots();

        for (File path : paths) {
            if (fsv.getSystemTypeDescription(path).equalsIgnoreCase("Çıkarılabilir Disk")) {
                listUsb.add(path.toString());
            }
        }
        return listUsb;
    }

    public static void copyFile(File from, File to) throws IOException {

        if (to.exists() && to.length() == from.length()) {
            System.out.println("Dosya Zaten Var");
        } else {
            Files.copy(from.toPath(), to.toPath());
            System.out.println("basarili");
        }
    }

    public static void dosyayaYaz(File dosyalar) {
        try {
            HerseyiAra.tamponYazici.write(dosyalar + "");
            tamponYazici.newLine();
        } catch (IOException ex) {
            System.out.println("Hata Yazilamadi");
        }
    }

    public static void dosyayiHazirla() {
        try {
            dosya = new File("tumDosyalarson.txt");
            if (!dosya.exists()) {
                dosya.createNewFile();
            }
            dosyaYazici = new FileWriter(dosya, true);
            tamponYazici = new BufferedWriter(dosyaYazici);
        } catch (IOException ex) {

        }
    }
}
