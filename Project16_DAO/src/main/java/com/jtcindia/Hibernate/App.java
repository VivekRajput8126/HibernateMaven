package com.jtcindia.Hibernate;
public class App {
	public static void main(String[] args) {
		DAOFactory daofactory = new DAOImp();
		Customer customer = new Customer("shakib","shakib123@gmail.com","8126304667","Muzaffarnagar");
		daofactory.addcustomer(customer);
	}
}
