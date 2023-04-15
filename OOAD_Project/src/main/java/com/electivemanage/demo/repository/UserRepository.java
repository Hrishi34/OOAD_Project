package com.electivemanage.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electivemanage.demo.model.LoginUser;

@Repository
public interface UserRepository extends JpaRepository <LoginUser,String> {

}

