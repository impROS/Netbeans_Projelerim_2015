package usbpro;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

public class usbClass {

   static FileSystemView fsv = FileSystemView.getFileSystemView();

    public  List<File> usbBul() {
        List<File> listUsb = new ArrayList<>();
        File[] dizin;

        dizin = File.listRoots();

        for (File birim : dizin) {
            if (isUsb(birim)) {
                listUsb.add(birim);
            }
        }
        return listUsb;
    }

    static boolean isUsb(File brm) {
        String strBirimAd = fsv.getSystemTypeDescription(brm);
        if (strBirimAd.equalsIgnoreCase("Çıkarılabilir Disk") || strBirimAd.equalsIgnoreCase("Removable Disk")) {
            return true;
        } else {
            return false;
        }
    }
}
