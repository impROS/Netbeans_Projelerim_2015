
import java.sql.*;

public class deneme{
    public static void main(String[] args) {

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("2");
            String accessFileName = "E:/veri.accdb";

            String connURL="jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ="+accessFileName+".accdb;";

            Connection con = DriverManager.getConnection(connURL, "","");

            Statement stmt = con.createStatement();

            stmt.execute("select * from student"); // execute query in table student

            ResultSet rs = stmt.getResultSet(); // get any Result that came from our query

            if (rs != null)
             while ( rs.next() ){

                System.out.println("Name: " + rs.getString("Name") + " ID: "+rs.getString("ID"));
                }

                stmt.close();
                con.close();
            }
            catch (Exception err) {
                System.out.println("ERROR: " + err);
            }
    }

}