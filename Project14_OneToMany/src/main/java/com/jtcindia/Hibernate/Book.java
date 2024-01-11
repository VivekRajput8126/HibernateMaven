package com.jtcindia.Hibernate;
import javax.persistence.*;

@Entity
@Table(name="Author_Book")
public class Book {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private String authorName;
	private int price;
	@ManyToOne
	@JoinColumn(name="aid")
	private Author author;
	
	public Book() {}

	public Book(String bname, String authorName, int price) {
		this.bname = bname;
		this.authorName = authorName;
		this.price = price;
	}
	
	public Book(String bname, String authorName, int price, Author author) {
		this.bname = bname;
		this.authorName = authorName;
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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", authorName=" + authorName + ", price=" + price + "]";
	}
}
