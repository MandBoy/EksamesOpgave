/*
Lavet af Andreas Lind.
Ændret af Leopold.
 */

package com.example.EksamesOpgave.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Class is based on the data structure in our database.
 *
 */

@Entity
public class Bruger{
    @Id
    private int brugerId;
    private String navn;
    private int cpr;
    private int sms;
    private String email;
    private int niveau;
    private int grayList_grayListId;

    public Bruger(){}
    public Bruger(int brugerId, String navn, int cpr, int sms, String email, int niveau, int grayList_grayListId) {
        this.brugerId = brugerId;
        this.navn = navn;
        this.cpr = cpr;
        this.sms = sms;
        this.email = email;
        this.niveau = niveau;
    }

    public int getId() {
        return brugerId;
    }
    public void setId(int brugerId) {
        this.brugerId = brugerId;
    }
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }
    public int getCpr() {
        return cpr;
    }
    public void setCpr(int cpr) {
        this.cpr = cpr;
    }
    public int getSms() {
        return sms;
    }
    public void setSms(int sms) {
        this.sms = sms;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    public int getGrayList_grayListId() {
        return grayList_grayListId;
    }
    public void setGrayList_grayListId(int grayList_grayListId) {
        this.grayList_grayListId = grayList_grayListId;
    }

}
