package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.BookBean;
import com.example.bean.StudentBean;
import com.example.repository.BookRepository;
import com.example.repository.StudentRepository;

@Service
public class BookServiceImpl implements BookService{
	 private BookRepository bookRepository;
	
	 @Autowired
	 public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Iterable<BookBean> listAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public BookBean getBookById(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public BookBean saveBook(BookBean bookBean) {
		return bookRepository.save(bookBean);
	}
	
}
