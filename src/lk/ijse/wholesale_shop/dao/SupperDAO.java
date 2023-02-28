package lk.ijse.wholesale_shop.dao;

public interface SupperDAO<T>{
    boolean save(T dao);
    boolean delete(T dao);
    boolean update(T dao);
}
