package com.jtcindia.Hibernate;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="HeroSplender")
public class HeroSplender  extends Hero{
	@Column(name="Bike_Number",nullable = false,unique = true)
	private String Bike_no;
	public HeroSplender() {
		super();
	}
	public HeroSplender(String cname,String com_name,int phone,String email,String city,Set<String>bike,String Bike_no) {
		super(cname,com_name,phone,email,city,bike);
		this.Bike_no=Bike_no;
	}
	public String getBike_no() {
		return Bike_no;
	}
	public void setBike_no(String bike_no) {
		Bike_no = bike_no;
	}
	@Override
	public String toString() {
		return "HeroSplender [ Bike_no=" + Bike_no + "]";
	}
	
	
}
