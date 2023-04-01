package com.test.rest.api.service;

import java.util.List;

import com.test.rest.api.entity.Classrom;

/**
 * 
 * @author jquino
 *
 */
public interface ClassroomService {
	
	public Classrom createCourse(Classrom course);

	public List<Classrom> getAllCourse();

	public Classrom updateCourse(Integer id, Classrom course);

	public void deleteCourse(Integer id);
}
