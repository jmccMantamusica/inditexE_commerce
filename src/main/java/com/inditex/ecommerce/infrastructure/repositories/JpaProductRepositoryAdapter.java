package com.inditex.ecommerce.infrastructure.repositories;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;
import com.inditex.ecommerce.infrastructure.commons.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.inditex.ecommerce.domain.ports.output.ProductRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class JpaProductRepositoryAdapter implements ProductRepositoryPort{

    private final JpaProductRepository jpaProductRepository;
    private final ProductMapper productMapper;
    @Override
    public List<ProductResponse> getAllProductsByProductIdByDateAndPriceListId(ProductRequest productRequest) {

        return jpaProductRepository.findByProductIdAndBrandIdAndCurrentDate(
                productRequest.getProductId(), productRequest.getBrandId(), productRequest.getCurrentDate())
                .stream()
                .map(productEntity -> productMapper.producEntitytToProductResponse(productEntity))
                .collect(Collectors.toList());
    }
}
