package com.electivemanage.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Faculty_List")
public class Faculty {
	
	public String getFaculty_ID() {
		return faculty_ID;
	}
	public void setFaculty_ID(String faculty_ID) {
		this.faculty_ID = faculty_ID;
	}
	public String getFaculty_elective() {
		return faculty_elective;
	}
	public void setFaculty_elective(String faculty_elective) {
		this.faculty_elective = faculty_elective;
	}
	public String getFaculty_email() {
		return faculty_email;
	}
	public void setFaculty_email(String faculty_email) {
		this.faculty_email = faculty_email;
	}
	private String faculty_ID;
	private String faculty_elective;
	public String faculty_email;
	
//	private void viewStudentsList() {}
}
