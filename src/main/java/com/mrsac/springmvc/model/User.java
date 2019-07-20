package com.mrsac.springmvc.model;

public class User {
	private String username1;
	  private String password;
	  private String firstname;
	  private String lastname;
	  private String email;
	  private String address;
	  private int phone;

	/*
	 * public String getUsername() { return username1; }
	 * //org.springframework.jdbc.core.JdbcTemplate a; public void
	 * setUsername(String username) { this.username1 = username; }
	 */
	  
	  
	public String getPassword() {
		return password;
	}
	public String getUsername1() {
		return username1;
	}
	public void setUsername1(String username1) {
		this.username1 = username1;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	  
	  

}
