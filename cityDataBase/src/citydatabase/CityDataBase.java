/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citydatabase;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CityDataBase {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection conn = DriverManager.getConnection(
                "jdbc:ucanaccess://e:/veri.accdb");
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT [ad] FROM [veri]");
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
    }
}
