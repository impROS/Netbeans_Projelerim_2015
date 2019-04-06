package kayitDeneme;

import java.io.*;

public class Kayit {

    private int hesap;
    private String soyIsim;
    private String Isim;
    private double hesaptakiPara;

    public void oku(RandomAccessFile dosya) throws IOException {
//RandomAccessFile = Raslantisal Ulasim dosyasi
        hesap = dosya.readInt();
        char first[] = new char[15];
        for (int i = 0; i < first.length; i++) {
            first[i] = dosya.readChar();
        }
        Isim = new String(first);
        char last[] = new char[15];
        for (int i = 0; i < first.length; i++) {
            last[i] = dosya.readChar();
        }
        soyIsim = new String(last);
        hesaptakiPara = dosya.readDouble();
    }

    public void yaz(RandomAccessFile dosya) throws IOException {
        StringBuffer buf;
        dosya.writeInt(hesap);
        if (Isim != null) {
            buf = new StringBuffer(Isim);
        } else {
            buf = new StringBuffer(15);
        }
        buf.setLength(15);
        dosya.writeChars(buf.toString());
        if (soyIsim != null) {
            buf = new StringBuffer(soyIsim);
        } else {
            buf = new StringBuffer(15);
        }
        buf.setLength(15);
        dosya.writeChars(buf.toString());
        dosya.writeDouble(hesaptakiPara);
    }

    public void yazhesap(int a) {
        hesap = a;
    }

    public int okuhesap() {
        return hesap;
    }

    public void yazIsim(String f) {
        Isim = f;
    }

    public String okuIsim() {
        return Isim;
    }

    public void yazsoyIsim(String f) {
        soyIsim = f;
    }

    public String okusoyIsim() {
        return soyIsim;
    }

    public void yazhesaptakiPara(double b) {
        hesaptakiPara = b;
    }

    public double okuhesaptakiPara() {
        return hesaptakiPara;
    }

    public static int boyut() {
        return 72;
    }
}
