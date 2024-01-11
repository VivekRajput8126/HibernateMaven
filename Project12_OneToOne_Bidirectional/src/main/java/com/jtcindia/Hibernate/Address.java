package com.jtcindia.Hibernate;

import javax.persistence.*;

@Entity
@Table(name="studentaddress")
public class Address {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String sector;
	private String street;
	@OneToOne(mappedBy = "address",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Student student;
	
	public Address() {}
	
	public Address(String sector, String street) {
		this.sector = sector;
		this.street = street;
	}

	public Address(String sector, String street, Student student) {
		super();
		this.sector = sector;
		this.street = street;
		this.student = student;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", sector=" + sector + ", street=" + street + ", student=" + student + "]";
	}
	
	
	
	
}
