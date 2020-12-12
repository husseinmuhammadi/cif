package ir.isc.cif.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mapper(componentModel = "spring", uses = {AuditMapper.class})
public interface ProductCategoryMapper {

    ProductCategoryMapper MAPPER = Mappers.getMapper(ProductCategoryMapper.class);

    Logger LOGGER = LoggerFactory.getLogger(ProductCategoryMapper.class);

//    @Mappings({
//            @Mapping(target = "masterCategory", ignore = true)
//    })
    ir.isc.cif.dto.ProductCategory fromProductCategory(ir.isc.cif.to.ProductCategory productCategory, @Context CycleAvoidingMappingContext context);

    @InheritInverseConfiguration
    ir.isc.cif.to.ProductCategory toProductCategory(ir.isc.cif.dto.ProductCategory productCategory, @Context CycleAvoidingMappingContext context);

    // @AfterMapping
    default void addBackReference(@MappingTarget ir.isc.cif.dto.ProductCategory target) {
        for (ir.isc.cif.dto.ProductCategory productCategory : target.getSubCategories()) {
            productCategory.setMasterCategory(target);
        }
    }
}

