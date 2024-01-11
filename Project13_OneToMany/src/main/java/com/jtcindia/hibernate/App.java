package com.jtcindia.hibernate;

import java.util.*;
import org.hibernate.*;

public class App {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction= session.beginTransaction();
			Customer cust = new Customer("vivek Rajput","vivek123@gmail.com","8126304668");
			Address address = new Address("Alpha-2","4th,D-56");
			Order order = new Order("iphone 13",120000,address,cust);
			Order order1 = new Order("iphone earbrds",12000,address,cust);
			Set<Order> orders = new HashSet();
			orders.add(order);
			orders.add(order1);
			cust.setOrder(orders);
			session.save(cust);
			session.save(address);
			session.save(order);
			session.save(order1);
			transaction.commit();
			session.close();
			
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	
	}
}
