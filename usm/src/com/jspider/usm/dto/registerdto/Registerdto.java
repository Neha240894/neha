package com.jspider.usm.dto.registerdto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "usm_table")
public class Registerdto implements Serializable {

	@Id
	@GenericGenerator(name = "key", strategy = "increment")
	@GeneratedValue(generator = "key")
	@Column(name = "t_id")
	private int id;
	@Column(name = "t_name")
	private String name;
	@Column(name = "t_password")
	private String password;
	@Column(name = "t_email")
	private String email;
	@Column(name = "t_mobile")
	private String mobile;
	@Column(name = "t_city")
	private String city;

	public Registerdto() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	/*@Override
	public String toString() {
		return "Registerdto [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Registerdto [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", mobile="
				+ mobile + ", city=" + city + "]";
	}

}
