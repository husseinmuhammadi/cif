package ir.isc.cif.to;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
@SequenceGenerator(name = "SEQUENCE_GENERATOR", sequenceName = "PRODUCT_SEQ")
public class Product extends EntityBase {

    @Column(name = "NAME", length = 200)
    private String name;

    @Column(name = "AMOUNT")
    private Double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
