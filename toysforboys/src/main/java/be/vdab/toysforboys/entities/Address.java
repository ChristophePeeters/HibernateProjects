package be.vdab.toysforboys.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    private String streetAndNumber;
    private String city;
    private String state;
    private String postalCode;

    protected Address() {
    }

    public Address(String streetAndNumber, String city, String state, String postalCode) {
        this.streetAndNumber = streetAndNumber;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
