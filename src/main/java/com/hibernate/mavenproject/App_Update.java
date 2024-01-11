package com.hibernate.mavenproject;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App_Update {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Employees emp = session.load(Employees.class, 1);
			emp.setCity("Gorakhpur");
			emp.setEmail("rahul@gmail.com");
			emp.setEname("Rahul");
			emp.setSalary(1233);
			emp.setAge(21);
			session.save(emp);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			transaction.rollback();
			e.getCause();
		}
	}
}
