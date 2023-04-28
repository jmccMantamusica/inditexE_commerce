package com.inditex.ecommerce.domain.ports.output;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;

import java.util.List;

public interface ProductRepositoryPort {

    List<ProductResponse> getAllProductsByProductIdByDateAndPriceListId(ProductRequest productRequest);
}
