package com.jtcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "jtcstudents", schema = "Record")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private int sid;
	@Column(name = "sname", nullable = false)
	private String sname;
	@Column(name = "city", nullable = false)
	private String city;
	@Column(name = "email", nullable = false)
	private String email;

	public Student() {
	}

	public Student(String sname, String city, String email) {
		this.sname = sname;
		this.city = city;
		this.email = email;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", email=" + email + "]";
	}
}
