package ir.isc.cif.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mapper(componentModel = "spring", uses = {AuditMapper.class})
public interface ProductCategoryIgnoreParentMapper {

    Logger LOGGER = LoggerFactory.getLogger(ProductCategoryIgnoreParentMapper.class);

    ProductCategoryIgnoreParentMapper MAPPER = Mappers.getMapper(ProductCategoryIgnoreParentMapper.class);

    @Mappings({
            @Mapping(target = "masterCategory", ignore = true)
    })
    ir.isc.cif.dto.ProductCategory fromProductCategory(ir.isc.cif.to.ProductCategory productCategory);

    @InheritInverseConfiguration
    ir.isc.cif.to.ProductCategory toProductCategory(ir.isc.cif.dto.ProductCategory productCategory);

    // @AfterMapping
    default void addBackReference(@MappingTarget ir.isc.cif.dto.ProductCategory target) {
        for (ir.isc.cif.dto.ProductCategory productCategory : target.getSubCategories()) {
            productCategory.setMasterCategory(target);
        }
    }
}

