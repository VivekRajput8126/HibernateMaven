package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Fetch {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Customer cust=session.load(Customer.class, 1);
			System.out.println(cust);
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
	}
}
