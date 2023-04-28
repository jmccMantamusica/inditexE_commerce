package com.inditex.ecommerce.infrastructure.config;

import com.inditex.ecommerce.application.services.ProductService;
import com.inditex.ecommerce.domain.ports.output.ProductRepositoryPort;
import com.inditex.ecommerce.infrastructure.repositories.JpaProductRepositoryAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ApplicationConfig {

    @Bean
    public ProductService productService(ProductRepositoryPort productRepositoryPort) {
        return new ProductService();
    }

    @Bean
    public ProductRepositoryPort productRepositoryPort(JpaProductRepositoryAdapter jpaProductRepositoryAdapter) {
        return (ProductRepositoryPort) jpaProductRepositoryAdapter;
    }
}
