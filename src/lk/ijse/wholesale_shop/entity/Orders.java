package lk.ijse.wholesale_shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Orders {
    @Id
    String id;
    Date date;
    @ManyToOne
    private Customers customer;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "orders")
    List<OrderDetail> orderDetails = new ArrayList<>();
}
