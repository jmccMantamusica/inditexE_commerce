package com.inditex.ecommerce.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jcagigas
 */
@Entity
@Table
@Data
@EqualsAndHashCode
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy="brandEntity",cascade=CascadeType.ALL)
    private Set<ProductEntity> productEntities = new HashSet<>();
}
