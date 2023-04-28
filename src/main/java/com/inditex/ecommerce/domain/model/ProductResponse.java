package com.inditex.ecommerce.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductResponse {

    private Integer rateApplied;
    private Double finalPrice;
    private String currency;
}
