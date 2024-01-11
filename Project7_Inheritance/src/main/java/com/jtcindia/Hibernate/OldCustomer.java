package com.jtcindia.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OldCustomer",schema = "Record1")

public class OldCustomer extends Customer{
	/*
	 * @Id@GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="ocid")
	 * private int ocid;
	 */	@Column(name="occname")
	private String occname;
	@Column(name="ocemail",nullable=false,unique=true)
	private String ocemail;
	public OldCustomer() {}
	public OldCustomer(String cname,String email,int phone,String occname,String ocemail) {
		super(cname,email,phone);
		this.occname=occname;
		this.ocemail=ocemail;
	}

	/*
	 * public int getOcid() { return ocid; } public void setOcid(int ocid) {
	 * this.ocid = ocid; }
	 */
	public String getOccname() {
		return occname;
	}
	public void setOccname(String occname) {
		this.occname = occname;
	}
	public String getOcemail() {
		return ocemail;
	}
	public void setOcemail(String ocemail) {
		this.ocemail = ocemail;
	}
	@Override
	public String toString() {
		return "OldCustomer [ occname=" + occname + ", ocemail=" + ocemail + "]";
	}
}
