package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.dto.ProductRequest;
import com.inditex.ecommerce.model.dto.ProductResponse;
import org.springframework.stereotype.Service;

/**
 *
 * @author jcagigas
 */
@Service
public interface ProductService {

    ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest);
}
