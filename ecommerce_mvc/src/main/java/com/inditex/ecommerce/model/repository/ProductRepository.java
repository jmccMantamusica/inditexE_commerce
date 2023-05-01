package com.inditex.ecommerce.model.repository;

import com.inditex.ecommerce.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ProductRepository {
    @Query(value = "SELECT p FROM Product p " +
            "WHERE pro.productId=:productId AND p.brandId=:brandId " +
            "AND :currentDate BETWEEN p.startDate AND p.endDate" +
            "ORDER BY p.priority DESC LIMIT 1")
    Optional<ProductEntity> findByProductIdAndBrandIdAndCurrentDate(Long productId, Long brandId,
                                                                    LocalDateTime currentDate);
}
