package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			Student stud = new Student("vivek","Noorpur","vivek@123");
			OldStudent ostud = new OldStudent("rajput","Dhampur","rajput@123","shakib","10th");
			CurrentStudent cstud = new CurrentStudent("Chauhan","chandpur","chauhan@123","rahul","12th");
			session.save(stud);
			session.save(ostud);
			session.save(cstud);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		
		
		
	}
}
