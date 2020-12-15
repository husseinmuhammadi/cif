package ir.isc.cif.dto;

public class CustomerInformationFile extends EntityBase {
    public CustomerInformationFile() {
    }

    public CustomerInformationFile(String cifNumber) {
        this.cifNumber = cifNumber;
    }

    private String cifNumber;

    private Long credit;

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
