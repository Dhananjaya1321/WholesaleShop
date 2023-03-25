package lk.ijse.wholesale_shop.dao.custom.impl;

import lk.ijse.wholesale_shop.dao.custom.ItemDAO;
import lk.ijse.wholesale_shop.entity.Items;
import lk.ijse.wholesale_shop.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public ArrayList<Items> getAll() {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        String sqlQuery = "FROM Items";
        Query query = session.createQuery(sqlQuery);
        List list = query.list();
        session.close();
        if (list.size() > 0) {
//            System.out.println("1");
            return (ArrayList<Items>) list;
        } else {
//            System.out.println(2);
            return new ArrayList<>();
        }

    }

    @Override
    public String generateNewId() {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        String sqlQuery = "SELECT i.code FROM Items AS i ORDER BY code DESC";
        Query query = session.createQuery(sqlQuery);
        List list = query.list();
        session.close();
        if (list.size() > 0) {
            return (String) list.get(0);
        }
        return null;
    }
}
