package com.inditex.ecommerce.infrastructure.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;


/*
  Class Brand
 */
@Entity
@Table(name = "brands")
@Data
@EqualsAndHashCode
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Long brandId;

    @NotNull
    private String name;

    @OneToOne(mappedBy="product")
    private ProductEntity product;
}
