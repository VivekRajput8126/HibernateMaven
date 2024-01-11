package com.jtcindia.Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "customeraddress")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String sector;
	private String street;
	private String block;
	private String plot_no;

	
	@OneToOne(mappedBy = "address",fetch =FetchType.EAGER ,cascade = CascadeType.ALL) 
	private Customer cust;
	 
	public Address() {
	}

	public Address(String sector, String street, String block, String plot_no, Customer cust) {
		this.sector = sector;
		this.street = street;
		this.block = block;
		this.plot_no = plot_no;
		this.cust=cust;
	}

	public Address(String sector, String street, String block, String plot_no) {
		this.sector = sector;
		this.street = street;
		this.block = block;
		this.plot_no = plot_no;
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getPlot_no() {
		return plot_no;
	}

	public void setPlot_no(String plot_no) {
		this.plot_no = plot_no;
	}
	
	
	  public Customer getCust() { return cust; }
	  
	  public void setCust(Customer cust) { this.cust = cust; }
	 
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", sector=" + sector + ", street=" + street + ", block=" + block + ", plot_no="
				+ plot_no + "]";
	}
}
