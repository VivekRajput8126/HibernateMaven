package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Fetch {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session=HibernateUtil.getSessionfactory().openSession();
			transaction=session.beginTransaction();
			Customer cust=session.load(Customer.class, 1);
			
			System.out.println(cust/* +"/t"+ocust+"/t"+cccust */);
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
	}
}
