package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			transaction = session.beginTransaction();
			
			Address add = new Address("Alpha-1","8th");
			Student stud = new Student("vivek","vivek@123",add);
			session.save(add);
			session.save(stud);
			transaction.commit();
			session.close();
			
			
			
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		
	}
}
