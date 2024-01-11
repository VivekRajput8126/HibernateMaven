package com.jtcindia.Hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class PersonalInfo {
	private String spiname;
	private String father_name;
	private String Mother_name;
	private String Occupation;
	
	public PersonalInfo() {}

	public PersonalInfo(String sname, String father_name, String mother_name, String occupation) {
		
		this.spiname = sname;
		this.father_name = father_name;
		Mother_name = mother_name;
		Occupation = occupation;
	}

	public String getSname() {
		return spiname;
	}

	public void setSname(String sname) {
		this.spiname = sname;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getMother_name() {
		return Mother_name;
	}

	public void setMother_name(String mother_name) {
		Mother_name = mother_name;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	@Override
	public String toString() {
		return "PersonalInfo [sname=" + spiname + ", father_name=" + father_name + ", Mother_name=" + Mother_name
				+ ", Occupation=" + Occupation + "]";
	}
}
