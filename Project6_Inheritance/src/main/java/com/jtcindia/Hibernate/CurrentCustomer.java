package com.jtcindia.Hibernate;

import javax.persistence.*;
@Entity
@DiscriminatorValue( value = "Curr_cust")
public class CurrentCustomer extends Customer{
	private String ccname;
	private String cemail;
	private int cphone;
	public CurrentCustomer() {}
	public CurrentCustomer(String cname,String email,String ccname,String cemail,int cphone) {
		super(cname,email);
		this.ccname=ccname;
		this.cemail=cemail;
		this.cphone=cphone;
	}
	public String getCcname() {
		return ccname;
	}
	public void setCcname(String ccname) {
		this.ccname = ccname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public int getCphone() {
		return cphone;
	}
	public void setCphone(int cphone) {
		this.cphone = cphone;
	}
	@Override
	public String toString() {
		return "CurrentCustomer [ccname=" + ccname + ", cemail=" + cemail + ", cphone=" + cphone + "]";
	}
	
}
