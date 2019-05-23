/*
*Made by Andreas Lind.
* Used to CRUD in or database.
 */

public class DatabaseHandler{
    //Preparedstatements...
    //Create a list of database tables. LinkedList<Tables> tables = new LinkedList<Tables>();
    public static void create(){
        System.out.println("Which table would you like to create something in?");
        //Print available tables. System.out.println(Arrays.toString(tables));
        SELECT Inputhandeler.strChoice();
    }
    public static void readList(){
        SELECT Inputhandler.strChoice(); FROM Inputhandler.
    }
    public static void delete(){
        SELECT Inputhandler.strChoice(); FROM Inputhandler.
    }
    public static void update(){
        SELECT Inputhandler.strChoice();
    }
    public static boolean loginCheck(int cardId){
        //Need to be able to read from database here.
        //if(database.contains(cardId)){
            return true;
        //}
        //else{
            //return false;
        //}
    }
}

