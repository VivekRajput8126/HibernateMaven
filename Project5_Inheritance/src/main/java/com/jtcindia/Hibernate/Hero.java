package com.jtcindia.Hibernate;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "HeroCustomer")
@PrimaryKeyJoinColumn(name = "cid")
public class Hero extends Customer {
	@ElementCollection
	@CollectionTable(name = "Hero_BikeName", joinColumns = @JoinColumn(name = "hid"))
	@Column(name = "BikeName")
	private Set<String> bike;
	public Hero() {}
	public Hero(String cname, String com_name, int phone, String email, String city, Set<String> bike) {
		super(cname, com_name, phone, email, city);
		this.bike = bike;
	}

	public Set<String> getBike() {
		return bike;
	}

	public void setBike(Set<String> bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Honda [  bike=" + bike + "]";
	}
}
