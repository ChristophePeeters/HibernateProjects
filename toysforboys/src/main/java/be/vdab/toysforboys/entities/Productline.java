package be.vdab.toysforboys.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productlines")
public class Productline implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private long version;

    protected Productline() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
