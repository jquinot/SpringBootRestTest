package com.test.rest.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.test.rest.api.entity.Enrollment;

/**
 * 
 * @author jquino
 *
 */
public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer>{

}

