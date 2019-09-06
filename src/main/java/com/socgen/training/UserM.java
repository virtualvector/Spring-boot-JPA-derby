package com.socgen.training;

import javax.persistence.Entity;
import javax.persistence.Id;

//Maps this class to the table
@Entity
public class UserM {
	
	//Makes this act as a primary key in the table
	@Id
	Integer id;
	
	String userName, userEmail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
