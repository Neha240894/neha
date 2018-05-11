package com.jspider.usm.dto.logindto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


public class Logindto implements Serializable {

	
	@Column(name = "t_email")
	private String email;
	@Column(name = "t_password")
	private String password;
	

	public Logindto() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Logindto [email=" + email + ", password=" + password + "]";
	}
}