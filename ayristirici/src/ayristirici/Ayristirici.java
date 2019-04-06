/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayristirici;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author x.impROS.x
 */
public class Ayristirici {

  public static void main(String args[]) throws Exception {
    String regex = "(?<=http://)\\S+";
    Pattern pattern = Pattern.compile(regex);
 
    String icerik = "Deneme amacli bir yazi ";
    icerik += "http://java.sun.com http://www.melihsakarya.com http://www.ayvalik.org bakalim bunlari yakalayabilecekmi ";
    icerik += "milliyet deneme http://www.milliyet.com.tr/2008/12/10/ekonomi/?ver=60 iste ilk 11ler&ver=06 b alanı görmemeli";
 
    Matcher matcher = pattern.matcher(icerik);
 
    while (matcher.find()) {
      String msg = matcher.group();
      System.out.println(msg);
    }
  }
}