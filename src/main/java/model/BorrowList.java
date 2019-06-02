package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Class is based on the data structure in our database.
 *
 */

@Entity
public class BorrowList {

    @Id
    private int borrowListId;
    private int bruger;
    private String Item;
    private Timestamp tidspunkt;
    private Date Afleverer;



    public BorrowList(int borrowListId, int bruger, String item, Timestamp tidspunkt, Date afleverer) {
        this.borrowListId = borrowListId;
        this.bruger = bruger;
        Item = item;
        this.tidspunkt = tidspunkt;
        Afleverer = afleverer;
    }

    public int getBorrowListId() {
        return borrowListId;
    }

    public void setBorrowListId(int borrowListId) {
        this.borrowListId = borrowListId;
    }

    public int getBruger() {
        return bruger;
    }

    public void setBruger(int bruger) {
        this.bruger = bruger;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public Timestamp getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(Timestamp tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public Date getAfleverer() {
        return Afleverer;
    }

    public void setAfleverer(Date afleverer) {
        Afleverer = afleverer;
    }
}
