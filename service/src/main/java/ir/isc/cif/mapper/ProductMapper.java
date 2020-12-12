package ir.isc.cif.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {AuditMapper.class})
public interface ProductMapper {

    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    ir.isc.cif.dto.Product fromProduct(ir.isc.cif.to.Product product);

    @InheritInverseConfiguration
    ir.isc.cif.to.Product toProduct(ir.isc.cif.dto.Product product);
}
