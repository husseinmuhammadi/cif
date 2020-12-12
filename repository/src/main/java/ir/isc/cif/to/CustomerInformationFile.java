package ir.isc.cif.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CIF", uniqueConstraints = {
        @UniqueConstraint(name = "UQ_CIF_NO", columnNames = {"CIF_NO"})
})
public class CustomerInformationFile extends EntityBase {

    public CustomerInformationFile() {
    }

    public CustomerInformationFile(String cifNumber) {
        this.cifNumber = cifNumber;
    }

    @Column(name = "CIF_NO", length = 50)
    private String cifNumber;

    @Column(name = "CREDIT")
    private Long credit;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    public String getCifNumber() {
        return cifNumber;
    }

    public void setCifNumber(String cifNumber) {
        this.cifNumber = cifNumber;
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
