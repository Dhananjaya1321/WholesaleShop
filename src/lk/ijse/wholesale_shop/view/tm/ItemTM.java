package lk.ijse.wholesale_shop.view.tm;


public class ItemTM {
    String code;
    String name;
    double price;
    int qty;

    public ItemTM() {
    }

    public ItemTM(String code, String name, double price, int qty) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
