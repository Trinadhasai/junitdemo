package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
@Autowired
	private StudentRepo repo;

 	public List<Student>grtAllStudent()
 	{
 		return this.repo.findAll();
 	}

	public StudentService(StudentRepo repo) {
		super();
		this.repo = repo;
	}
}
