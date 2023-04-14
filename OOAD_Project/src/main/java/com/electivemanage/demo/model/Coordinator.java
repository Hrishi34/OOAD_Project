package com.electivemanage.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Coordinator {
	
	private String coordinator_ID;
	public String coordinator_email;
	
	private void coordinatorAddElectives() {};
	private void coordinatorFilterElectives() {};
	private void coordinatorAloocateStudents() {};
	private void coordinatorViewStudents() {}
//	private void coordinatorDownloadStudents() {};
	
	public String getCoordinator_ID() {
		return coordinator_ID;
	}
	public void setCoordinator_ID(String coordinator_ID) {
		this.coordinator_ID = coordinator_ID;
	}
	public String getCoordinator_email() {
		return coordinator_email;
	}
	public void setCoordinator_email(String coordinator_email) {
		this.coordinator_email = coordinator_email;
	};

	
}
