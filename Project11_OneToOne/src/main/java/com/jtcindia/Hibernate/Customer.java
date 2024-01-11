package com.jtcindia.Hibernate;

import javax.persistence.*;
@Entity
@Table(name="customer")
public class Customer {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sanme;
	private String city;
	private String email;
	private int phone;
	@OneToOne
	@JoinColumn(name="aid")
	private Address address;
	public Customer() {}
	public Customer(String sanme,String city,String email,int phone) {
		this.sanme=sanme;
		this.city=city;
		this.email=email;
		this.phone=phone;
	}
	public Customer(String sname,String city,String email,int phone,Address address) {
		this.sanme=sname;
		this.city=city;
		this.email=email;
		this.phone=phone;
		this.address=address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSanme() {
		return sanme;
	}
	public void setSanme(String sanme) {
		this.sanme = sanme;
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [sid=" + sid + ", sanme=" + sanme + ", city=" + city + ", email=" + email + ", phone=" + phone
				+ ",Address= "+ address +"]";
	}
}
