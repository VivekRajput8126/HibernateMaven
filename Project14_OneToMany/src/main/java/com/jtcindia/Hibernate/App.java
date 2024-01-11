package com.jtcindia.Hibernate;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction= session.beginTransaction();
			Book book = new Book("The Hidden Hindu","Akshat Gupta",200);
			Book book1 = new Book("The Hidden Hindu 2","Akshat Gupta",180);
			Book book2 = new Book("Kalki","Akshat Gupta",400);
			Set<Book> books = new HashSet();
			books.add(book);
			books.add(book1);
			books.add(book2);
			Author author = new Author("Akshat Gupta","akshatgupta1@gmail.com","8126304668",books);
			book.setAuthor(author);
			book1.setAuthor(author);
			book2.setAuthor(author);
			session.save(book);
			session.save(book1);
			session.save(book2);
			session.save(author);
			transaction.commit();
			session.close();
			
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
