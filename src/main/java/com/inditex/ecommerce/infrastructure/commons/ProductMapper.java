package com.inditex.ecommerce.infrastructure.commons;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;
import com.inditex.ecommerce.infrastructure.entities.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductResponse producEntitytToProductResponse(ProductEntity productEntity);

}
