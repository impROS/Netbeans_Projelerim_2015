package hastable2;

import java.util.*;
import javax.swing.*;

public class Hastable2 {

    public static void main(String[] args) {
        HashMap<Integer, String> a = new HashMap<Integer, String>();

        String s[] ={"Bir","iki","Uc"};
        for (int i = 0; i < s.length; i++) {
            a.put(i, s[i]);
        }
        String s2 = "HashMap sınıfı örneği\n";
        String s3 = "4 anahtarlı değer : " + a.get(4) + "\n";
        s3 += "tüm değerler = " + a.entrySet() + "\n";
        s3 += "tüm anahtarlar = " + a.keySet() + "\n";
        JOptionPane.showMessageDialog(null, s3, s2, JOptionPane.PLAIN_MESSAGE);
    }

    public static String cikti(Collection c) {
        String s = "";
        Iterator i = c.iterator();
        while (i.hasNext()) {
            s += i.next() + "\n";
        }
        return s;
    }


}

