package be.vdab.toysforboys.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "countries")
public class Country  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private long id;
    private String name;
    private long version;

    protected Country() {
    }

    public String getName() {
        return name;
    }
}
