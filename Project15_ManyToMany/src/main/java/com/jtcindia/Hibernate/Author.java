
package com.jtcindia.Hibernate;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="Author")
public class Author {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	private String aname;
	private String email;
	private String phone;
	@ManyToMany
	@JoinTable(name = "auth_book", joinColumns = @JoinColumn(name = "aid"), 
	inverseJoinColumns = @JoinColumn(name = "bid"))
	private Set<Book> books;
	
	public Author() {}
	
	public Author(String aname, String email, String phone, Set<Book> books) {
		this.aname = aname;
		this.email = email;
		this.phone = phone;
		this.books = books;
	}
	
	public Author(String aname, String email, String phone) {
		this.aname = aname;
		this.email = email;
		this.phone = phone;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
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
		return "Author [aid=" + aid + ", aname=" + aname + ", email=" + email + ", phone=" + phone + ", books=" 
				+ "]";
	}
}
