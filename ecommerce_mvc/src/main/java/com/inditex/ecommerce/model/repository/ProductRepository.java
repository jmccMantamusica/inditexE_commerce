package com.inditex.ecommerce.model.repository;

import com.inditex.ecommerce.model.dto.ProductResponse;
import com.inditex.ecommerce.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM PRODUCT " +
            "WHERE (PRODUCT_ID =?1 AND BRAND_ID =?2 AND ?3 BETWEEN START_DATE AND END_DATE) " +
            "ORDER BY PRIORITY DESC", nativeQuery = true)
    List<Product> findByProductIdAndBrandIdAndCurrentDate(Long productId, Long brandId,
                                                                  LocalDateTime currentDate);
}
