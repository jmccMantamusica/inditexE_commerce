package com.inditex.ecommerce.domain.ports.input;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;


public interface ProductUseCase {

    ProductResponse getProductByProductIdByDateAndPriceListId(ProductRequest productRequest);
}
