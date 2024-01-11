package com.jtcindia.Hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class update {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			Student stud=session.load(Student.class, 1);
			//Set<String> courses=new HashSet<String>();
			
			Set<String> courses=stud.getCourses();
			courses.add(".Net");
			courses.add("Crypto Currency");
			courses.add("Python");
			stud.setCourses(courses);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
