/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ini2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Ini2 {

    public static void main(String[] args) throws IOException {
        iniIslem iniIslem = new  iniIslem("user.ini");
       // iniIslem.yeniAnahtar("admin");
       iniIslem.yaz("admin", "impROS2");
       iniIslem.yaz("admin2", "impROS2");
      System.out.println("okundu :" + iniIslem.oku("admin"));
      iniIslem.yeniAnahtar("admin3");
      iniIslem.yeniAnahtar("admin4","Ridvan");
      iniIslem.listele();
    }


}
