package ir.isc.cif.mapper;

import ir.isc.cif.dto.base.AuditDto;
import ir.isc.cif.to.base.Audit;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AuditMapper {

    AuditMapper MAPPER = Mappers.getMapper(AuditMapper.class);

    Audit toAudit(AuditDto audit);

    @InheritInverseConfiguration
    AuditDto fromAudit(Audit audit);
}
