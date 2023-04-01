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

import com.test.rest.api.entity.Classrom;
import com.test.rest.api.service.ClassroomService;

/**
 * 
 * @author jquino
 *
 */
@RestController
@RequestMapping("/rest/course")
public class ClassroomController {

	@Autowired
	private ClassroomService courseService;

	@PostMapping("/save")
	public ResponseEntity<Classrom> createStudent(@RequestBody Classrom course) {

		return new ResponseEntity<Classrom>(courseService.createCourse(course), HttpStatus.CREATED);
	}

	@GetMapping("/list")
	public ResponseEntity<List<Classrom>> getAllStudent() {

		return new ResponseEntity<List<Classrom>>(courseService.getAllCourse(), HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<Classrom> updateStudent(@PathVariable("id") Integer id, @RequestBody Classrom course) {
		return new ResponseEntity<Classrom>(courseService.updateCourse(id, course	), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") Integer id) {
		courseService.deleteCourse(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
