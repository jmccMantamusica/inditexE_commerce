package com.inditex.ecommerce.infrastructure.controllers;

import com.inditex.ecommerce.domain.model.ProductRequest;
import com.inditex.ecommerce.domain.model.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<ProductResponse>> getAllProductsByProductIdByDateAndPriceListId(ProductRequest productRequest) {
        List<ProductResponse> products = productService.getAllProductsByProductIdByDateAndPriceListId();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
