package com.jtcindia.hibernate;

import javax.persistence.*;
@Entity
@Table(name="jtccurrentstudent")
@PrimaryKeyJoinColumn(name="sid")
public class CurrentStudent extends Student{
	@Column(name="csname",nullable=false)
	private String csname;
	@Column(name="classs",nullable=false)
	private String classs;
	public CurrentStudent(String sname,String city,String email,String csname,String classs) {
		super(sname,city,email);
		this.csname=csname;
		this.classs=classs;
	}
	public String getCsname() {
		return csname;
	}
	public void setCsname(String csname) {
		this.csname = csname;
	}
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	@Override
	public String toString() {
		return "CurrentStudent [csname=" + csname + ", classs=" + classs + "]";
	}
}
