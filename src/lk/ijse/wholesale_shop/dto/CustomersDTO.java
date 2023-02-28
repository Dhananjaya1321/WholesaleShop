package lk.ijse.wholesale_shop.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

public class CustomersDTO {
    String name;
    Date dob;
    String contact;
    String address;

    public CustomersDTO() {
    }

    public CustomersDTO(String name, Date dob, String contact, String address) {
        this.name = name;
        this.dob = dob;
        this.contact = contact;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
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
}
