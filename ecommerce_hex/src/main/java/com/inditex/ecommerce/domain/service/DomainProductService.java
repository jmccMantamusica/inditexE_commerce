package com.inditex.ecommerce.domain.service;
/**
 *
 * @author jcagigas
 */
import com.inditex.ecommerce.application.request.ProductRequest;
import com.inditex.ecommerce.application.response.ProductResponse;
import com.inditex.ecommerce.domain.repository.ProductRepository;
import com.inditex.ecommerce.infrastructure.commons.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class DomainProductService implements ProductService{

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;


    public DomainProductService(final ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest) {
        return productMapper.toDomain(
                productRepository.findByProductIdAndBrandIdAndCurrentDate(
                        productRequest).orElseThrow(()
                        -> new RuntimeException("Product with given ids don't exist")));
    }
}
