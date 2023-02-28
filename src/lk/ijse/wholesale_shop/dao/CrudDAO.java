package lk.ijse.wholesale_shop.dao;

import lk.ijse.wholesale_shop.entity.Customers;

import java.util.ArrayList;

public interface CrudDAO<T> extends SupperDAO{
    boolean save(T dao);
    boolean delete(T dao);
    boolean update(T dao);
    ArrayList<T> getAll();
}
