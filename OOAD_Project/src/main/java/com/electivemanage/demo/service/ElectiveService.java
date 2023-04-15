package com.electivemanage.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electivemanage.demo.model.ElectiveSubject;
import com.electivemanage.demo.model.Student;
import com.electivemanage.demo.repository.ElectiveRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ElectiveService {

	@Autowired 
	private ElectiveRepository elective_repository;
	
	
	public ElectiveSubject saveStudent(ElectiveSubject elective_subject) {
		
        return elective_repository.save(elective_subject);
    }
//	private void facultyView() {};
//	private void studentView() {};

}
