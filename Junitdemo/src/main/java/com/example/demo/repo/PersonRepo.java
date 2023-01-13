package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {
	
	@Query("SELECT CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personId=?1")
Boolean isPersonExitsById(Integer id);
}
