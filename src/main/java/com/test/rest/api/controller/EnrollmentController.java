package com.test.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.api.entity.Enrollment;
import com.test.rest.api.service.EnrollmentService;

/**
 * 
 * @author jquino
 *
 */
@RestController
@RequestMapping("/rest/tuition")
public class EnrollmentController {

	@Autowired
	private EnrollmentService tuitionService;

	@PostMapping("/save")
	public ResponseEntity<Enrollment> createTuition(@RequestBody Enrollment Tuition) {

		return new ResponseEntity<Enrollment>(tuitionService.createTuition(Tuition), HttpStatus.CREATED);
	}

	@GetMapping("/list")
	public ResponseEntity<List<Enrollment>> getAllTuition() {

		return new ResponseEntity<List<Enrollment>>(tuitionService.getAllTuition(), HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<Enrollment> updateTuition(@PathVariable("id") Integer id, @RequestBody Enrollment Tuition) {
		return new ResponseEntity<Enrollment>(tuitionService.updateTuition(id, Tuition), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteTuition(@PathVariable("id") Integer id) {
		tuitionService.deleteTuition(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
