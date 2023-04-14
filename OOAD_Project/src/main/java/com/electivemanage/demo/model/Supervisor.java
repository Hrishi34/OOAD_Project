package com.electivemanage.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Supervisor_List")
public class Supervisor {
	
	private String supervisor_ID;
	public String supervisor_email;
	public String getSupervisor_ID() {
		return supervisor_ID;
	}
	public void setSupervisor_ID(String supervisor_ID) {
		this.supervisor_ID = supervisor_ID;
	}
	public String getSupervisor_email() {
		return supervisor_email;
	}
	public void setSupervisor_email(String supervisor_email) {
		this.supervisor_email = supervisor_email;
	}
	
//	private void voidStudents() {};

	
}
