package com.inditex.ecommerce.infrastructure.commons;

import com.inditex.ecommerce.application.response.ProductResponse;
import com.inditex.ecommerce.domain.ProductDto;
import com.inditex.ecommerce.infrastructure.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
/**
 *
 * @author jcagigas
 */
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
