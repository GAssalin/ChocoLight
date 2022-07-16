package br.com.chocolight.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "CATEGORY_SEQ", sequenceName = "SQ_CATEGORY_ID")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3475090805380677474L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CATEGORY_SEQ")
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String name;

}
