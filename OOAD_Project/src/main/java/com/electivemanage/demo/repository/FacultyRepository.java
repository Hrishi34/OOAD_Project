package com.electivemanage.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electivemanage.demo.model.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository <Faculty,String>{

}

