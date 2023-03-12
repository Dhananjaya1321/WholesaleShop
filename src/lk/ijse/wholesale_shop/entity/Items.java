package lk.ijse.wholesale_shop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Items {
    @Id
    String code;
    String name;
    double price;
    int qty;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "items")
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public Items() {
    }

    public Items(String code, String name, double price, int qty) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Items(String code, String name, double price, int qty, List<OrderDetail> orderDetails) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.orderDetails = orderDetails;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Items{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
