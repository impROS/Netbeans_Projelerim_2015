
package select;

import java.net.URL;
import java.sql.*;
import java.io.*;

public class Select 
{

//*** main kısmı başlangıcı***//

public static void main (String args[]) throws IOException
{
// veri alma kısmı
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.print("Enter Region Number :");
String name=input.readLine();
System.out.println("Merhaba "+name);
//veri alma bitiş
String url = "jdbc:derby://localhost:1527/deneme [root on ROOT]";
String query = "select FIRSTNAME from APP.AUTHORS;"; 
try 
{
Class.forName ("org.apache.derby.jdbc.EmbeddedDriver");
    try (Connection con = DriverManager.getConnection (url, "", "")) {
        DatabaseMetaData dma = con.getMetaData ();
        
    try (Statement stmt = con.createStatement ()) {
        ResultSet rs = stmt.executeQuery (query);
        dispResultSet (rs);
        
        rs.close();
    }
    }
}
catch (SQLException ex) 
{
System.out.println ("\n*** SQLException caught ***\n");
while (ex != null) 
{
System.out.println ("SQLState: " +ex.getSQLState ());
System.out.println ("");
}
}
catch (ClassNotFoundException ex) 
{
}

}

//*** main kısmının sonu ***//

//***dispResultSet başlangıcı ***//
private static void dispResultSet (ResultSet rs)
throws SQLException
{
int i;
ResultSetMetaData rsmd = rs.getMetaData ();
int numCols = rsmd.getColumnCount ();
System.out.println("");
boolean more = rs.next ();
while (more) 
{
System.out.println(rs.getString(2));
more = rs.next ();
}
}
}
//*** dispResultSet sonu ***//
//***program sonu ***//