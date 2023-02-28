package lk.ijse.wholesale_shop.bo;

import lk.ijse.wholesale_shop.bo.custom.impl.CustomerBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {

    }
    public static BOFactory getInstance(){
        return (boFactory==null) ? boFactory=new BOFactory() : boFactory;
    }
    public SupperBO getBOType(BOType boType){
        switch (boType){
//            case ITEM:return new ItemBOImpl();
            case CUSTOMER:return new CustomerBOImpl();
            default:return null;
        }
    }
}
