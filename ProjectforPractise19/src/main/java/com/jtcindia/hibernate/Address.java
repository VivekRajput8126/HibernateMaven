package com.jtcindia.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Address {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="aid")
	private int aid;
	private String state;
	private String city;
	private String street;
	//@OneToMany(mappedBy = "address")
	//private Customer customer;
	public Address(String state,String city,String street) {
		this.state=state;
		this.city=city;
		this.street=street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", street=" + street + "]";
	}
}
