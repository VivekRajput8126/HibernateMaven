package com.jtcindia.Hinernate;
import javax.persistence.*;

@Entity
@Table(name="JtcStudent")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="student")
@DiscriminatorValue(value="stud")
public class Student {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private String email;
	public Student() {}
	public Student(String sname,String email) {
		this.sname=sname;
		this.email=email;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + "]";
	}
	
	
}
