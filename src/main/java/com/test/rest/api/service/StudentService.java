package com.test.rest.api.service;

import java.util.List;

import com.test.rest.api.entity.Student;

/**
 * 
 * @author jquino
 *
 */
public interface StudentService {
	
	public Student createStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student updateStudent(Integer id, Student student);
	
	public void deleteStudent(Integer id);

}
