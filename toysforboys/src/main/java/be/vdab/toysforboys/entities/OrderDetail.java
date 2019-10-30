package be.vdab.toysforboys.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


@Embeddable
public class OrderDetail implements Serializable{
    private static final long serialVersionUID = 1L;
    private long ordered;
    private BigDecimal priceEach;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productId")
    private Product product;

    protected OrderDetail(){

    }

    public long getOrdered() {
        return ordered;
    }

    public BigDecimal getPriceEach() {
        return priceEach;
    }

    public Product getProduct() {
        return product;
    }
}
