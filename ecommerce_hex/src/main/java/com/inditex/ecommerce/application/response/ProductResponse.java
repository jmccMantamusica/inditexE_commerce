package com.inditex.ecommerce.application.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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
