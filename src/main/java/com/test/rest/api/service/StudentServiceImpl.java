package com.test.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rest.api.entity.Student;
import com.test.rest.api.repository.StudentRepository;

/**
 * 
 * @author jquino
 *
 */
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override	
	public Student createStudent(Student student) {
			
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Integer id, Student student) {
		student.setIdStudent(null);
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Integer id) {
		
		studentRepository.deleteById(null);
	}

}
