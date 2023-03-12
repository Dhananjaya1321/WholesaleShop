package lk.ijse.wholesale_shop.entity;

import javax.persistence.*;

@Entity
public class OrderDetail {
    //    @Id
    @EmbeddedId
    private OredrDetalsPK oredrDetalsPK;

    int qty;
    double unitPrice;

    public OrderDetail() {
    }

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "code", referencedColumnName = "code", insertable = false, updatable = false)
    private Items items;

    public OrderDetail(OredrDetalsPK oredrDetalsPK, int qty, double unitPrice, Orders orders, Items items) {
        this.oredrDetalsPK = oredrDetalsPK;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.orders = orders;
        this.items = items;
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

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public OredrDetalsPK getOredrDetalsPK() {
        return oredrDetalsPK;
    }

    public void setOredrDetalsPK(OredrDetalsPK oredrDetalsPK) {
        this.oredrDetalsPK = oredrDetalsPK;
    }
}
