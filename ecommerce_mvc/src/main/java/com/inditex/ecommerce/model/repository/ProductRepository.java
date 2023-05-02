package com.inditex.ecommerce.model.repository;

import com.inditex.ecommerce.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    @Query(value = "SELECT p FROM PRODUCT_ENTITY p " +
            "WHERE (p.PRODUCT_ID =?1 AND p.BRAND_ENTITY_ID =?2 AND ?3 BETWEEN p.START_DATE AND p.END_DATE)" +
            " ORDER BY p.PRIORITY DESC LIMIT 1;")
    Optional<ProductEntity> findByProductIdAndBrandIdAndCurrentDate(Long productId, Long brandId,
                                                                 LocalDateTime currentDate);
}
