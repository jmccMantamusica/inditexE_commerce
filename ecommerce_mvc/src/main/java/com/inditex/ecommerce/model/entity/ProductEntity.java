package com.inditex.ecommerce.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

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

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private Integer priority;

	private Double price;

	private String currency;

}
