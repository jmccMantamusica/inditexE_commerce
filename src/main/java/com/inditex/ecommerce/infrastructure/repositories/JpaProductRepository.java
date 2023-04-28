package com.inditex.ecommerce.infrastructure.repositories;

import com.inditex.ecommerce.infrastructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface JpaProductRepository {
    @Query(value = " ")
    List<ProductEntity> findByProductIdAndBrandIdAndCurrentDate(Long productId, Long brandId,
                                                                LocalDateTime currentDate);
}
