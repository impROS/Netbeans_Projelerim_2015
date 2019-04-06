package dbtest;

import java.sql.*;

public class DBTest {

        public static void main(String[] args) {
            try {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection conn = DriverManager.getConnection("jdbc:odbc:veri");
                System.out.println("2");
             
                Statement st = conn.createStatement();
                String sql = "Select * from veri";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    System.out.println("\n" + rs.get­String(1) + "\t" + rs.getString(2)+"\t"+rs.getString(3) + "\t­" + rs.getString(4)); 
                } 
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
    
}}
