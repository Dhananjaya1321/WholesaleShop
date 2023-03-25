package lk.ijse.wholesale_shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomersDTO {
    String name;
    LocalDate dob;
    String contact;
    String address;
}
