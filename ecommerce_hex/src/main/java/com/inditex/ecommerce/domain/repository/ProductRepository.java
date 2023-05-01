package com.inditex.ecommerce.domain.repository;

import com.inditex.ecommerce.application.request.ProductRequest;
import com.inditex.ecommerce.domain.Product;

import java.util.Optional;

public interface ProductRepository {

    Optional<Product> findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest);
}
