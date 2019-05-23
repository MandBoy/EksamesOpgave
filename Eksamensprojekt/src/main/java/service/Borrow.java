/*
 *Made by Andreas Lind.
 * Used to create borrow orders in our database.
 */

import java.io.*;
import java.util.*;

public class Borrow{
    private Time time = new Time();
    private Time aflever = time; //Somehow add 10 days to the time.
    private LinkedList<Item> items = new LinkedList<Item>();

    public Borrow(User user){
        while(Values.running){
            Inputhandler.itemScan();
            if(Inputhandler.cardScan() != null){}
        }
    }
}
