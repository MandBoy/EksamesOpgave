package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    private int itemID;
    private String navn;
    private int pris;
    private String opløsning;
    private String vægt;
    private String udgivelse;
    private String Model;

    public Item(int itemID, String navn, int pris, String opløsning, String vægt, String udgivelse, String model) {
        this.itemID = itemID;
        this.navn = navn;
        this.pris = pris;
        this.opløsning = opløsning;
        this.vægt = vægt;
        this.udgivelse = udgivelse;
        this.Model = model;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getOpløsning() {
        return opløsning;
    }

    public void setOpløsning(String opløsning) {
        this.opløsning = opløsning;
    }

    public String getVægt() {
        return vægt;
    }

    public void setVægt(String vægt) {
        this.vægt = vægt;
    }

    public String getUdgivelse() {
        return udgivelse;
    }

    public void setUdgivelse(String udgivelse) {
        this.udgivelse = udgivelse;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
