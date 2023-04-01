package com.test.rest.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.test.rest.api.entity.Classrom;
import com.test.rest.api.entity.StudentEnrollment;
/**
 * 
 * @author jquino
 *
 */
public interface StudentEnrollmentRepository extends JpaRepository<StudentEnrollment, Integer	>{

}

