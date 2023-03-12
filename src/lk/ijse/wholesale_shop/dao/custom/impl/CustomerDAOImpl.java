package lk.ijse.wholesale_shop.dao.custom.impl;

import lk.ijse.wholesale_shop.dao.custom.CustomerDAO;
import lk.ijse.wholesale_shop.entity.Customers;
import lk.ijse.wholesale_shop.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean save(Customers dao) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.save(dao);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Customers dao) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.delete(dao);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Customers dao) {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        Transaction transaction = session.beginTransaction();
        session.update(dao);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public ArrayList<Customers> getAll() {
        Session session = FactoryConfiguration.getInstance().getSessionFactory();
        String sqlQuery = "FROM Customers";
        Query query = session.createQuery(sqlQuery);
        List list = query.list();
        session.close();
        return (ArrayList<Customers>) list;
    }
}
