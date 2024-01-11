package com.jtcindia.Hibernate;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	@Column(name="cname",nullable = false)
	private String cname;
	@Column(name="email",nullable=false,unique = true)
	private String email;
	@Column(name="phone",nullable=false,unique=true)
	private String phone;
	@Column(name="city",nullable=false)
	private String city;

	public Customer() {}
	
	public Customer(String cname, String email, String phone, String city) {
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ "]";
	}
}
