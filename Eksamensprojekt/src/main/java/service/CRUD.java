package service;
import java.sql.*;

public class CRUD{
    public static void read(java.sql.Connection conn, Statement stmt) {
        try {
            String readList = "select * from bruger";
            ResultSet rs = stmt.executeQuery(readList);
            while (rs.next()) {
                System.out.println(rs.getString("navn"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void create(java.sql.Connection conn, Statement stmt) {
        try {
            stmt.executeUpdate("insert into bruger" + "(navn, cpr, sms, email, niveau, rykker)" + "values(?, ?, ?, ?, ? )");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void update(java.sql.Connection conn, Statement stmt) {
        try {
            int rowsAffected = stmt.executeUpdate("update bruger" + "set ? = '?' " + "where id = ?");
            System.out.println("rows changed: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void delete(java.sql.Connection conn, Statement stmt) {
        try {
            stmt.executeUpdate("delete from bruger" + "where id = ?");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

