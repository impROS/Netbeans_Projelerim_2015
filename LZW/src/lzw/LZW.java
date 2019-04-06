package lzw;

import java.io.*;
import java.util.*;

public class LZW {

    public static List<Integer> compress(String uncompressed) {

        int box_size = 256;

        Map<String, Integer> box = new HashMap<String, Integer>();

        for (int i = 0; i < 256; i++) {
            box.put("" + (char) i, i);//initialize table...
        }

        List<Integer> result = new ArrayList<Integer>();

        String p = "";

        for (char c : uncompressed.toCharArray()) {
            if (box.containsKey(p + c) == true) {
                p = p + c;
            } else {
                result.add(box.get(p));
                box.put(p + c, box_size++);
                p = "" + c;

            }

        }//for sonu...

        if (p.equals("") == false) {
            result.add(box.get(p));
        }

        return result;

    }

    public static String decompress(List<Integer> compressed) {

        int box_size = 256;

        Map<Integer, String> box = new HashMap<Integer, String>();

        String result = "";
        for (int i = 0; i < 256; i++) {
            box.put(i, "" + (char) i);
        }

        String p = "" + (char) (int) compressed.remove(0);

        result = p;

        String entry = "";
        for (int k : compressed) {
            if (box.containsKey(k) == true) {
                entry = box.get(k);
            } else if (k == box_size) {
                entry = p + p.charAt(0);
            } else {
                System.err.println();//hata...
            }

            result = result + entry;

            box.put(box_size++, p + entry.charAt(0));

            p = "" + entry;
        }//for sonu

        return result;
    }

    public static void main(String[] args) throws IOException {

        String text = "impROS asdasda ad asdad";

        try {
            FileInputStream fıs = new FileInputStream("sıkıstır2.txt");
            InputStreamReader ısr = new InputStreamReader(fıs);
            BufferedReader br = new BufferedReader(ısr);

            String l = br.readLine();

            while (l != null) {
                text += l;
                l = br.readLine();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Integer> compressed = compress(text);

        System.out.println("" + compressed);

        FileWriter fw = new FileWriter("sıkıstır.txt");
        fw.write("" + compressed);
        fw.close();

        String decompressed = decompress(compressed);

        System.out.println(decompressed);

        FileWriter fw2 = new FileWriter("cozulen.txt");
        fw2.write(decompressed);
        fw2.close();
    }
}
