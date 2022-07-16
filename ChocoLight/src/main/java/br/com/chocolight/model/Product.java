package br.com.chocolight.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "PRODUCT_SEQ", sequenceName = "SQ_PRODUCT_ID")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1083093654834604334L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PRODUCT_SEQ")
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(nullable = false, length = 50, scale = 2)
	private BigDecimal price;
	
	@Column(length = 255)
	private String description;
	
	@Column(nullable = false, length = 500)
	private String urlImage;
	
	@Column(nullable = false, length = 50)
	private String brand;
	
	@Column(nullable = false, length = 50)
	private String weight;
	
	@PrimaryKeyJoinColumn(name = "idCategory", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	
}
