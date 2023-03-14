package lk.ijse.wholesale_shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customers {
    private String name;
    private LocalDate dob;
    @Id
    private String contact;
    private String address;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Orders> orderList = new ArrayList();

    public Customers(String name, LocalDate dob, String contact, String address) {
        this.name = name;
        this.dob = dob;
        this.contact = contact;
        this.address = address;
    }

}
