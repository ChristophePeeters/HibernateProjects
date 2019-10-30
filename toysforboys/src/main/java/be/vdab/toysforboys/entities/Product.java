package be.vdab.toysforboys.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String scale;
    private String description;
    private long inStock;
    private long inOrder;
    private BigDecimal price;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "productlineId")
    private Productline productline;

    private long version;

    protected Product(){

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScale() {
        return scale;
    }

    public String getDescription() {
        return description;
    }

    public long getInStock() {
        return inStock;
    }

    public long getInOrder() {
        return inOrder;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Productline getProductline() {
        return productline;
    }
}
