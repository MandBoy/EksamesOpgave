/*
*Made by Andreas Lind.
* Used to do things in the database.
 */

public class DatabaseHandler{
    public DatabaseHandler(){
        while(Values.running){
            crudMenu();
            switch(Inputhandler.intChoice()){
                case 1:
                    create();
                    break;
                case 2:
                    readList();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    update();
                    break;
                case 9:
            }
        }
    }
    //Create a list of database tables. LinkedList<Tables> tables = new LinkedList<Tables>();
    public static void create(){
        System.out.println("Which table would you like to create something in?");
        //Print available tables. System.out.println(Arrays.toString(tables));
        switch(Inputhandler.intChoice()){

        }
    }
    public void readList(Person person, Item item){
        SELECT Inputhandler.intChoice() FROM Inputhandler.strChoice();
    }
    public static void delete(Person person){
        SELECT * FROM Inputhandler.strChoice() WHERE Inputhandler.intChoice()


    }
    public static void update(Person person){}
    public static boolean loginCheck(int cardId){
        //Need to be able to read from database here.
        //if(database.contains(cardId)){
            return true;
        //}
        //else{
            //return false;
        //}
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

