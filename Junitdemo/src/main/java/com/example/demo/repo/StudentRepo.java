package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
	
	@Query("SELECT CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE "+ "END FROM Student s WHERE S.StudentId=?1")
	Boolean isStudentExitsById(Integer id);
}
