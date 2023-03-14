package lk.ijse.wholesale_shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class OrderDetail {
    //    @Id
    @EmbeddedId
    private OredrDetalsPK oredrDetalsPK;

    private int qty;
    private double unitPrice;

    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "code", referencedColumnName = "code", insertable = false, updatable = false)
    private Items items;

}
