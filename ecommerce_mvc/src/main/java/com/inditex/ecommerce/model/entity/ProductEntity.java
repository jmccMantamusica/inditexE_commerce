package com.inditex.ecommerce.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.sql.Timestamp;
/**
 *
 * @author jcagigas
 */
@Entity
@Table(name = "PRICES")
@Data
@EqualsAndHashCode
public class ProductEntity {

	@EmbeddedId
	private BrandPk brandPk;

	private Long productId;

	private Timestamp startDate;

	private Timestamp endDate;

	private Integer priority;

	private Double price;

	private String currency;

}
