
package cevirimdeneme;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class CevirimDeneme {
static String strVeri="";
   static byte[] veriler;
    static File dosya;
    public static void main(String[] args) throws IOException {
byte[] byteVeriler = binaryOku("resOkunacak.jpg");
String[] strVeriler = toString(byteVeriler);
//byte[] byteVeriler2 = toByte(strVeriler);


//String example = "This is an example";
////Convert String to byte[] using .getBytes() function
//byte[] bytes;
////Convert byte[] to String using new String(byte[])      
//String s = new String(veriler);
//bytes = s.getBytes();

        binaryYaz("resYazilan.jpg", byteVeriler);
    }
     static byte[] binaryOku(String strDosya) throws IOException {
        dosya = new File(strDosya);
        FileInputStream binaryOku = new FileInputStream(dosya);
        BufferedInputStream binaryTampon = new BufferedInputStream(binaryOku);
        veriler = new byte[(int) dosya.length()];
        binaryTampon.read(veriler, 0, veriler.length);
        binaryTampon.close();

        return veriler;
    }

    static void binaryYaz(String strYazilacakDosya, byte[] yazilacakVeri) throws IOException {
        dosya = new File(strYazilacakDosya);
        FileOutputStream binaryYaz = new FileOutputStream(strYazilacakDosya);
        BufferedOutputStream binaryTampon = new BufferedOutputStream(binaryYaz);
        binaryTampon.write(yazilacakVeri);
        binaryTampon.close();
    }
    private static String[] convertToStrings(byte[][] byteStrings) {
    String[] data = new String[byteStrings.length];
    for (int i = 0; i < byteStrings.length; i++) {
        data[i] = new String(byteStrings[i], Charset.defaultCharset());

    }
    return data;
}
 public static String[] toString(byte[] bytes) {
        ArrayList<String> strList = new ArrayList<String>();
        for (int i=0; i< bytes.length;) {
            byte[] lenArray = new byte[4];
            for (int j=i; j<i+4; j++) {
                lenArray[j-i] = bytes[j];
            }
            ByteBuffer wrapped = ByteBuffer.wrap(lenArray);
            int len = wrapped.getInt();
            byte[] strArray = new byte[len];
            for (int k=i+4; k<i+4+len; k++) {
                strArray[k-i-4] = bytes[k];
            }
            strList.add(new String(strArray));
            i += 4+len;
        }
        return strList.toArray(new String[strList.size()]);
    }
 public static byte[] toByte(String[] strs) {
        ArrayList<Byte> byteList = new ArrayList<Byte>();
        for (String str: strs) {
            int len = str.getBytes().length;
            ByteBuffer bb = ByteBuffer.allocate(4);
            bb.putInt(len);
            byte[] lenArray = bb.array();
            for (byte b: lenArray) {
                byteList.add(b);
            }
            byte[] strArray = str.getBytes();
            for (byte b: strArray) {
                byteList.add(b);
            }
        }
        byte[] result = new byte[byteList.size()];
        for (int i=0; i<byteList.size(); i++) {
            result[i] = byteList.get(i);
        }
        return result;
    }
}
