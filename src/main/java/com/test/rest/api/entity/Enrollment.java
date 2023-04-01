package com.test.rest.api.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "tuition")
public class Enrollment {
	@Id
	@Column(name = "id_tuition")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTuition;
	@Column(nullable = false,name = "date_tuition")	
	private LocalDateTime dateTuition;

	@ManyToOne
	@JoinColumn(name = "fk_student", nullable = false, foreignKey = @ForeignKey(name = "id_student"))
	private Student student;

	@OneToMany(mappedBy = "idStudentEnrollment", cascade = CascadeType.ALL)
	private List<StudentEnrollment> studentEnrollments;

	@Column(nullable = true)
	private boolean state;	
}
