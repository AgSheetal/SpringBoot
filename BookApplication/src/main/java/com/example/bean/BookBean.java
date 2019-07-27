package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BookBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;
	String author;
	
	@OneToOne(mappedBy="book")
	private StudentBean student;

	
	public BookBean() {
		super();
	}
	public BookBean( String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	/*public StudentBean getStudent() {
		return student;
	}
	public void setStudent(StudentBean student) {
		this.student = student;
	}*/
	@Override
	public String toString() {
		return String.format("Book [id=%s, name=%s, author=%s]", id, name, author);
	}

}
