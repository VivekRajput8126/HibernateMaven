package com.jtcindia.Hibernate;
import javax.persistence.*;

@Entity
@DiscriminatorValue(value="old_cust")
public class OldCustomer extends Customer {
	private String ocname;
	private String ocemail;
	private int ocphone;
	public OldCustomer() {}
	public OldCustomer(String cname,String email,String ocname,String ocemail,int ocphone) {
		super(cname,email);
		this.ocname=ocname;
		this.ocemail=ocemail;
		this.ocphone=ocphone;
	}
	public String getOcname() {
		return ocname;
	}
	public void setOcname(String ocname) {
		this.ocname = ocname;
	}
	public String getOcemail() {
		return ocemail;
	}
	public void setOcemail(String ocemail) {
		this.ocemail = ocemail;
	}
	public int getOcphone() {
		return ocphone;
	}
	public void setOcphone(int ocphone) {
		this.ocphone = ocphone;
	}
	@Override
	public String toString() {
		return "OldCustomer [ocname=" + ocname + ", ocemail=" + ocemail + ", ocphone=" + ocphone + "]";
	}
}
