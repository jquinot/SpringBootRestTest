package com.test.rest.api.service;

import java.util.List;

import com.test.rest.api.entity.StudentEnrollment;

/**
 * 
 * @author jquino
 *
 */
public interface EstudentEnrrollmentService {
	
	public StudentEnrollment createStudentEnrollment(StudentEnrollment StudentEnrollment);

	public List<StudentEnrollment> getAllStudentEnrollment();

	public StudentEnrollment updateStudentEnrollment(Integer id, StudentEnrollment StudentEnrollment);

	public void deleteStudentEnrollment(Integer id);
}
