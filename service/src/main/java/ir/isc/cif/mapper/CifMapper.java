package ir.isc.cif.mapper;

import ir.isc.cif.dto.CustomerInformationFile;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AuditMapper.class})
public interface CifMapper {

    CustomerInformationFile fromCustomerInformationFile(ir.isc.cif.to.CustomerInformationFile cif);

    @InheritInverseConfiguration
    ir.isc.cif.to.CustomerInformationFile toCustomerInformationFile(ir.isc.cif.dto.CustomerInformationFile cif);
}
