package com.jtcindia.hibernate;

import java.util.*; 
import javax.persistence.*;

@Entity
@Table(name="myCustomer")
public class Customer {
	@Id@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cust_add")@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private long ph;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="aid")
	private Address address;

	public Customer() {
	}

	public Customer(String cname,String email,long ph,Address address) {
		this.cname=cname;
		this.email=email;
		this.ph=ph;
		this.address=address;
		
	}
	public Customer(String cname, String email, long ph) {
		this.cname = cname;
		this.email = email;
		this.ph = ph;
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

	public long getPh() {
		return ph;
	}

	public void setPh(long ph) {
		this.ph = ph;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", ph=" + ph + ", address=" + address
				+ "]";
	}

	
}
