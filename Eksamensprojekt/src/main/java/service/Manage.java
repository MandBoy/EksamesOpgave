/*
 *Made by Andreas Lind.
 * Used to give admin level users access to create new things in database.
 */

package service;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Manage {
    private java.sql.Connection conn;
    private Statement stmt;

    public Manage(){
        String url = "jdbc:mysql://localhost:3306/BorrowDatabase?serverTimezone=UTC&useSSL=false&allowMultiQueries=true";
        String user = "root";
        String password = "basedNredpilled";
        try{
            java.sql.Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        while(Values.running){
            crudMenu();
            switch(Inputhandler.intChoice()){
                case 1:
                    CRUD.create(conn, stmt);
                    break;
                case 2:
                    CRUD.read(conn, stmt);
                    break;
                case 3:
                    CRUD.delete(conn, stmt);
                    break;
                case 4:
                    CRUD.update(conn, stmt);
                    break;
                case 9:
            }
        }
    }
    public String crudMenu(){
        String tekst =
                "--- CRUD Menu ---\n"
                        +"1. Create.\n"
                        +"2. Read.\n"
                        +"3. Update.\n"
                        +"4. Delete.\n"
                        +"9. Exit.\n";
        return tekst;
    }

}
