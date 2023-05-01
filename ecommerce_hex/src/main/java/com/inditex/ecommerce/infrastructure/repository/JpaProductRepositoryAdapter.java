package com.inditex.ecommerce.infrastructure.repository;

import com.inditex.ecommerce.application.request.ProductRequest;
import com.inditex.ecommerce.domain.Product;
import com.inditex.ecommerce.domain.repository.ProductRepository;
import com.inditex.ecommerce.infrastructure.commons.ProductMapper;

import com.inditex.ecommerce.infrastructure.entity.ProductEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
public class JpaProductRepositoryAdapter implements ProductRepository {

    private final JpaProductRepository jpaProductRepository;
    private final ProductMapper productMapper;

    private static Logger logger = LoggerFactory.getLogger(JpaProductRepositoryAdapter.class);

    @Autowired
    public JpaProductRepositoryAdapter(JpaProductRepository jpaProductRepository, ProductMapper productMapper) {
        this.jpaProductRepository = jpaProductRepository;
        this.productMapper = productMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest) {

        Optional<ProductEntity> productEntity = jpaProductRepository.findByProductIdAndBrandIdAndCurrentDate(
                productRequest.getProductId(), productRequest.getBrandId(), productRequest.getCurrentDate());

        if (!productEntity.isPresent()) {
            logger.error("There is no product with the requested data.");
            return Optional.empty();
        } else {
            return Optional.of(productMapper.toModel(productEntity.get()));
        }
    }

}
