package lk.ijse.wholesale_shop.dao.custom.impl;

import lk.ijse.wholesale_shop.dao.custom.ItemDAO;
import lk.ijse.wholesale_shop.entity.Items;
import lk.ijse.wholesale_shop.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ItemDAOImpl implements ItemDAO {


    @Override
    public boolean save(Items dao) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.save(dao);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Items dao) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.delete(dao);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Items dao) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.update(dao);
        transaction.commit();
        session.close();
        return true;
    }
}
