package com.jtcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Customer_Order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private String oname;
	private int price;
	@OneToOne
	@JoinColumn(name = "aid")
	private Address address;
	@ManyToOne
	@JoinColumn(name = "cid", referencedColumnName = "cid")
	private Customer customer;
	
	public Order() {
	}

	public Order(String oname, int price, Address address, Customer customer) {
		this.oname = oname;
		this.price = price;
		this.address = address;
		this.customer = customer;
	}

	public Order(String oname, Address address) {
		this.oname = oname;
		this.address = address;
	}

	public Order(String oname, Address address, Customer customer) {
		this.oname = oname;
		this.address = address;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", address=" + address + "]";
	}
}
