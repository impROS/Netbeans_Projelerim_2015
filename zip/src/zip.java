//file : zip.java
//Turhan Çoban

import java.io.*;
import java.util.*;
import java.util.zip.*;
import javax.swing.JOptionPane;

public class zip {

    public static int sChunk = 8192;
 
    public static String[] dosyalistesi(String klasor) {
        File path = new File(klasor);
        if (path.isDirectory()) {
            ArrayList<String> x = new ArrayList<String>();
            File files[];
            files = path.listFiles();
            int n = files.length;
            int n1 = 0;
            for (int i = 0; i < n; i++) {
                if (!files[i].isDirectory()) {
                    x.add(files[i].toString());
                    n1++;
                }
            }
            String s1[];
            s1 = new String[n1];
            Iterator nn = x.iterator();
            int k = 0;
            while (nn.hasNext()) {
                s1[k++] = (String) nn.next();
            }
            return s1;
        } else {
            String[] s1 = new String[1];
            s1[0] = klasor;
            return s1;
        }
    }

    public static void main(String[] args) {
        String str = "";
        FileOutputStream out;
        ZipOutputStream zout;
        String zipname, source;
        int m, mmax = 1;
        String s = "NORMAL USAGE: \n"
                + "java zip zipfile file(or directory)name1 file(or directory)name2...\n"
                + " create a zip file and zip files(or files in the given dirctories)"
                + "Please define the zip file(name.zip)";
// anahtarı kontrol et
        String zipismi = "";
        String dosyaismi[];
        if (args.length == 0) {
            String s1 = "zip dosyası isim)\n" + s;
            zipismi = JOptionPane.showInputDialog(null, s);
            String s2 = "file(or directory) names are undefined\n"
                    + " please enter names\n";
            String s3 = JOptionPane.showInputDialog(null, s2);
            StringTokenizer token = new StringTokenizer(s3);
            m = token.countTokens();
            if (m > mmax) {
                mmax = m;
            }
            dosyaismi = new String[m];
            int j = 0;
            while (token.hasMoreTokens()) {
                dosyaismi[j++] = token.nextToken();
            }
        } // girdi dosyasını incele
        else if (args.length == 1) {
            zipismi = args[0];
            String s1 = "file(or directory) to be zipped is undefined please enter the name)\n" + s;
            dosyaismi = new String[1];
            dosyaismi[0] = JOptionPane.showInputDialog(null, s1);
        } else {
            zipismi = args[0];
            int n = args.length - 1;
            dosyaismi = new String[n];
            for (int i = 0; i < n; i++) {
                dosyaismi[i] = args[i + 1];
            }
        }
        if (zipismi.endsWith(".zip")) {
            zipname = zipismi;
            source = zipismi.substring(0, zipismi.length() - 3);
        } else {
            zipname = zipismi + ".zip";
            source = zipismi;
        }
//zip kanalını tanımla
        try {
            out = new FileOutputStream(zipname);
            zout = new ZipOutputStream(out);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Dosya oluşturma hatası : " + zipname + ".");
            return;
        }
        int k = 0;
        while (k < dosyaismi.length) {
            try {
                String ss[];
                ss = dosyalistesi(dosyaismi[k]);
                int j = 0;
                byte[] buffer = new byte[sChunk];
                while (j < ss.length) {
                    ZipEntry giris = new ZipEntry(ss[j]);
                    zout.putNextEntry(giris);
                    try {
                        FileInputStream in = new FileInputStream(ss[j]);
                        int length;
                        while ((length = in.read(buffer, 0, sChunk)) != -1) {
                            zout.write(buffer, 0, length);
                        }
                        in.close();
                    } //try sonu
                    catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "file zip error : " + ss[j]);
                    } //catch sonu
                    str += "ss[" + j + "][" + k + "] = " + giris + " done..\n";
                    j++;
                }//while sonu
            } //try sonu
            catch (IOException io) {
            }
            k++;
        } //while(k< sonu
        try {
            zout.close();
            out.close();
        } catch (IOException e) {
        }
        JOptionPane.showMessageDialog(null, zipname + " file is created with the following files : \n" + str);
        System.exit(0);
    }
}
