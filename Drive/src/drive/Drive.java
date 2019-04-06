/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drive;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author x.impROS.x
 */
public class Drive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> listUsb = new ArrayList<>();
        File[] paths;
        FileSystemView fsv = FileSystemView.getFileSystemView();

        paths = File.listRoots();

        for (File path : paths) {
            if (fsv.getSystemTypeDescription(path).equalsIgnoreCase("Çıkarılabilir Disk")) {
                listUsb.add(path.toString()) ;
            }
        }
        System.out.println("Usbler = "+listUsb);
    }
}
