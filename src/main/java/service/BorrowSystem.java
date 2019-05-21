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

package service;

public class BorrowSystem {
    public BorrowSystem(){
        System.out.println("--- Please scan your data slip ---");
        while(Values.running){
            login();
            //Read from persons level with databasehandler into switch.
            switch(Inputhandler.intChoice()){
                case 1:
                    borrow();
                case 2:
                    optionMenu();
                    switch(Inputhandler.intChoice()) {
                        case 1:
                            borrow();
                            break;
                        case 2:
                            manage();
                            break;
                        case 9:
                            System.out.println("--- Shutting down ---");
                            Values.running = false;
                            break;
                    }
            }
        }
    }
    public int login(){
        int cardId = Inputhandler.scan();
        if(DatabaseHandler.loginCheck(cardId) == true){
            return 1;
        }
        else{
            return 0;
        }

    }

    public void borrow(){
        BorrowList borrow = new BorrowList();
    }
    public void manage(){
        Manage manage = new Manage();
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
