package com.inditex.ecommerce.infrastructure.entities;

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
@Table(name = "products")
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name="start_date")
    private LocalDateTime startDate;

    @Column(name="end_date")
    private LocalDateTime endDate;

    private Integer priority;
    private Double price;
    private Currency currency;

    @OneToOne
    @JoinColumn(name="brand_product")
    private BrandEntity brand;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "product_price", joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "price_id")
    )
    @Column(name="price_list")
    private List<PriceEntity> priceList = new ArrayList<>();

}
