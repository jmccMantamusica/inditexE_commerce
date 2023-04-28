package com.inditex.ecommerce.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ProductResponse {

    private Long productId;
    private Long brandId;
    private Integer priceList;
    private Double price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
