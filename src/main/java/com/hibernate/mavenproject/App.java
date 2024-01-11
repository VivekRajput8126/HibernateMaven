package com.hibernate.mavenproject;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Employees emp = new Employees("Vivek", "Noorpur", "vivek@gmail.com", 34);
			session.save(emp);
			transaction.commit();
			
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			e.getCause();

		}
	}
}
