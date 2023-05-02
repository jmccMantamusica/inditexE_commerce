package com.inditex.ecommerce.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;

import javax.persistence.*;
import java.sql.Timestamp;
/**
 *
 * @author jcagigas
 */
@Entity
@Table
@Data
@EqualsAndHashCode
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long priceList;

	@ManyToOne (cascade=CascadeType.ALL)
	private BrandEntity brandEntity;

	private Long productId;

	private Timestamp startDate;

	private Timestamp endDate;

	private Integer priority;

	private Double price;

	private String currency;

}
