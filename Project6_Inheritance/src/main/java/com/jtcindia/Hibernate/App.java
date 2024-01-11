package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session=HibernateUtil.getSessionfactory().openSession();
			transaction=session.beginTransaction();
			Customer cust = new Customer("vivek","vivek@123");
			OldCustomer oc=new OldCustomer("vivek","vivek@13","shakib","shakib@123",23442);
			CurrentCustomer cc = new CurrentCustomer("vivek","vivek@12","Rahul","rahul@124",2345);
			session.save(cust);
			session.save(oc);
			session.save(cc);
			transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
