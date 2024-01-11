package com.jtcindia.Hibernate;
import javax.persistence.*;
@Entity
@Table(name="currentstudent")
public class CurrentStudent  extends Student{
	private String csname;
	private String classs;
	
	public CurrentStudent() {}
	public CurrentStudent(String sname,String email,String csname,String classs) {
		super(sname,email);
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
