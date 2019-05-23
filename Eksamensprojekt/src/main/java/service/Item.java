/*
 *Made by Andreas Lind.
 * Used to create items for our database to put in our database.
 */

public class Item {
    private String itemId;
    private String itemName;
    private int itemPrice;

    public Item(){
        this.itemId = itemId;
        this.itemName = Inputhandler.strChoice();
        this.itemPrice = Inputhandler.intChoice();
    }


}
