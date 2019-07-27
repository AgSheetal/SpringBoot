package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.BookBean;
import com.example.bean.StudentBean;
import com.example.repository.BookRepository;

import io.swagger.models.Model;
import com.example.service.BookService;
import com.example.service.IStudentService;

@RestController
@RequestMapping("/books")
public class BooksController {
	
	private BookService bookService;
	@Autowired
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	private IStudentService studentService;
	@Autowired
	public void setStudnetService(IStudentService studentService) {
		this.studentService = studentService;
	}
	
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public Iterable<BookBean> getAllBooks(Model model) {
		Iterable<BookBean> booksDetails = bookService.listAllBooks();
		return booksDetails;
	}
	
	@RequestMapping(value="/studentList", method = RequestMethod.GET)
	public Iterable<StudentBean> getAllStudent(Model model) {
		Iterable<StudentBean> studentDetails = studentService.listAllStudent();
		return studentDetails;
	}
	
	@RequestMapping(value="/show/{id}", method = RequestMethod.GET)
	public BookBean getBookById(@PathVariable Long id, Model model) {
		BookBean book = bookService.getBookById(id);
		return book;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBook(@RequestBody BookBean book){
		bookService.saveBook(book);
		return "Book details has been added";
	}
}