package lk.ijse.wholesale_shop.bo.custom.impl;

import lk.ijse.wholesale_shop.bo.custom.CustomerBO;
import lk.ijse.wholesale_shop.dao.DAOFactory;
import lk.ijse.wholesale_shop.dao.DAOType;
import lk.ijse.wholesale_shop.dao.custom.CustomerDAO;
import lk.ijse.wholesale_shop.dto.CustomersDTO;
import lk.ijse.wholesale_shop.entity.Customers;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAOType(DAOType.CUSTOMER);

    @Override
    public boolean save(CustomersDTO dto) {
        return customerDAO.save(
                new Customers(
                        dto.getName(),
                        dto.getDob(),
                        dto.getContact(),
                        dto.getAddress()
                )
        );
    }
}
