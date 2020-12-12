package ir.isc.cif.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import javax.persistence.MappedSuperclass;

@Mapper(componentModel = "spring", uses = {AuditMapper.class})
public interface ProductMapper {

    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "name", target = "productName")
    @Mapping(source = "code", target = "productCode")
    ir.isc.cif.dto.Product fromProduct(ir.isc.cif.to.Product product);

    @InheritInverseConfiguration
    ir.isc.cif.to.Product toProduct(ir.isc.cif.dto.Product product);
}
