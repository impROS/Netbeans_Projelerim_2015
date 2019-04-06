package derbydatabase;

import java.sql.*;

public class DerbyDatabase {

    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/veriDeneme", "root", "1234");
            Statement st = con.createStatement();

           con.createStatement().execute("INSERT INTO APP.AUTHORS (FIRSTNAME, SURNAME, EMAIL) \n" +
"	VALUES ('dene', 'deness', 'deneeee')");
         
            
            ResultSet rs = st.executeQuery("select * from APP.AUTHORS");
            ResultSetMetaData meta = rs.getMetaData();
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                try {
                    System.out.printf("%-10s\t", meta.getColumnName(i));
                } catch (Exception e) {
                }

                //System.out.println(meta.getColumnName(i));
            }
            System.out.println("");
            while (rs.next()) {
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    try {
                        System.out.printf("%-10s\t", rs.getObject(i));
                    } catch (Exception e) {
                    }

                }
                System.out.println("");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Hata " + e.getMessage());
        }
    }

}
