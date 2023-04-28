package com.inditex.ecommerce.infrastructure.repositories;

import com.inditex.ecommerce.infrastructure.entities.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class JpaProductRepositoryAdapter implements JpaProductRepository{

    private final JpaProductRepository jpaProductRepository;


    @Override
    public List<ProductEntity> findByProductIdAndBrandIdAndCurrentDate(Long productId, Long brandId,
                                                                       LocalDateTime currentDate) {
        return jpaProductRepository.findByProductIdAndBrandIdAndCurrentDate(productId, brandId, currentDate);
    }
}
