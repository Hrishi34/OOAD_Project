package com.electivemanage.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electivemanage.demo.model.Faculty;
import com.electivemanage.demo.model.Student;
import com.electivemanage.demo.repository.FacultyRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class FacultyService {
	
	@Autowired
	private FacultyRepository faculty_repository;
	
public Faculty saveFaculty(Faculty faculty) {
		
        return faculty_repository.save(faculty);
    }
	
//	private void viewStudentsList() {}
}
