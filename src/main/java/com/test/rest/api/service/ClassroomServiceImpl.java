package com.test.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rest.api.entity.Classrom;
import com.test.rest.api.repository.ClassroomRepository;

/**
 * 
 * @author jquino
 *
 */
@Service
public class ClassroomServiceImpl implements ClassroomService {
	
	@Autowired
	private ClassroomRepository courseRepository;

	@Override
	public Classrom createCourse(Classrom course) {
		return courseRepository.save(course);
	}

	@Override
	public List<Classrom> getAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classrom updateCourse(Integer id, Classrom course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCourse(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
