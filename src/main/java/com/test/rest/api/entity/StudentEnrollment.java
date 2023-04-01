package com.test.rest.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "student_enrollment")
public class StudentEnrollment {
	@Id
	@Column(name = "id_student_enrollment")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStudentEnrollment;

	//Relacionar matricula
	
	@ManyToOne
	@JoinColumn(name = "fk_course", nullable = false, foreignKey = @ForeignKey(name = "id_course"))
	private Classrom course;

	@Column(length = 50, nullable = false)
	private String classRoom;
}
