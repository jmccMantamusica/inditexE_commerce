package com.inditex.ecommerce.infrastructure.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "prices")
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id")
    private Long priceid;

    @ManyToMany(mappedBy = "products")
    public List<ProductEntity> products = new ArrayList<>();
}
