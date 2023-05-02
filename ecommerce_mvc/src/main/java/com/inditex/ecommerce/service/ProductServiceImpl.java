package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.dto.ProductRequest;
import com.inditex.ecommerce.model.dto.ProductResponse;
import com.inditex.ecommerce.model.entity.ProductEntity;
import com.inditex.ecommerce.service.utility.commons.ProductMapper;
import com.inditex.ecommerce.model.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 *
 * @author jcagigas
 */
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest) {
        ProductResponse response = new ProductResponse();
        try {
            Optional<ProductEntity> productEntity = productRepository.findByProductIdAndBrandIdAndCurrentDate(
                    productRequest.getProductId(), productRequest.getBrandId(), productRequest.getCurrentDate());
            if(productEntity.isPresent()){
                return productMapper.toResponse(productEntity.get());
            }
        } catch (Exception e) {
            log.error("Error en BBDD por: " + e.getMessage());
        }
        return response;
    }
}
