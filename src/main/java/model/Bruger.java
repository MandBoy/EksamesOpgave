/*
Lavet af Andreas Lind.
Ændret af Leopold.
 */

package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bruger{

    @Id
    private int brugerId;
    private String navn;
    private int cpr;
    private int sms;
    private String email;
    private int niveau;
    private int rykker;

    public Bruger(){}
    public Bruger(int brugerId, String navn, int cpr, int sms, String email, int niveau, int rykker) {
        this.brugerId = brugerId;
        this.navn = navn;
        this.cpr = cpr;
        this.sms = sms;
        this.email = email;
        this.niveau = niveau;
        this.rykker = rykker;
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

    public int getRykker() {
        return rykker;
    }

    public void setRykker(int rykker) {
        this.rykker = rykker;
    }
}
