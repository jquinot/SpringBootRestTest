package com.test.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.rest.api.entity.Student;

/**
 * 
 * @author jquino
 *
 */
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
