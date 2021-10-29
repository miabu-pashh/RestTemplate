package com.nagarro.RestTemplate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Login model Class
 * Mapping Login credentials to the database
 * 
 * @author maibu
 *
 */
@Entity
@Table(name ="users")
public class LoginForm {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Parameterized Constructor
	public LoginForm(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	//Constructor from super class
	public LoginForm() {
		super();
	}
	
	//toString method
	@Override
	public String toString() {
		return "LoginForm [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
