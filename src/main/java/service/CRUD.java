/*

package service;
import java.sql.*;

public class CRUD{
    private static Statement stmt;
    private static Connection conn;
    private static String dbHost = "localhost";
    private static String dbName = "BorrowDatabase";
    private static String dbUsername = "root";
    private static String dbPassword = "basedNredpilled";
    private static String dbPort = "3306"; //3306
    public static Connection connection;

    public CRUD(){

    }
    public static void connect()
    {
        String url = String.format("jdbc:mysql://%s:%s/%s?useUnicode=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", dbHost, dbPort, dbName);
        try
        {
            connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            System.out.println("Connected");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void read() {
        try {
            Statement stmt = connection.createStatement();
            String readList = "select * from BorrowDatabase.bruger";
            ResultSet rs = stmt.executeQuery(readList);
            while (rs.next()) {
                System.out.println(rs.getString("navn"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void create() {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("insert into BorrowDatabase.bruger" + "(navn, cpr, sms, email, niveau, rykker)" + "values(?, ?, ?, ?, ?, ? )");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void update() {
        try {
            Statement stmt = connection.createStatement();
            int rowsAffected = stmt.executeUpdate("update bruger" + " set navn = 'Tobias' " + " where id = 1");
            System.out.println("Rows changed: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void delete() {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("delete from BorrowDatabase.bruger " + " where id = ?");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



*/