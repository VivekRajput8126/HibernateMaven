package com.jtcindia.Hibernate;

public class Delete {
	public static void main(String[] args) {
		DAOFactory daofactory = new DAOImp();
		daofactory.delete(new Customer(), 4);
		
		
		
	}
}
