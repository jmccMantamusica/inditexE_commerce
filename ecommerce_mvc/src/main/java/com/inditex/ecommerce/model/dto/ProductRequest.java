package com.inditex.ecommerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 *
 * @author jcagigas
 */
@Getter
@Setter
@AllArgsConstructor
public class ProductRequest implements Serializable {

    private Long productId;
    private Long brandId;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime currentDate;
}
