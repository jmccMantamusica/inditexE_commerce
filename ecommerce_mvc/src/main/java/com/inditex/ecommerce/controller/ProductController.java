package com.inditex.ecommerce.controller;

import com.inditex.ecommerce.model.dto.ProductRequest;
import com.inditex.ecommerce.model.dto.ProductResponse;
import com.inditex.ecommerce.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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


    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public ResponseEntity<ProductResponse> getAllProduct(ProductRequest productRequest) {
        return new ResponseEntity<>(
                productService.findByProductIdAndBrandIdAndCurrentDate(productRequest), HttpStatus.OK);
    }
}