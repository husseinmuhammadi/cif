package ir.isc.cif.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    ir.isc.cif.to.User toUser(ir.isc.cif.dto.User user);

    @InheritInverseConfiguration
    ir.isc.cif.dto.User fromUser(ir.isc.cif.to.User user);
}
