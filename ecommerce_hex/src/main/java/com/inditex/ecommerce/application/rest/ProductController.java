package com.inditex.ecommerce.application.rest;

import com.inditex.ecommerce.application.request.ProductRequest;
import com.inditex.ecommerce.application.response.ProductResponse;
import com.inditex.ecommerce.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
/**
 *
 * @author jcagigas
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<ProductResponse> getAllProduct(@RequestBody ProductRequest productRequest) {
        return new ResponseEntity<>(
                productService.findByProductIdAndBrandIdAndCurrentDate(productRequest), HttpStatus.OK);
    }
}