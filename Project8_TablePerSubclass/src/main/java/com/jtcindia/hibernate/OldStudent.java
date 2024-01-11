package com.jtcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name="jtcoldstudent")
@PrimaryKeyJoinColumn(name="sid")
public class OldStudent extends Student{
	@Column(name="ocname",nullable=false)
	private String ocname;
	@Column(name="classs",nullable=false)
	private String classs;
	
	public OldStudent() {}
	public OldStudent(String sname,String city,String email,String ocname,String classs) {
		super(sname,city,email);
		this.ocname=ocname;
		this.classs=classs;
	}
	
	
	public String getOcname() {
		return ocname;
	}
	public void setOcname(String ocname) {
		this.ocname = ocname;
	}
	
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	
	@Override
	public String toString() {
		return "OldStudent [ocname=" + ocname + ", Class=" + classs + "]";
	}
}
