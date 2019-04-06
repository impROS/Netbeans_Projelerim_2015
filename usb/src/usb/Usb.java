/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usb;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author x.impROS.x
 */
public class Usb {
public static void main(String args[]){
    List <File>files = Arrays.asList(File.listRoots());
    for (File f : files) {
      String s = FileSystemView.getFileSystemView().getSystemDisplayName(f);
      System.out.println("*" + s);
    }
      /* output (French WinXP)

            *
            *REGA1 (C:)
            *
            *My Book (F:)
      */

    /*
    For a USB key, getSystemTypeDescription() will return "Disque amovible" (french) or "Removable disk" (english).
    */
  }
}