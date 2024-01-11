package com.jtcindia.Hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Transaction transaction=null;
		try {
			Session session= HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Author author = new Author("vivek","vivek123@gmail.com","8937423234");
			Author author1 = new Author("Shakib","shakib12@gmail.com","234346");
			Author author2 = new Author("Rahul","rahul34@gmail.com","645435435");
			
			Book book = new Book("Core Java Made Simple","Vivek",1200);
			Book book1 = new Book("The Hidden Hindu","shakib",239);
			Book book2 = new Book("Core Java Made Simple","Rahul",800);
			Book book3 = new Book("The Hidden Hindu","vivek",124);
			
			Set<Book> books= new HashSet();
			books.add(book3);
			books.add(book2);
			
			Set<Book> books1= new HashSet();
			books1.add(book1);
			books1.add(book);
			
			Set<Author>authors =new HashSet();
			authors.add(author2);
			authors.add(author1);
			Set<Author>authors1 = new HashSet();
			authors1.add(author);
			
			author.setBooks(books1);
			author1.setBooks(books);
			author2.setBooks(books1);
			
			book.setAuthor(authors1);
			book1.setAuthor(authors);
			book2.setAuthor(authors1);
			book3.setAuthor(authors1);
			session.save(author1);
			session.save(author);
			session.save(author2);
			session.save(book);
			session.save(book1);
			session.save(book2);
			session.save(book3);
			transaction.commit();
			session.close();
			
			
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}
}
