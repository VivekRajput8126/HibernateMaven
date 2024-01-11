package com.jtcindia.Hibernate;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "Honda_Customer")
@PrimaryKeyJoinColumn(name = "cid")
public class Honda extends Customer {
	@ElementCollection
	@CollectionTable(name = "Honda_BikeName", joinColumns = @JoinColumn(name = "hid"))
	@Column(name = "BikeName", nullable = false)
	private Set<String> bike;

	public Honda() {
		super();
	}

	public Honda(String cname, String com_name, int phone, String email, String city, Set<String> bike) {
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
		return "Honda [ bike=" + bike + "]";
	}
}
