package com.inditex.ecommerce.infrastructure.repositories;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;
import com.inditex.ecommerce.infrastructure.commons.ProductMapper;
import com.inditex.ecommerce.infrastructure.entities.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.inditex.ecommerce.domain.ports.output.ProductRepositoryPort;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JpaProductRepositoryAdapter implements ProductRepositoryPort{

    private final JpaProductRepository jpaProductRepository;
    private final ProductMapper productMapper;

    private static Logger logger = LoggerFactory.getLogger(JpaProductRepositoryAdapter.class);
    @Override
    public ProductResponse getProductByProductIdByDateAndPriceListId(ProductRequest productRequest) {

        ProductResponse productResponse = new ProductResponse();
        Optional<ProductEntity> productEntity = jpaProductRepository.findByProductIdAndBrandIdAndCurrentDate(
                productRequest.getProductId(), productRequest.getBrandId(), productRequest.getCurrentDate());

        if(!productEntity.isPresent()){
            logger.error("There is no product with the requested data.");
        }else{
            productResponse = productMapper.producEntitytToProductResponse(productEntity.get());
        }
        return productResponse;
    }
}
