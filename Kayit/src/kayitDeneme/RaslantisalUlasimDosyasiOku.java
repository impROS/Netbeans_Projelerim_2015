package kayitDeneme;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import kayitDeneme.Kayit;

public class RaslantisalUlasimDosyasiOku extends Frame implements ActionListener {

    private TextField hesapAlani, isimAlani, soyisimAlani, hesaptakiParaAlani;
    private Button birsonraki, kapat;
    private RandomAccessFile girdi;
    private Kayit hesapDosyasi;

    public RaslantisalUlasimDosyasiOku() {
        super("Musteri dosyasini oku");
        try {
            girdi = new RandomAccessFile("musteri1.dat", "r");
        } catch (IOException e) {
            System.err.println("Dosya acilamadi\n" + e.toString());
            System.exit(1);
        }
        hesapDosyasi = new Kayit();
        setSize(300, 150);
        setLayout(new GridLayout(5, 2));
        add(new Label("Hesap numarasi :"));
        hesapAlani = new TextField();
        add(hesapAlani);
        add(new Label("isim : "));
        isimAlani = new TextField(20);
        add(isimAlani);
        add(new Label("soyisim : "));
        soyisimAlani = new TextField(20);
        add(soyisimAlani);
        add(new Label("Hesaptaki para : "));
        hesaptakiParaAlani = new TextField(20);
        add(hesaptakiParaAlani);
        birsonraki = new Button("bir sonraki hesap");
        birsonraki.addActionListener(this);
        add(birsonraki);
        kapat = new Button("cikis");
        kapat.addActionListener(this);
        add(kapat);
        setVisible(true);
    }

    public void okuKayit() {
        int hesap;
        String ilk, son;
        double balance;
        {
            try {
                do {
                    hesapDosyasi.oku(girdi);
                } while (hesapDosyasi.okuhesap() == 0);
                hesapAlani.setText(String.valueOf(hesapDosyasi.okuhesap()));
                isimAlani.setText(String.valueOf(hesapDosyasi.okuIsim()));
                soyisimAlani.setText(String.valueOf(hesapDosyasi.okusoyIsim()));
                hesaptakiParaAlani.setText(String.valueOf(hesapDosyasi.okuhesaptakiPara()));
            } catch (EOFException eof) {
                closeFile();
            } catch (IOException io) {
                System.err.println("Dosyayi okurken hata olustu\n" + io.toString());
                System.exit(1);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == birsonraki) {
            okuKayit();
        } else {
            closeFile();
        }
    }

    private void closeFile() {
        try {
            girdi.close();
            System.exit(0);
        } catch (IOException e) {
            System.err.println("Error closing filr\n" + e.toString());
            System.exit(1);
        }
    }

    public static void main(String args[]) {
        new RaslantisalUlasimDosyasiOku();
    }
}
