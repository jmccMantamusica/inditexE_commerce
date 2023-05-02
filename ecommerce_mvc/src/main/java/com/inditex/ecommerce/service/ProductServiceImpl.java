package com.inditex.ecommerce.service;

import com.inditex.ecommerce.model.dto.ProductRequest;
import com.inditex.ecommerce.model.dto.ProductResponse;
import com.inditex.ecommerce.model.entity.Product;
import com.inditex.ecommerce.service.utility.commons.ProductMapper;
import com.inditex.ecommerce.model.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author jcagigas
 */
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest) {
        ProductResponse response = new ProductResponse();
        try {
            List<Product> productEntities = productRepository.findByProductIdAndBrandIdAndCurrentDate(
                    productRequest.getProductId(), productRequest.getBrandId(), productRequest.getCurrentDate());
            response = this.retrieveMaxPriority(productEntities);

         } catch (Exception e) {
            log.error("Error en BBDD por: " + e.getMessage());
        }
        return response;
    }

    private ProductResponse retrieveMaxPriority(List<Product> productEntities){
        Optional<Product> entity = productEntities.stream().findFirst();
        ProductResponse response = new ProductResponse();
        if(entity.isPresent()){
            response = productMapper.toResponse(entity.get());
        }else{
            log.info("there is no chosen value");
        }
        return response;
    }
}
