package com.inditex.ecommerce.model.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
/**
 *
 * @author jcagigas
 */
@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class BrandPk implements Serializable {

    private Long brandId;
    private Long priceList;
}
