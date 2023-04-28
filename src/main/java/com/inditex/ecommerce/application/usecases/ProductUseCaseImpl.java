package com.inditex.ecommerce.application.usecases;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;
import com.inditex.ecommerce.domain.ports.input.ProductUseCase;
import com.inditex.ecommerce.domain.ports.output.ProductRepositoryPort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductUseCaseImpl implements ProductUseCase {

    private final ProductRepositoryPort productRepositoryPort;
    @Override
    public List<ProductResponse> getAllProductsByProductIdByDateAndPriceListId(ProductRequest productRequest) {
        return productRepositoryPort.getAllProductsByProductIdByDateAndPriceListId(productRequest);
    }
}
