package com.jtcindia.Hibernate;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Fetch {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Author author = session.load(Author.class, 1);
			System.out.println(author);
			Set<Book> Books=author.getBooks();
			for(Book book:Books) {
				System.out.println(book);
			}
			session.close();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		
		
	}
}
