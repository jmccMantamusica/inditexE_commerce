package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.dto.request.ProductRequest;
import com.inditex.ecommerce.model.dto.response.ProductResponse;
/**
 *
 * @author jcagigas
 */
public interface ProductService {

    ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest);
}
