package com.inditex.ecommerce.infrastructure.commons;

import com.inditex.ecommerce.domain.model.ProductResponse;
import com.inditex.ecommerce.infrastructure.entities.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    @Mapping(target="employeeId", source="product.id")
    @Mapping(target="employeeName", source="product.name")
    ProductResponse employeeToEmployeeDTO(ProductEntity product);


}
