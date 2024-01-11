package com.jtcindia.Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "MyNetwork")

public class Network {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "network_id")
	private int network_id;
	@Column(name = "network_name")
	private String network_name;
	@Column(name = "mycity")
	private String city;

	public Network(String network_name, String city) {
		this.network_name = network_name;
		this.city = city;
	}

	public int getNetwork_id() {
		return network_id;
	}

	public void setNetwork_id(int network_id) {
		this.network_id = network_id;
	}

	public String getNetwork_name() {
		return network_name;
	}

	public void setNetwork_name(String network_name) {
		this.network_name = network_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Network [network_id=" + network_id + ", network_name=" + network_name + ", city=" + city + "]";
	}

}
