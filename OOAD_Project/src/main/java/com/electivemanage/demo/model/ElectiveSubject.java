package com.electivemanage.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Electives_List")
public class ElectiveSubject {
	
//	private int number_of_electives;
	public String elective_name;
	public String elective_ID;
	public int number_of_students;
	public int number_of_faculties;
	public int elective_domain;
	public List<String> faculty_list;
	
//	private void facultyView() {};
//	private void studentView() {};
	
	public String getElective_name() {
		return elective_name;
	}
	public void setElective_name(String elective_name) {
		this.elective_name = elective_name;
	}
	public String getElective_ID() {
		return elective_ID;
	}
	public void setElective_ID(String elective_ID) {
		this.elective_ID = elective_ID;
	}
	public int getNumber_of_students() {
		return number_of_students;
	}
	public void setNumber_of_students(int number_of_students) {
		this.number_of_students = number_of_students;
	}
	public int getNumber_of_faculties() {
		return number_of_faculties;
	}
	public void setNumber_of_faculties(int number_of_faculties) {
		this.number_of_faculties = number_of_faculties;
	}
	public int getElective_domain() {
		return elective_domain;
	}
	public void setElective_domain(int elective_domain) {
		this.elective_domain = elective_domain;
	}
	public List<String> getFaculty_list() {
		return faculty_list;
	}
	public void setFaculty_list(List<String> faculty_list) {
		this.faculty_list = faculty_list;
	}
	
	
}
