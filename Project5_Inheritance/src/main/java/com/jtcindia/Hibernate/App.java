package com.jtcindia.Hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionfactory().openSession();
			transaction = session.beginTransaction();
			Customer cust = new Customer("vivek","Hero",8126,"vivek@123","Noorpur");
			Integer it=(Integer)session.save(cust);
			
			Set< String> bike=new HashSet<String>();
			bike.add("splendor");
			bike.add("passion pro");
			Hero hero = new Hero("shakib","Hero",8126,"shakib@123","Muzaffarnagr",bike);
			it=(Integer)session.save(hero);
			
			Set<String > bike1=new HashSet<String>();
			bike1.add("shine");
			bike1.add("cv twister");
			Honda hon = new Honda("Rahul","Honda",8126,"rahul@123","Gorakhpur",bike1);
			it=(Integer)session.save(hon);
			
			Set<String> bike3=new HashSet<String>();
			bike3.add("Apache");
			bike3.add("Sports");
			TVS tvs = new TVS("Govind","TVS",8126,"govind@123","Bihar",bike3);
			it=(Integer)session.save(tvs);
			
			HeroSplender hs = new HeroSplender("arun","Hero",8126,"arun@123","Muzaffarnagr",bike,"Up20ab1345");
			it=(Integer)session.save(hs);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			transaction.rollback();
			e.getCause();
		}
	}
}
