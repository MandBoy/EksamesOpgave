package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GrayList {

    @Id
    private int grayListId;
    private String bruger;

    public GrayList(int grayListId, String bruger) {
        this.grayListId = grayListId;
        this.bruger = bruger;
    }

    public int getGrayListId() {
        return grayListId;
    }

    public void setGrayListId(int grayListId) {
        this.grayListId = grayListId;
    }

    public String getBruger() {
        return bruger;
    }

    public void setBruger(String bruger) {
        this.bruger = bruger;
    }
}
