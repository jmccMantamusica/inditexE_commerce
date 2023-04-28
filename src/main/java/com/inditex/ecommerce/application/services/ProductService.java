package com.inditex.ecommerce.application.services;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;
import com.inditex.ecommerce.domain.ports.input.ProductUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductService implements ProductUseCase {


    @Override
    public List<ProductResponse> getAllProductsByProductIdByDateAndPriceListId(ProductRequest productRequest) {
        return null;
    }
}
