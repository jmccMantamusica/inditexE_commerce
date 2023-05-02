package com.inditex.ecommerce.controller;

import com.inditex.ecommerce.model.dto.request.ProductRequest;
import com.inditex.ecommerce.model.dto.response.ProductResponse;
import com.inditex.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author jcagigas
 */
@RestController
@RequestMapping(path = "api/v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<ProductResponse> getAllProduct(@RequestBody ProductRequest productRequest) {
        return new ResponseEntity<>(
                productService.findByProductIdAndBrandIdAndCurrentDate(productRequest), HttpStatus.OK);
    }
}