package com.test.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rest.api.entity.StudentEnrollment;
import com.test.rest.api.repository.StudentEnrollmentRepository;

/**
 * 
 * @author jquino
 *
 */
@Service
public class StudentEnrrollmentServiceImpl implements EstudentEnrrollmentService {

	@Autowired
	private StudentEnrollmentRepository studentEnrollmentRepository;

	@Override
	public StudentEnrollment createStudentEnrollment(StudentEnrollment StudentEnrollment) {
		return studentEnrollmentRepository.save(StudentEnrollment);
	}

	@Override
	public List<StudentEnrollment> getAllStudentEnrollment() {
		return studentEnrollmentRepository.findAll();
	}

	@Override
	public StudentEnrollment updateStudentEnrollment(Integer id, StudentEnrollment StudentEnrollment) {
		StudentEnrollment t = studentEnrollmentRepository.findById(id).orElse(new StudentEnrollment());
		t = StudentEnrollment;
		t.setIdStudentEnrollment(id);
		studentEnrollmentRepository.save(StudentEnrollment);
		return studentEnrollmentRepository.save(StudentEnrollment);
	}

	@Override
	public void deleteStudentEnrollment(Integer id) {
		studentEnrollmentRepository.deleteById(id);
	}
}
