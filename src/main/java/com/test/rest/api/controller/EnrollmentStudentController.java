package com.test.rest.api.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.api.entity.Student;
import com.test.rest.api.entity.StudentEnrollment;
import com.test.rest.api.service.EstudentEnrrollmentService;
import com.test.rest.api.service.StudentService;
import com.test.rest.api.service.EnrollmentService;

/**
 * 
 * @author jquino
 *
 */
@RestController
@RequestMapping("/rest/student")
public class EnrollmentStudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private EstudentEnrrollmentService enrrollmentService;

	@Autowired
	private EnrollmentService tuitionService;

	@GetMapping("/list/order")
	public ResponseEntity<List<Student>> getListStudentOrder() {
		List<Student> list = studentService.getAllStudent();

		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAge() - s2.getAge();
			}
		});
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}

	@GetMapping("/list/detail")
	public ResponseEntity<List<StudentEnrollment>> getListStudentDetail() {
		List<StudentEnrollment> list = enrrollmentService.getAllStudentEnrollment();
		return new ResponseEntity<List<StudentEnrollment>>(list, HttpStatus.OK);
	}
}
