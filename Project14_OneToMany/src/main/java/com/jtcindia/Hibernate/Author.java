package com.jtcindia.Hibernate;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="Author")
public class Author {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String author_name;
	private String email;
	private String phone;
	@OneToMany(mappedBy = "author")
	private Set<Book> books;
	public Author() {}
	public Author(String author_name, String email, String phone, Set<Book> books) {
		this.author_name = author_name;
		this.email = email;
		this.phone = phone;
		this.books = books;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", author_name=" + author_name + ", email=" + email + ", phone=" + phone
				+ ", books=" + books + "]";
	}
	
	
}
