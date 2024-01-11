package com.jtcindia.Hinernate;
import javax.persistence.*;
@Entity
@DiscriminatorValue(value="os")
public class OldStudent extends Student {
	private String osname;
	private String py;
	public OldStudent() {
	}
	public OldStudent(String sname,String email,String osname,String py) {
		super(sname,email);
		this.osname=osname;
		this.py=py;
	}
	public String getOsname() {
		return osname;
	}
	public void setOsname(String osname) {
		this.osname = osname;
	}
	public String getPy() {
		return py;
	}
	public void setPy(String py) {
		this.py = py;
	}
	@Override
	public String toString() {
		return "OldStudent [osname=" + osname + ", py=" + py + "]";
	}
}
