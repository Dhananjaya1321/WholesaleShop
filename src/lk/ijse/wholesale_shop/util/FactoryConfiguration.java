package lk.ijse.wholesale_shop.util;

import lk.ijse.wholesale_shop.entity.Customers;
import lk.ijse.wholesale_shop.entity.Items;
import lk.ijse.wholesale_shop.entity.OrderDetail;
import lk.ijse.wholesale_shop.entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//API=application programing interface
public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        sessionFactory = new Configuration().configure()
                .addAnnotatedClass(Customers.class)
                .addAnnotatedClass(Items.class)
                .addAnnotatedClass(Orders.class)
                .addAnnotatedClass(OrderDetail.class)
                .buildSessionFactory();
//        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSessionFactory() {
        return sessionFactory.openSession();
    }
}
