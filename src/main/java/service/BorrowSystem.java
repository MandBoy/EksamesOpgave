/*
* Made by Andreas Lind.
* Crossroad between login and other system functions.
* int cardId is the info we read from the users id device.
* Inputhandler.cardScan() which is linked to a physical barcodescanner.
* DatabaseHandler.loginCheck(CardId) is used to go into our database and see if cardId exists.
* Switch contains user.level since we have more than one level of access to our system.
* Borrow() is where we create our borrow orders from a persons Id.
* Manage() is a reroad to several user friendly Databasehandler functions.
*/
/*
package service;
public class BorrowSystem{
    public BorrowSystem(){
        System.out.println("--- Please scan your data slip ---");
        User user = login();
        while(Values.running){
            //Read from persons level with Inputhandler into switch below.
            switch(user.level()){
                case 1:
                    borrow(user);
                case 2:
                    optionMenu();
                    switch(Inputhandler.intChoice()) {
                        case 1:
                            borrow(user);
                            break;
                        case 2:
                            manage(user);
                            break;
                        case 9:
                            System.out.println("--- Shutting down ---");
                            Values.running = false;
                            break;
                    }
            }
        }
    }

    public User login(){
        user = Inputhandler.userLogin();
        //Read from database.
        if(user.name && user.cpr in database){
            System.out.println("Welcome: " + user.name + " " + user.lastName);
            return user;
        }
        else{
            System.out.println("Error: Wrong Login");
            break;
        }
    }

    public void borrow(User user){
        Borrow borrow = new Borrow(user);
    }

    public void manage(User user){
        Manage manage = new Manage(user);
    }

    public String optionMenu() {
        String tekst =
                        "---Option menu---\n"
                        + "1: Borrow\n"
                        + "2: Manage\n"
                        + "9: Exit\n";
        return tekst;
    }
}
*/