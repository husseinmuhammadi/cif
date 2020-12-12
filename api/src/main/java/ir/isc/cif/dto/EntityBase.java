package ir.isc.cif.dto;

import ir.isc.cif.dto.base.Audit;

public abstract class EntityBase {

    private Long id;

    private final Audit audit;

    private EntityBase(Audit audit) {
        this.audit = audit;
    }

    EntityBase() {
        this(new Audit());
    }

    public EntityBase(Long id) {
        this(new Audit());
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Audit getAudit() {
        return audit;
    }
}
