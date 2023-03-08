package lk.ijse.wholesale_shop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Orders {
    @Id
    String id;
    Date date;
    @ManyToOne
    private Customers customer;

    public Orders() {
    }

    public Orders(String id, Date date) {
        this.id = id;
        this.date = date;
    }

    public Orders(String id, Date date, Customers customer) {
        this.id = id;
        this.date = date;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
}
