package com.inditex.ecommerce.domain.service;
/**
 *
 * @author jcagigas
 */
import com.inditex.ecommerce.application.request.ProductRequest;
import com.inditex.ecommerce.application.response.ProductResponse;
import com.inditex.ecommerce.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class DomainProductService implements ProductService{

    private final ProductRepository productRepository;

    public DomainProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponse findByProductIdAndBrandIdAndCurrentDate(ProductRequest productRequest) {
        return productRepository.findByProductIdAndBrandIdAndCurrentDate(productRequest);
    }
}
