package lk.ijse.wholesale_shop.dao.custom.impl;

import lk.ijse.wholesale_shop.dao.custom.CustomerDAO;
import lk.ijse.wholesale_shop.entity.Customers;
import lk.ijse.wholesale_shop.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean save(Object dao) {
        Session session= FactoryConfiguration.getInstance().getSessionFactory();
        Transaction transaction= session.getTransaction();
        session.save(dao);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Object dao) {
        return false;
    }

    @Override
    public boolean update(Object dao) {
        return false;
    }
}
