package service;

import java.sql.*;

public class Update {


    String url = "jdbc:mysql://localhost:3306/BorrowDatabase?serverTimezone=UTC";
    String username = "root";
    String password = "basedNredpilled";

    try{
        Connection myConn = DriverManager.getConnection(url,username, password);

        Statement stmt = myConn.createStatement();
        int rowsaffected = stmt.executeQuery("UPDATE bruger" + "set navn = 'Peter'" + "Where id = 4");

        System.out.println("Rækker ændret: " + rowsaffected);


    } catch (SQLException ex) {
        ex.printStackTrace();
    }

}