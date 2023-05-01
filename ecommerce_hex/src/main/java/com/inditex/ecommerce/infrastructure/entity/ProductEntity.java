package com.inditex.ecommerce.infrastructure.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
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
