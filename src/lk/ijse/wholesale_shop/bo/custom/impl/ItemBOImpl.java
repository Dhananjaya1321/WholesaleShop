package lk.ijse.wholesale_shop.bo.custom.impl;

import lk.ijse.wholesale_shop.bo.custom.ItemBO;
import lk.ijse.wholesale_shop.dao.DAOFactory;
import lk.ijse.wholesale_shop.dao.DAOType;
import lk.ijse.wholesale_shop.dao.custom.ItemDAO;
import lk.ijse.wholesale_shop.dto.ItemsDTO;
import lk.ijse.wholesale_shop.entity.Items;

public class ItemBOImpl implements ItemBO {
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAOType(DAOType.ITEM);

    @Override
    public boolean save(ItemsDTO dto) {
        return itemDAO.save(
                new Items(
                        dto.getCode(),
                        dto.getName(),
                        dto.getPrice(),
                        dto.getQty()
                )
        );
    }
    @Override
    public boolean delete(ItemsDTO dto) {
        return itemDAO.delete(
                new Items(
                        dto.getCode(),
                        dto.getName(),
                        dto.getPrice(),
                        dto.getQty()
                )
        );
    }
    @Override
    public boolean update(ItemsDTO dto) {
        return itemDAO.update(
                new Items(
                        dto.getCode(),
                        dto.getName(),
                        dto.getPrice(),
                        dto.getQty()
                )
        );
    }
}
