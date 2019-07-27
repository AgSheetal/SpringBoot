package com.example.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class StudentBean {

	@Id
	private int id;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "book_id", referencedColumnName="id")
	private BookBean book;
	public StudentBean() {
	}

	
	public StudentBean(int id, String name, BookBean book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}


	public BookBean getBook() {
		return book;
	}


	public void setBook(BookBean book) {
		this.book = book;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
