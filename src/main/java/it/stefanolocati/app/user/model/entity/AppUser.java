package it.stefanolocati.app.user.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AppUser {
	
	@Id
	private Long id;
	
	private String firstName, lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

}
