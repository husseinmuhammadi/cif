package ir.isc.cif.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AuditMapper {

    AuditMapper MAPPER = Mappers.getMapper(AuditMapper.class);

    ir.isc.cif.to.base.Audit toAudit(ir.isc.cif.dto.base.Audit audit);

    @InheritInverseConfiguration
    ir.isc.cif.dto.base.Audit fromAudit(ir.isc.cif.to.base.Audit audit);
}
