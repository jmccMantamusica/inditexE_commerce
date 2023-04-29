package com.inditex.ecommerce.domain.model;

import com.sun.istack.NotNull;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ProductRequest {

    @NotNull
    private Long productId;

    @NotNull
    private LocalDateTime currentDate;
    @NotNull
    private Long brandId;
}
