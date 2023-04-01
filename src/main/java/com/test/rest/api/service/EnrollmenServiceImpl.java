package com.test.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rest.api.entity.Enrollment;
import com.test.rest.api.repository.EnrollmentRepository;

/**
 * 
 * @author jquino
 *
 */
@Service
public class EnrollmenServiceImpl implements EnrollmentService {

	@Autowired
	private EnrollmentRepository tuitionRepository;

	@Override
	public Enrollment createTuition(Enrollment tuition) {
		return tuitionRepository.save(tuition);
	}

	@Override
	public List<Enrollment> getAllTuition() {
		return tuitionRepository.findAll();
	}

	@Override
	public Enrollment updateTuition(Integer id, Enrollment tuition) {
		Enrollment t = tuitionRepository.findById(id).orElse(new Enrollment());
		t = tuition;
		t.setIdTuition(id);
		tuitionRepository.save(tuition);
		return tuitionRepository.save(tuition);
	}

	@Override
	public void deleteTuition(Integer id) {
		tuitionRepository.deleteById(id);
	}

}
