package lk.ijse.wholesale_shop.dao.custom.impl;

import lk.ijse.wholesale_shop.dao.custom.CustomerDAO;
import lk.ijse.wholesale_shop.entity.Customers;
import lk.ijse.wholesale_shop.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDAOImpl implements CustomerDAO {
    Session session= FactoryConfiguration.getInstance().getSessionFactory();
    Transaction transaction;
    @Override
    public boolean save(Customers dao) {
        transaction= session.getTransaction();
        session.save(dao);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Customers dao) {
        transaction= session.getTransaction();
        session.delete(dao);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Customers dao) {
        transaction= session.getTransaction();
        session.update(dao);
        transaction.commit();
        session.close();
        return true;
    }
}
