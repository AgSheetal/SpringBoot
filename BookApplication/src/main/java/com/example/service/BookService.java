package com.example.service;

import com.example.bean.BookBean;

public interface BookService {
	 
	    Iterable<BookBean> listAllBooks();
	    BookBean getBookById(Long id);
	    BookBean saveBook(BookBean bookBean);
}
