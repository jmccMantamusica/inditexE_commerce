package com.inditex.ecommerce.application.usecases;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;
import com.inditex.ecommerce.domain.ports.input.ProductUseCase;
import com.inditex.ecommerce.domain.ports.output.ProductRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductUseCaseImpl implements ProductUseCase {

    private final ProductRepositoryPort productRepositoryPort;
    @Override
    public ProductResponse getProductByProductIdByDateAndPriceListId(ProductRequest productRequest) {
        return productRepositoryPort.getProductByProductIdByDateAndPriceListId(productRequest);
    }
}
