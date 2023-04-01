package com.test.rest.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.test.rest.api.entity.Classrom;

/**
 * 
 * @author jquino
 *
 */
public interface ClassroomRepository extends JpaRepository<Classrom, Integer	>{

}

