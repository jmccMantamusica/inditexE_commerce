package com.inditex.ecommerce.domain.ports.input;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;

import java.util.List;

public interface ProductUseCase {

    List<ProductResponse> getAllProductsByProductIdByDateAndPriceListId(ProductRequest productRequest);
}
