package lk.ijse.wholesale_shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemsDTO {
    String code;
    String name;
    double price;
    int qty;
}
