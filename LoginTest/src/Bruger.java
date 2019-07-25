import java.util.*;
import java.io.*;

public class Bruger{
    private String username = "peter";
    private int password = 123;
    private int cpr = 2223;
    private int level = 1;

    public Bruger(String username, int password, int cpr, int level){
        this.username = Inputhandler.strChoice();
        this.password = Inputhandler.intChoice();
        this.cpr = Inputhandler.intChoice();
        this.level = Inputhandler.intChoice();
    }
    public int readBrugerLevel(String username, int password, int level){
        if(username == this.username && password == this.password){
            level = this.level;
        }
        return level;
        else{

        }
    }

}
