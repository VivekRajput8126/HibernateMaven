package com.jtcindia.Hibernate;

public interface DAOFactory {
	
	void addcustomer(Customer customer);
	void updatecustomer(Customer customer,int fetch);
	void delete(Customer customer,int fetch);
	
}
