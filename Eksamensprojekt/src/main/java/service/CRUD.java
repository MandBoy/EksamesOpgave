package service;

import java.sql.*;


public class CRUD {

    public CRUD() {

    }


        public static void Read(){

            String url = "jdbc:mysql://localhost:3306/BorrowDatabase?serverTimezone=UTC&useSSL=false&allowMultiQueries=true";
            String user = "root";
            String password = "basedNredpilled";

        try {

            java.sql.Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            String readList = "select * from bruger";
            ResultSet rs = stmt.executeQuery(readList);

            while (rs.next())

                System.out.println(rs.getString("navn"));

        } catch (SQLException e) {

                e.printStackTrace();
          }
        }

    public static void create(int status) {

        String url = "jdbc:mysql://localhost:3306/BorrowDatabase?serverTimezone=UTC&useSSL=false&allowMultiQueries=true";
        String user = "root";
        String password = "basedNredpilled";

        try {

            java.sql.Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();


                stmt.executeUpdate("insert into bruger" + "(navn, cpr, sms, email, niveau, rykker)" + "values(?, ?, ?, ?, ? )");

            conn.close();

        }

        catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static void update(){
        String url = "jdbc:mysql://localhost:3306/BorrowDatabase?serverTimezone=UTC&useSSL=false&allowMultiQueries=true";
        String user = "root";
        String password = "basedNredpilled";


        try {

            java.sql.Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            int rowsaffected = stmt.executeUpdate("update bruger" + "set ? = '?' " + "where id = ?");

            System.out.println("rows changed: " + rowsaffected);

        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    public static void delete(){
        String url = "jdbc:mysql://localhost:3306/BorrowDatabase?serverTimezone=UTC&useSSL=false&allowMultiQueries=true";
        String user = "root";
        String password = "basedNredpilled";

        try {

            java.sql.Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();


            stmt.executeUpdate("delete from bruger" + "where id = ?");

            conn.close();

        }

        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }


}
