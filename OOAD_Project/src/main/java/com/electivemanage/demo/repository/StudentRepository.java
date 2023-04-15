package com.electivemanage.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electivemanage.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,String>{

}
