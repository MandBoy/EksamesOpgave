/*
* Made by Andreas Lind.
* Creates a user for the databasehandler to put in the database.
 */
package service;

public class User {
    private int Id;
    private String Name;
    private int Cpr;
    private int Sms;
    private String Email;
    private int Level;
    private int Rykker;

    public User(){
        this.Id = Inputhandler.intChoice();
        this.Name = Inputhandler.strChoice();
        this.Cpr = Inputhandler.intChoice();
        this.Sms = Inputhandler.intChoice();
        this.Email = Inputhandler.strChoice();
        this.Level = Inputhandler.intChoice();
        this.Rykker = 0;
    }

}
