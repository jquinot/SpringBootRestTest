package com.test.rest.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * @author jquino
 *
 */
@Data
@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "id_student")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStudent;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(name = "last_name",nullable = false, length = 100)
	private String lastName;
	
	@Column(name = "dni",nullable = false, length = 100)
	private String dni;
	
	@Column(nullable = false, length = 100)
	private String email;
	
	@Column(nullable = false, length = 100)
	private String address;
	
	@Column(nullable = false, length = 100)
	private Integer age;
}
