package lk.ijse.wholesale_shop.bo.custom;

import lk.ijse.wholesale_shop.bo.SupperBO;
import lk.ijse.wholesale_shop.dao.SupperDAO;
import lk.ijse.wholesale_shop.dto.CustomersDTO;

import java.util.ArrayList;

public interface CustomerBO extends SupperBO {
    boolean save(CustomersDTO dto);

    boolean delete(CustomersDTO dto);

    boolean update(CustomersDTO dto);

    ArrayList<CustomersDTO> getAllCustomers();

//    CustomersDTO getCustomers();
}
