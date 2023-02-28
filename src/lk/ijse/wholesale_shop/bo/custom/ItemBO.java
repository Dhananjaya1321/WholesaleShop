package lk.ijse.wholesale_shop.bo.custom;

import lk.ijse.wholesale_shop.bo.SupperBO;
import lk.ijse.wholesale_shop.dto.ItemsDTO;

public interface ItemBO extends SupperBO {
    boolean save(ItemsDTO dto);

    boolean delete(ItemsDTO dto);

    boolean update(ItemsDTO dto);
}
