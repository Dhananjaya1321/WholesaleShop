package lk.ijse.wholesale_shop.view.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerTM implements Comparable<CustomerTM> {
    String name;
    LocalDate dob;
    String contact;
    String address;

    @Override
    public int compareTo(CustomerTM o) {
        return contact.compareTo(o.getContact());
    }
}
