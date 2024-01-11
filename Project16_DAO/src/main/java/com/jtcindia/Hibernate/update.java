package com.jtcindia.Hibernate;

public class update {
	public static void main(String[] args) {
		DAOFactory daofactory= new DAOImp();
		Customer customer = new Customer("Rahul","rahul13@gmail.com","8923543234","Gorakhpur");
		daofactory.updatecustomer(customer, 5);
	}
}
