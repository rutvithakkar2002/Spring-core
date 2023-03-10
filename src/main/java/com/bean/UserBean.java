package com.bean;

public class UserBean {

	String firstName;
	String email;
	String password;

	RoleBean role; // this is called dependency.

	public UserBean(RoleBean role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleBean getRole() {
		return role;
	}

	public void setRole(RoleBean role) {
		this.role = role;
	}
	public void def() {
		System.out.println("UserBean Init....");
	}

}
