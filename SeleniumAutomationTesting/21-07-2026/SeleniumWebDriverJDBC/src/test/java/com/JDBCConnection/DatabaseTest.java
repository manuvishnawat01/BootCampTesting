package com.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class DatabaseTest {

    @Test
    public void testDatabaseConnection() throws SQLException, ClassNotFoundException {

        // 1. Define connection parameters
        String dbURL = "jdbc:mysql://localhost:3306/SeleniumAutomation";
        String username = "root";
        String password = "Manu@2004";

        // 2. Load JDBC Driver and get connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL, username, password);
        Statement stmt = con.createStatement();

        // 3. Execute a query
        String query = "SELECT * FROM seleniumautomation.book_detl;";
        ResultSet rs = stmt.executeQuery(query);

        // 4. Process the results
        while (rs.next()) {
            String auth = rs.getString("author");
            String tit = rs.getString("title");

            System.out.println("author: " + auth + ", title: " + tit);
        }

        // 5. Close the connection
        con.close();
    }
}