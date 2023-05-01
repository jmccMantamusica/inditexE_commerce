package com.inditex.ecommerce.service.utility.commons;

import com.inditex.ecommerce.model.dto.response.ProductResponse;
import com.inditex.ecommerce.model.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Mapper
public interface ProductMapper {

    @Mapping(source = "entity.brandPk.brandId", target = "brandId")
    @Mapping(source = "entity.brandPk.priceList", target = "priceList")
    ProductResponse toResponse(ProductEntity entity);

    default LocalDateTime mapTimestamp(Timestamp timestamp) {
        return timestamp.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

}
