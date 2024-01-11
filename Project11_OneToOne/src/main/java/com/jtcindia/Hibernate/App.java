package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			transaction=session.beginTransaction();
			Customer cust = new Customer();
			Address add = new Address();
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
