package com.electivemanage.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Student_List")
public class Student {
	private String srn;
	private int student_semester;
	private float cgpa;
	private String student_name;
	private String student_email;
	private Long student_phno;
	
//	private void subjectSelection() {};
//	private void facultySelection() {};
	private void viewProfile(String srn) {}
	public String getSrn() {
		return srn;
	}
	public void setSrn(String srn) {
		this.srn = srn;
	}
		
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public Long getStudent_phno() {
		return student_phno;
	}
	public void setStudent_phno(Long student_phno) {
		this.student_phno = student_phno;
	}
	public int getStudent_semester() {
		return student_semester;
	}
	public void setStudent_semester(int student_semester) {
		this.student_semester = student_semester;
	};
	
	@Override
	public String toString() {
		return "Student [srn=" + srn + ", semester=" + student_semester + ", cgpa=" + cgpa + ", student_name=" + student_name
				+ ", student_email=" + student_email + ", student_phno=" + student_phno + "]";
	}
	
}
