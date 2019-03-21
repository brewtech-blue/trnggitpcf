package com.sj.pcf.accountdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sjaccount")
public class Account {

	@Id
	@GeneratedValue
	private Long id;
	private String fname,lname;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
	
	
}
