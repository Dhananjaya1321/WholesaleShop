package lk.ijse.wholesale_shop.bo.custom;

import lk.ijse.wholesale_shop.bo.SupperBO;
import lk.ijse.wholesale_shop.dao.SupperDAO;
import lk.ijse.wholesale_shop.dto.CustomersDTO;

public interface CustomerBO extends SupperBO {
    boolean save(CustomersDTO dto);
}
