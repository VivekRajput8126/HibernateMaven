package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;
public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session  session = HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			Address myaddress = new Address("U.P","Noorpur","4th");
			Customer cust = new Customer("Vivek","vivekrajput@gmail.com", 2345);
			cust.setAddress(myaddress);
			session.save(cust);
			transaction.commit();
			session.close();
		
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
	}
}
