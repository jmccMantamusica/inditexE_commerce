package com.inditex.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
/**
 *
 * @author jcagigas
 */
@SpringBootApplication
@EntityScan("com.inditex.ecommerce.infrastructure.entity")
public class ECommerceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceServiceApplication.class);
    }


}
