package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.dto.ProductRequest;
import com.inditex.ecommerce.model.dto.ProductResponse;
/**
 *
 * @author jcagigas
 */
public interface ProductService {

    ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest);
}
