package com.electivemanage.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electivemanage.demo.model.ElectiveSubject;

@Repository
public interface ElectiveRepository extends JpaRepository <ElectiveSubject,String> {

}
