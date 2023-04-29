package com.inditex.ecommerce.domain.ports.output;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;

public interface ProductRepositoryPort {

    ProductResponse getProductByProductIdByDateAndPriceListId(ProductRequest productRequest);
}
