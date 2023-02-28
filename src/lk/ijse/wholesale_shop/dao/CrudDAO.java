package lk.ijse.wholesale_shop.dao;

public interface CrudDAO<T> extends SupperDAO{
    boolean save(T dao);
    boolean delete(T dao);
    boolean update(T dao);
}
