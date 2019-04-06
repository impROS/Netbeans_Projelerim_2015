package pdftarayici;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Date;
import org.apache.commons.io.IOUtils;

public class DerbyData {

    public DerbyData() {
        System.out.println("Yapıci");

    }

    public void pdfBilgiEkle(String hashCode, String yazar, String baslik, String konu, String anahtarKelime,
            String olusturan, String yapimci, String olusturulmaTarihi, String duzenlenmeTarihi, String trapped, String icerik) {
        System.out.println("Kayit Ekleniyor");
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/dataPdfBilgi", "impROS", "1234");

            Statement st = con.createStatement();
            Class.forName("org.apache.derby.jdbc.ClientDriver");

//            String sql;
//            sql = "SELECT id, Name, Age, TS FROM TestTable WHERE Age < :age OR id = :id";
//            NamedParamStatement stmt = new NamedParamStatement(con, sql);
//            stmt.setInt("age", 35);
//            stmt.setInt("id", 2);2
//            ResultSet rs = stmt.executeQuery();

            con.createStatement().execute("INSERT INTO APP.DATAPDFBILGILER (HASHCODE, YAZAR, BASLIK,"
                    + " KONU, ANAHTARKELIME, OLUSTURAN, YAPIMCI, OLUSTURULMATARIHI, DUZENLEMETARIHI, TRAPPED,ICERIK) \n"
                    + " VALUES ('" + hashCode + "','" + yazar + "','" + baslik + "','" + konu + "','" + anahtarKelime
                    + "','" + olusturan + "','" + yapimci + "','" + olusturulmaTarihi + "','" + duzenlenmeTarihi + "','" + trapped + "','" + icerik + "')");
            System.out.println("Kayıt Eklendi");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Hata " + e.getMessage());
        }
    }
}
