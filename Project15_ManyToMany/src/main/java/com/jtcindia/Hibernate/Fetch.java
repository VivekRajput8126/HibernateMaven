package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Fetch {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Author author = session.load(Author.class,1);
			/*
			 * Author author1 = session.load(Author.class, 2); Author author2 =
			 * session.load(Author.class, 3);
			 * System.out.println(author+"\t"+author1+"\t"+author2);
			 */
			System.out.println(author);
			session.close();
			
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
