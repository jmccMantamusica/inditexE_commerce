package com.inditex.ecommerce.domain.repository;
/**
 *
 * @author jcagigas
 */
import com.inditex.ecommerce.application.request.ProductRequest;
import com.inditex.ecommerce.domain.ProductDto;

import java.util.Optional;

public interface ProductRepository {

    Optional<ProductDto> findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest);
}
