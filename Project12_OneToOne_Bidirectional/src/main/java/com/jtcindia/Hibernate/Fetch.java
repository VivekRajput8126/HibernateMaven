package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Fetch {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			transaction=session.beginTransaction();
			Student stud = session.load(Student.class, 1);
			System.out.println(stud);
			Address add = session.load(Address.class, 1);
			System.out.println(add);
			session.close();
			
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
