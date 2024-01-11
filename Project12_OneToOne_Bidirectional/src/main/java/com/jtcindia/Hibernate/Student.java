package com.jtcindia.Hibernate;

import javax.persistence.*;
@Entity
@Table(name="student")
public class Student {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private String email;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="aid")
	private Address address;
	public Student() {
	}
	public Student(String sname, String email) {
		
		this.sname = sname;
		this.email = email;
	}
	
	public Student(String sname, String email, Address address) {
	
		this.sname = sname;
		this.email = email;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + "]";
	}
	
	
	
}
