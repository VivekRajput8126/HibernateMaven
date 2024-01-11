package com.jtcindia.hibernate;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String email;
	private String ph;
	@OneToMany(mappedBy = "customer")
	private Set<Order> order;

	public Customer() {
	}
	
	public Customer(String cname, String email, String ph) {
		this.cname = cname;
		this.email = email;
		this.ph = ph;
	}

	public Customer(String cname, String email, String ph, Set<Order> order) {
		this.cname = cname;
		this.email = email;
		this.ph = ph;
		this.order = order;
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

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", ph=" + ph + ", order=" + order
				+ "]";
	}
}
