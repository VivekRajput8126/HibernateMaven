package com.jtcindia.Hibernate;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Books")
public class Book {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private String author_name;
	private int price;
	@ManyToMany(mappedBy = "books")
	private Set<Author> author;
	
	public Book() {}
	
	public Book(int bid, String bname, String author_name, int price, Set<Author> author) {
		this.bid = bid;
		this.bname = bname;
		this.author_name = author_name;
		this.price = price;
		this.author = author;
	}
	
	
	public Book(String bname, String author_name, int price) {
		this.bname = bname;
		this.author_name = author_name;
		this.price = price;
	}

	public Book(String bname, String author_name, int price, Set<Author> author) {
		this.bname = bname;
		this.author_name = author_name;
		this.price = price;
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Set<Author> author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author_name=" + author_name + ", price=" + price
				+ ", author="+ "]";
	}
}
