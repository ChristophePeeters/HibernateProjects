package be.vdab.toysforboys.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String streetAndNumber;
    private String city;
    private String state;
    private String postalCode;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "countryId")
    private Country country;
    private long version;

    protected Customer() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public Address getAddress() {
        return new Address(getStreetAndNumber(), getCity(), getState(), getPostalCode());
    }

    public Country getCountry() {
        return country;
    }
}
