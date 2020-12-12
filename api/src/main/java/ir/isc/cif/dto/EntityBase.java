package ir.isc.cif.dto;

import ir.isc.cif.dto.base.AuditDto;

public abstract class EntityBase {

    private Long id;

    private final AuditDto audit;

    private EntityBase(AuditDto audit) {
        this.audit = audit;
    }

    EntityBase() {
        this(new AuditDto());
    }

    public EntityBase(Long id) {
        this(new AuditDto());
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuditDto getAudit() {
        return audit;
    }
}
