package dosyaaramaeverythinh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class DosyaAramaEverythinh {

    private static String AranacakKlasor;
    private static String DosyaAdi;
    private static ArrayList DosyaIsimHavuzu = new ArrayList<String>();

    public static void main(String[] args) {
//        Iterable<Path> dirs = FileSystems.getDefault().getRootDire ctories();
//for (Path name: dirs) {
//    System.out.println(name.toFile());
//       
//        listele(name);
//}
        File file = new File("H:\\"); //root

        listele(file);

    }

    private static void listele(File klasor) {

        try {
            File[] klasoricindekiler = klasor.listFiles();
            for (File klasoricindekiler1 : klasoricindekiler) {
                if (klasoricindekiler1.isDirectory()) {
                 //DosyaIsimHavuzu.add(klasoricindekiler1);
                    // System.out.println(klasoricindekiler1);
                    listele(klasoricindekiler1);
                } else {
                    if (klasoricindekiler1.getName().toLowerCase().endsWith(".doc") || klasoricindekiler1.getName().toLowerCase().endsWith(".docx")) {
                        DosyaIsimHavuzu.add(klasoricindekiler1);
                        copyFile(klasoricindekiler1, new File("E:\\Veriler\\" + klasoricindekiler1.getName()));
                        System.out.println(klasoricindekiler1);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void listele(Path klasor) {
        File[] klasoricindekiler = klasor.toFile().listFiles();
        for (File klasoricindekiler1 : klasoricindekiler) {
            if (klasoricindekiler1.isDirectory()) {
                listele(klasoricindekiler1);
            } else {
                DosyaIsimHavuzu.add(klasoricindekiler1);
                System.out.println(klasoricindekiler1);
            }
        }
    }

    public static List usbler() {
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

   
}
