package lk.ijse.wholesale_shop.dao;

import lk.ijse.wholesale_shop.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.wholesale_shop.dao.custom.impl.ItemDAOImpl;

public class DAOFactory {
    private static DAOFactory boFactory;

    private DAOFactory() {

    }
    public static DAOFactory getInstance(){
        return (boFactory==null) ? boFactory=new DAOFactory() : boFactory;
    }
    public SupperDAO getDAOType(DAOType boType){
        switch (boType){
            case ITEM:return new ItemDAOImpl();
            case CUSTOMER:return new CustomerDAOImpl();
            default:return null;
        }
    }
}
