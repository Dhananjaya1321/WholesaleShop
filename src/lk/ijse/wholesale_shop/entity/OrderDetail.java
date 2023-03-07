package lk.ijse.wholesale_shop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetail {
    @Id
    int qty;
    double unitPrice;

    public OrderDetail() {
    }

    public OrderDetail(int qty, double unitPrice) {
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
