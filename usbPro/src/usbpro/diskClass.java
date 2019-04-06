package usbpro;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

public class diskClass {

    static FileSystemView fsv = FileSystemView.getFileSystemView();

    public List<File> diskBul() {
        List<File> listUsb = new ArrayList<>();
        File[] dizin;

        dizin = File.listRoots();

        for (File birim : dizin) {
            if (isDisk(birim)) {
                listUsb.add(birim);
            }
        }
        return listUsb;
    }

    static boolean isDisk(File brm) {
        String strBirimAd = fsv.getSystemTypeDescription(brm);
        System.out.println("Disk : "+strBirimAd);
        if (strBirimAd.equalsIgnoreCase("Yerel Disk") || strBirimAd.equalsIgnoreCase("Fixed Drive")) {
            return true;
        } else {
            return false;
        }
    }
}
