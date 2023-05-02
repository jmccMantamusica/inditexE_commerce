package com.inditex.ecommerce.model.repository;

import com.inditex.ecommerce.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ProductRepository {
    @Query(value = "SELECT p FROM PRODUCT_ENTITY p " +
            "WHERE p.PRODUCT_ID=:productId AND p.BRAND_ID=:brandId " +
            "AND :currentDate BETWEEN p.START_DATE AND p.END_DATE" +
            "ORDER BY p.priority DESC LIMIT 1")
    Optional<ProductEntity> findByProductIdAndBrandIdAndCurrentDate(Long productId, Long brandId,
                                                                    LocalDateTime currentDate);
}
