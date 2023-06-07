package com.Zohoapp1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads")
public class Lead {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sno;
	
	@Column(nullable=false,name="username")
	private String username;
	@Column(nullable=false,name="Email",length=60)
	private String email;
	@Column(nullable=false,name="Mobile",length=15)
	private long mobile;
	@Column(nullable=false,name="Pasword")
	private String paswd;
	@Column(nullable=false,name="Gender")
	private String gender;

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPaswd() {
		return paswd;
	}

	public void setPaswd(String paswd) {
		this.paswd = paswd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
