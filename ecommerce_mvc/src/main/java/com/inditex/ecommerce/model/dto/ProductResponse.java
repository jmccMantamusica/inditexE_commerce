package com.inditex.ecommerce.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
/**
 *
 * @author jcagigas
 */
@Getter
@Setter
@NoArgsConstructor
public class ProductResponse {

    private Long productId;
    private Long brandId;
    private Long priceList;
    private Double price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
