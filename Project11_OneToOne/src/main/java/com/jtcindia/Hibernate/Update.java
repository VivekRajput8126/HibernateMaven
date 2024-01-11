package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			transaction = session.beginTransaction();

			Address add = session.load(Address.class, 1);
			add.setSector("Alpha-1");
			add.setStreet("4th");
			add.setBlock("C");
			add.setPlot_no("C-40");

			Customer cust = session.load(Customer.class, 1);
			cust.setSanme("vivek");
			cust.setEmail("vivek@123");
			cust.setCity("Noorupur");
			cust.setPhone(23456);
			cust.setAddress(add);
			session.save(cust);
			session.save(add);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}
}
