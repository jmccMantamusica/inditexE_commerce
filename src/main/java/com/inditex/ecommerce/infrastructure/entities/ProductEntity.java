package com.inditex.ecommerce.infrastructure.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

/*
  Class Product
 */
@Entity
@Table(name = "PRICES", uniqueConstraints = {@UniqueConstraint(columnNames = {"brandId"})})
@Data
@EqualsAndHashCode
public class ProductEntity {

    @Id
    @NotNull
    @Column(name = "BRAND_ID")
    private Long brandId;
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name="START_DATE")
    private LocalDateTime startDate;
    @Column(name="END_DATE")
    private LocalDateTime endDate;
    @Column(name="PRIORITY")
    private Integer priority;
    @Column(name= "PRICE")
    private Double price;
    @Column(name= "CURR")
    private String currency;
    @Column(name= "PRICE_LIST")
    private Long priceList;


}
