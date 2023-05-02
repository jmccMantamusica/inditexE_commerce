package com.inditex.ecommerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
/**
 *
 * @author jcagigas
 */
@Getter
@Setter
@AllArgsConstructor
public class ProductRequest {

    private Long productId;
    private Long brandId;
    private LocalDateTime currentDate;
}
