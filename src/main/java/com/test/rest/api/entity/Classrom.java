package com.test.rest.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 
 * @author jquino
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity	
@Table(name = "course")
public class Classrom {
	@Id
	@Column(name = "id_course")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCourse;

	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = true, length = 100)
	private String title;

	@Column(nullable = true, length = 100)
	private String nemonic;

	@Column(nullable = false)
	private boolean state;
}
