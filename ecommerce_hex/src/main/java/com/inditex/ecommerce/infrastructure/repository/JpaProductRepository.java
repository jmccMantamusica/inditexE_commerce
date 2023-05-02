package com.inditex.ecommerce.infrastructure.repository;

import com.inditex.ecommerce.infrastructure.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;
/**
 *
 * @author jcagigas
 */
@Repository
public interface JpaProductRepository {
    @Query(value = "SELECT p FROM PRODUCT_ENTITY p " +
            "WHERE p.PRODUCT_ID=:productId AND p.BRAND_ENTITY_ID=:brandId " +
            "AND :currentDate BETWEEN p.START_DATE AND p.END_DATE" +
            "ORDER BY p.PRIORITY DESC LIMIT 1")
    Optional<ProductEntity> findByProductIdAndBrandIdAndCurrentDate(Long productId, Long brandId,
                                                                    LocalDateTime currentDate);
}
