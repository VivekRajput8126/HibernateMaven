package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session=HibernateUtil.getSessionfactory().openSession();
			transaction=session.beginTransaction();
			Customer cust=new Customer("vivek","vivek@12",2344);
			OldCustomer ocust = new OldCustomer("rajput","rajput@12",234,"vivek","vivek@1");
			CurrentCustomer cccust = new CurrentCustomer("chauhan","chauhan@33",324,"vivek","vivek@123");
			session.save(cust);
			session.save(ocust);
			session.save(cccust);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
