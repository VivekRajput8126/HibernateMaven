package com.jtcindia.Hibernate;

import javax.persistence.*;
@Entity
@Table(name="mycustomers")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="cust")
@DiscriminatorValue(value = "ccust")
public class Customer {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	@Column(name="email",nullable = false,unique = true)
	private String email;
	public Customer() {}
	public Customer(String cname, String email) {
		this.cname = cname;
		this.email = email;
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
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + "]";
	}
}
