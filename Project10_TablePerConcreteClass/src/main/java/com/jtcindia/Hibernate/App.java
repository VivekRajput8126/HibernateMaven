package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session=HibernateUtil.getSessionfactory().openSession();
			transaction = session.beginTransaction();
			Student stud = new Student("vivek","vivek@123");
			OldStudent ostud = new OldStudent("rajput","rajput123","Shakib","2023");
			CurrentStudent csstud = new CurrentStudent("chauhan","chauhan@12","Rahul","12th");
			session.save(stud);
			session.save(ostud);
			session.save(csstud);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	
	
	}
}
