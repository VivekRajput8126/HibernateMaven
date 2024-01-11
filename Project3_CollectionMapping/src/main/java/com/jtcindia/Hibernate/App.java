package com.jtcindia.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;

public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			Network net1=new Network("Aritel","Noorupr");
			Network net2 =new Network("Jio","Dhampur");
			Network net3=new Network("BSNL","Dharupur");
			Network net4=new Network("Vodafone","Moradabad");
			
			Set<Network> net=new HashSet();
			net.add(net1);
			net.add(net2);
			
			Set<Network>net0=new HashSet();
			net0.add(net3);
			net0.add(net4);
			
			Customer cust=new Customer("vivek","Noorpur","vivek123@gmail.com",123,net);
			Customer cust1=new Customer("Shakib","moradabad","shakib12@gmail.com",2355,net0); 
			
			session.saveOrUpdate(cust);
			session.saveOrUpdate(cust1);
			transaction.commit();
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		
	}
}
