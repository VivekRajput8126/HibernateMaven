package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Bidirectional {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session =HibernateUtil.getSessionfactory().openSession();
			transaction = session.beginTransaction();
			Customer cust = new Customer("Shakib","Shakib@123","Muzaffarnagar",345);
			Address add = new Address("Beta-1","5th","D","D-23",cust);
			session.save(cust);
			session.save(add);
			transaction.commit();
			session.close();
			
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
