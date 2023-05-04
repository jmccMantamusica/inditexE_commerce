package com.inditex.ecommerce.domain.repository;
/**
 *
 * @author jcagigas
 */
import com.inditex.ecommerce.application.request.ProductRequest;
import com.inditex.ecommerce.application.response.ProductResponse;

public interface ProductRepository {

    ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest);
}
