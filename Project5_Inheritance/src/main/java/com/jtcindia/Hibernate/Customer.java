package com.jtcindia.Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Mycusotmers")
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	@Column(name = "com_name", nullable = false)
	private String com_name;
	@Column(name = "phone", nullable = false)
	private int phone;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Column(name = "city", nullable = false)
	private String city;

	public Customer() {
	}

	public Customer(String cname, String com_name, int phone, String email, String city) {
		this.cname = cname;
		this.com_name = com_name;
		this.phone = phone;
		this.email = email;
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

	public String getCom_name() {
		return com_name;
	}

	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", com_name=" + com_name + ", phone=" + phone + ", email="
				+ email + ", city=" + city + "]";
	}
}
