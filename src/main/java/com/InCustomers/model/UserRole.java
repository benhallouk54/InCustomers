package com.InCustomers.model;



import javax.persistence.*;


@Entity
@Table(name = "userRole")
public class UserRole {
	private String role;
    private String user;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

  

}
