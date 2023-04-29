package com.inditex.ecommerce.infrastructure.repositories;

import com.inditex.ecommerce.domain.model.ProductResponse;
import com.inditex.ecommerce.infrastructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface JpaProductRepository {
    @Query(value = "SELECT p FROM Product p " +
            "WHERE pro.productId=:productId AND p.brandId=:brandId " +
            "AND :currentDate BETWEEN p.startDate AND p.endDate")
    List<ProductEntity> findByProductIdAndBrandIdAndCurrentDate(Long productId, Long brandId,
                                                                  LocalDateTime currentDate);
}
