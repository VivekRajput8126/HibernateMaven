package com.jtcindia.Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "mycustomer")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Column(name = "phone", nullable = false, unique = true)
	private int phone;

	public Customer() {
	}

	public Customer(String cname, String email, int phone) {
		this.cname = cname;
		this.email = email;
		this.phone = phone;
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}
}
