package lk.ijse.wholesale_shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Items {
    @Id
    private String code;
    private String name;
    private double price;
    private int qty;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "items")
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public Items(String code, String name, double price, int qty) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

}
