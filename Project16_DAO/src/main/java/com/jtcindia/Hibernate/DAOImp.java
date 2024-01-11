package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAOImp implements DAOFactory {

	public void addcustomer(Customer customer) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Customer cust = new Customer(customer.getCname(), customer.getEmail(), customer.getPhone(),customer.getCity());
			session.save(cust);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
	
	public void updatecustomer(Customer customer, int fetch) {

		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Customer cust = session.load(Customer.class, fetch);
			cust.setCity(customer.getCity());
			cust.setCname(customer.getCname());
			cust.setEmail(customer.getEmail());
			cust.setPhone(customer.getPhone());
			session.save(cust);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
	public void delete(Customer customer,int fetch) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			customer=session.load(Customer.class, fetch);
			session.delete(customer);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
