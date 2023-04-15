package com.electivemanage.demo.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electivemanage.demo.model.Student;
import com.electivemanage.demo.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository student_repository;
	
	
	public Student saveStudent(Student student) {
		
        return student_repository.save(student);
    }
//	private void subjectSelection() {};
//	private void facultySelection() {};
	
}
