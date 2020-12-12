package ir.isc.cif.dto;

public class Role extends EntityBase {

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
