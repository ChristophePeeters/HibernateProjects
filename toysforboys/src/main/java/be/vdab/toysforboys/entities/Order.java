package be.vdab.toysforboys.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate ordered;
    private LocalDate required;
    private LocalDate shipped;
    private String comments;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customerId")
    private Customer customer;

    @Enumerated(EnumType.STRING)
    private Status status;
    private long version;

    @ElementCollection
    @CollectionTable(name="orderdetails", joinColumns=@JoinColumn(name = "orderId"))
    private Set<OrderDetail> orderDetails= new LinkedHashSet<>();

    protected Order() {
    }

    public long getId() {
        return id;
    }

    public LocalDate getOrdered() {
        return ordered;
    }

    public LocalDate getRequired() {
        return required;
    }

    public LocalDate getShipped() {
        return shipped;
    }

    public String getComments() {
        return comments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Status getStatus() {
        return status;
    }

    public Set<OrderDetail> getOrderDetails() {
        return orderDetails;
    }
}
