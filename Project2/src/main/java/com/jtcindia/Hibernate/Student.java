package com.jtcindia.Hibernate;

import javax.persistence.*;

import java.util.*;

@Entity
@Table(name = "mystudent1")
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
	
	@ElementCollection
	@CollectionTable(name="mycourses",joinColumns = @JoinColumn(name="mysid"))
	@Column(name = "courses")
	private Set<String> courses;
	public Student() {
	}

	public Student(String sname, String city, String email, Set<String> courses) {
		this.sname = sname;
		this.city = city;
		this.email = email;
		this.courses = courses;
	}
	public Set<String> updateCourse(){
		
		return courses;
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

	public Set<String> getCourses() {
		return courses;
	}

	public void setCourses(Set<String> courses) {
		courses.add("");
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", email=" + email + ", courses="
				+ courses + "]";
	}
}
