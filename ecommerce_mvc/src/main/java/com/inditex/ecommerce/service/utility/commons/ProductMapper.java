package com.inditex.ecommerce.service.utility.commons;

import com.inditex.ecommerce.model.dto.ProductResponse;
import com.inditex.ecommerce.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Mapper
public interface ProductMapper {

    @Mapping(source = "entity.brand.id", target = "brandId")
    ProductResponse toResponse(Product entity);


    default LocalDateTime mapTimestamp(Timestamp timestamp) {
        return timestamp.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

}
