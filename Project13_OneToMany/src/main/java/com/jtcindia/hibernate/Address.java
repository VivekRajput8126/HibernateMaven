package com.jtcindia.hibernate;
import javax.persistence.*;
@Entity
@Table(name="customer_Address")
public class Address {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String sector;
	private String street_$_block;
	
	public Address() {}
	public Address(String sector, String street_$_block) {
		this.sector = sector;
		this.street_$_block = street_$_block;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getStreet_$_block() {
		return street_$_block;
	}
	public void setStreet_$_block(String street_$_block) {
		this.street_$_block = street_$_block;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", sector=" + sector + ", street_$_block=" + street_$_block + "]";
	}
}
