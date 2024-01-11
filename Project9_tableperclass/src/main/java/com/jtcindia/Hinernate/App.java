package com.jtcindia.Hinernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			Student stud = new Student("Vivek","vivek@123");
			OldStudent ostud = new OldStudent("rajput","rajput@12","Shakib","2016");
			CurrentStudent cstud = new CurrentStudent("Chauhan","chauahan@12","rahul","12th B");
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
