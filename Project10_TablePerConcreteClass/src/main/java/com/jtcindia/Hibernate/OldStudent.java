package com.jtcindia.Hibernate;

import javax.persistence.*;

@Entity
@Table(name="oldstudent")
public class OldStudent extends Student {
	private String osname;
	private String passingyear;
	public OldStudent() {}
	public OldStudent(String sname,String email,String osname,String passingyear) {
		super(sname,email);
		this.osname=osname;
		this.passingyear=passingyear;
	}
	public String getOsname() {
		return osname;
	}
	public void setOsname(String osname) {
		this.osname = osname;
	}
	public String getPassingyear() {
		return passingyear;
	}
	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}
	@Override
	public String toString() {
		return "OldStudent [osname=" + osname + ", passingyear=" + passingyear + "]";
	}
	
	
	
}
