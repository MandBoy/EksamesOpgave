/*
 *Made by Andreas Lind.
 * Used to give admin level users access to create new things in database.
 */

public class Manage {
    public Manage(){
        while(Values.running){
            crudMenu();
            switch(Inputhandler.intChoice()){
                case 1:
                    DatabaseHandler.create();
                    break;
                case 2:
                    DatabaseHandler.readList();
                    break;
                case 3:
                    DatabaseHandler.delete();
                    break;
                case 4:
                    DatabaseHandler.update();
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
