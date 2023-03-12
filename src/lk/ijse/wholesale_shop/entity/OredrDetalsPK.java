package lk.ijse.wholesale_shop.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Embeddable
public class OredrDetalsPK implements Serializable {
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "item_id")
    private long iteId;

}
