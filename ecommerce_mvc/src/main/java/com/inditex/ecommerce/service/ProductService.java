package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.dto.ProductRequest;
import com.inditex.ecommerce.model.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author jcagigas
 */
public interface ProductService {

    ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest);
}
