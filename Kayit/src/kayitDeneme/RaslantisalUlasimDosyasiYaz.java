package kayitDeneme;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class RaslantisalUlasimDosyasiYaz extends Frame implements ActionListener {

    private TextField hesapAlani, isimAlani, soyisimAlani, hesaptakiParaAlani;
    private Button birsonraki, kapat;
    private RandomAccessFile girdi;
    private Kayit hesapDosyasi;

    public RaslantisalUlasimDosyasiYaz() {
        super("Tesadufi ulasim dosyasina yaz");
        hesapDosyasi = new Kayit();
        try {
            girdi = new RandomAccessFile("musteri1.dat", "rw");
        } catch (IOException e) {
            System.err.println("Dosya acma hatasi\n" + e.toString());
            System.exit(1);
        }
        setSize(300, 150);
        setLayout(new GridLayout(5, 2));
        add(new Label("Hesap numarasi:"));
        hesapAlani = new TextField();
        add(hesapAlani);
        add(new Label("isim : "));
        isimAlani = new TextField(20);
        add(isimAlani);
        add(new Label("Soyisim : "));
        soyisimAlani = new TextField(20);
        add(soyisimAlani);
        add(new Label("Hesaptaki para : "));
        hesaptakiParaAlani = new TextField(20);
        add(hesaptakiParaAlani);
        birsonraki = new Button("Gir");
        birsonraki.addActionListener(this);
        add(birsonraki);
        kapat = new Button("cikis");
        kapat.addActionListener(this);
        add(kapat);
        setVisible(true);
    }

    public void addKayit() {
        int accountNumber = 0;
        Double d;
        if (!hesapAlani.getText().equals("")) {
            try {
                accountNumber = Integer.parseInt(hesapAlani.getText());
                if (accountNumber > 0 && accountNumber <= 100) {
                    hesapDosyasi.yazhesap(accountNumber);
                    hesapDosyasi.yazIsim(isimAlani.getText());
                    hesapDosyasi.yazsoyIsim(soyisimAlani.getText());
                    d = new Double(hesaptakiParaAlani.getText());
                    hesapDosyasi.yazhesaptakiPara(d.doubleValue());
                    girdi.seek((long) (accountNumber - 1) * Kayit.boyut());
                    hesapDosyasi.yaz(girdi);
                }
                hesapAlani.setText("");
                isimAlani.setText("");
                soyisimAlani.setText("");
                hesaptakiParaAlani.setText("");
            } catch (NumberFormatException nfe) {
                System.err.println("Hesap numarasi tamsayi degisken olamalidir");
            } catch (IOException io) {
                System.err.println("Dosyaya yazarken hata olustu\n" + io.toString());
                System.exit(1);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        addKayit();
        if (e.getSource() == kapat) {
            try {
                girdi.close();
            } catch (IOException io) {
                System.err.println("Dosya kapatilamadi\n" + io.toString());
            }
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new RaslantisalUlasimDosyasiYaz();
    }
}
