package com.jtcindia.Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "CurrentCustomer", schema = "Record")
public class CurrentCustomer extends Customer{
	
	 @Column(name="ccname")
	private String ccname;
	@Column(name = "ccemail", nullable = false, unique = true)
	private String ccemail;
	public CurrentCustomer() {}
	public CurrentCustomer(String cname,String email,int phone,String ccname, String ccemail) {
		super(cname,email,phone);
		this.ccname = ccname;
		this.ccemail = ccemail;
	}

	public String getCcname() {
		return ccname;
	}

	public void setCcname(String ccname) {
		this.ccname = ccname;
	}

	public String getCcemail() {
		return ccemail;
	}

	public void setCcemail(String ccemail) {
		this.ccemail = ccemail;
	}

	@Override
	public String toString() {
		return "CurrentCustomer [ccname=" + ccname + ", ccemail=" + ccemail + "]";
	}

}
