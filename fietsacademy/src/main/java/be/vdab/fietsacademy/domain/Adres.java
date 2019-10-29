package be.vdab.fietsacademy.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

// enkele imports ...
@Embeddable
public class Adres implements Serializable {
    private static final long serialVersionUID = 1L;
    private String straat;
    private String huisNr;
    private String postcode;
    private String gemeente;
// een geparametriseerde constructor en een protected default constructor
// getters voor straat, huisNr, postcode en gemeente


    public Adres() {
    }

    public Adres(String straat, String huisNr, String postcode, String gemeente) {
        this.straat = straat;
        this.huisNr = huisNr;
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    public String getStraat() {
        return straat;
    }

    public String getHuisNr() {
        return huisNr;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getGemeente() {
        return gemeente;
    }
}