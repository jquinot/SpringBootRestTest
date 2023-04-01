package com.test.rest.api.service;

import java.util.List;

import com.test.rest.api.entity.Enrollment;

/**
 * 
 * @author jquino
 *
 */
public interface EnrollmentService {
	
	public Enrollment createTuition(Enrollment tuition);

	public List<Enrollment> getAllTuition();

	public Enrollment updateTuition(Integer id, Enrollment tuition);

	public void deleteTuition(Integer id);
}
