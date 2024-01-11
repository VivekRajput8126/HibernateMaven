package com.jtcindia.Hibernate;

import java.util.*;
import org.hibernate.*;

public class App {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			Set<String> courses = new HashSet<String>();
			courses.add("Java Full Stack");
			courses.add("Core Java");
			courses.add("PHP");
			courses.add("Spring");
			courses.add("Spring Boot");

			Set<String> courses2 = new HashSet<String>();
			courses2.add("PHP");
			courses2.add("Spring");

			Set<String> courses3 = new HashSet<String>();
			courses3.add("Spring Boot");

			Student stud = new Student("Vivek", "Noorpur", "vivek123@gmail.com", courses);
			Student stud2 = new Student("Shakib", "Muzafarnagr", "shakib12@gmail.com", courses2);
			Student stud3 = new Student("Rahul", "Gorakhpur", "rahul@123", courses3);
			session.save(stud);
			session.save(stud2);
			session.save(stud3);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			transaction.rollback();
			e.getCause();
		}
	}
}
