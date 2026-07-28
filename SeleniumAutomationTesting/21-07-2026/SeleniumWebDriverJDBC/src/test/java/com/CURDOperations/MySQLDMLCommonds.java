package com.CURDOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class MYSQLDMLCommands {

    public static void main(String[] args) throws SQLException {

        // 1. Create Connection
        String databaseURL = "jdbc:mysql://localhost:3306/SeleniumAutomation";
        String user = "root";
        String password = "Manu@2004";

        // Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(databaseURL, user, password);
        Statement stmt = con.createStatement();

        String query = "INSERT INTO book_detl VALUES ('AI003','SeleniumAI','Che','Raghavendra','ABC','S','2026')";

        query = "UPDATE book_detl SET author = 'RaghuBN' WHERE author = 'Raghavendra'";

        // String query = "DELETE FROM Student WHERE ID = 2";

        query = "DELETE FROM book_detl WHERE book_no = 'AI003'";

        // 3. Execute Statement/Query
        stmt.execute(query);

        // 4. Close Connection
        con.close();

        System.out.println("Statement Executed : Record Update Successfully");
    }
}