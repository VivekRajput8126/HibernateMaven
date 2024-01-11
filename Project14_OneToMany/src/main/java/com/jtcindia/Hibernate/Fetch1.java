package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Fetch1 {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Author author = session.load(Author.class,1);
			System.out.println(author);
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		
	}
}
