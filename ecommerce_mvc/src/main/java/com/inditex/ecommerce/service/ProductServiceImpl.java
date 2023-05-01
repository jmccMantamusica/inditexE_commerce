package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.dto.request.ProductRequest;
import com.inditex.ecommerce.model.dto.response.ProductResponse;
import com.inditex.ecommerce.service.utility.commons.ProductMapper;
import com.inditex.ecommerce.model.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jcagigas
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    private ProductMapper productMapper;

    @Override
    public ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest) {
        return productMapper.toResponse(
                productRepository.findByProductIdAndBrandIdAndCurrentDate(
                        productRequest.getProductId(), productRequest.getBrandId(),productRequest.getCurrentDate()
                ).orElseThrow(()
                        -> new RuntimeException("Product with given ids don't exist")));
    }
}
