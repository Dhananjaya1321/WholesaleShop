package lk.ijse.wholesale_shop.dao.custom;

import lk.ijse.wholesale_shop.dao.CrudDAO;
import lk.ijse.wholesale_shop.entity.Items;

public interface ItemDAO extends CrudDAO<Items> {
    String generateNewId();
}
