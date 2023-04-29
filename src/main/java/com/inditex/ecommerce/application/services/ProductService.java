package com.inditex.ecommerce.application.services;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;
import com.inditex.ecommerce.domain.ports.input.ProductUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductService implements ProductUseCase {

    private final ProductUseCase productUseCase;

    @Override
    public ProductResponse getProductByProductIdByDateAndPriceListId(ProductRequest productRequest) {
        return (ProductResponse) productUseCase.getProductByProductIdByDateAndPriceListId(productRequest);
    }
}
