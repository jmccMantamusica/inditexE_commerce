package com.inditex.ecommerce.domain.service;
/**
 *
 * @author jcagigas
 */
import com.inditex.ecommerce.application.request.ProductRequest;
import com.inditex.ecommerce.application.response.ProductResponse;

public interface ProductService {

    ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest);
}
