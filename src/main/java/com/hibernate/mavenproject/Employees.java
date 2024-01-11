package com.hibernate.mavenproject;

import javax.persistence.*;

@Entity
@Table(name = "JTCEmployees")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private int eid;
	@Column(name = "ename", nullable = false)
	private String ename;
	@Column(name = "city", nullable = false)
	private String city;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Column(name = "salary", nullable = false)
	private int salary;
	@Column(name = "age", nullable = false)
	private int age;

	public Employees() {
	}

	public Employees(String ename, String city, String email, int salary) {
		this.ename = ename;
		this.city = city;
		this.email = email;
		this.salary = salary;
	}

	public Employees(int eid, String ename, String city, String email, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.email = email;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEname(String ename) {
		this.ename = ename;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", ename=" + ename + ", city=" + city + ", email=" + email + ", salary="
				+ salary + "]";
	}

}
