package ir.isc.cif.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    ir.isc.cif.to.Role toRole(ir.isc.cif.dto.Role role);

    @InheritInverseConfiguration
    ir.isc.cif.dto.Role fromRole(ir.isc.cif.to.Role role);
}
