package lk.ijse.wholesale_shop.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Customers {
    private String name;
    private LocalDate dob;
    @Id
    private String contact;
    private String address;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Orders> orderList = new ArrayList();


    public Customers() {
    }

    public Customers(String name, LocalDate dob, String contact, String address) {
        this.name = name;
        this.dob = dob;
        this.contact = contact;
        this.address = address;
    }

    public Customers(String name, LocalDate dob, String contact, String address, List orderList) {
        this.name = name;
        this.dob = dob;
        this.contact = contact;
        this.address = address;
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Orders> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
