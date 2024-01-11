package com.jtcindia.Hibernate;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Customer_Network")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private int cid;
	@Column(name = "cname", nullable = false)
	private String cname;
	@Column(name = "city", nullable = false)
	private String city;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "contact_no", nullable = false)
	private int contact_no;
	@ElementCollection
	@JoinTable(name = "MyNetwork", joinColumns = {
			@JoinColumn(name = "network_id")/*
											 * ,
											 * 
											 * @JoinColumn(name="network_name"),@JoinColumn(name="mycity")
											 */})
	@Column(name="network")
	Set<Network> newtwork;
	public Customer(String cname, String city, String email, int contact_no, Set<Network> newtwork) {
		this.cname = cname;
		this.city = city;
		this.email = email;
		this.contact_no = contact_no;
		this.newtwork = newtwork;
	}
	
	public Set<Network> getNewtwork() {
		return newtwork;
	}

	public void setNewtwork(Set<Network> newtwork) {
		this.newtwork = newtwork;
	}

	public Customer(String cname, String city, String email, int contact_no) {
		this.cname = cname;
		this.city = city;
		this.email = email;
		this.contact_no = contact_no;
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

	public int getContact_no() {
		return contact_no;
	}

	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + ", email=" + email + ", contact_no="
				+ contact_no + ", newtwork=" + newtwork + "]";
	}

	
}
