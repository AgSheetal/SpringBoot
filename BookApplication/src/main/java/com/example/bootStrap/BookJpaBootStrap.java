package com.example.bootStrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.example.bean.BookBean;
import com.example.bean.StudentBean;
import com.example.repository.BookRepository;
import com.example.repository.StudentRepository;

@Component
public class BookJpaBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private BookRepository bookRepository;

	@Autowired
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	private StudentRepository studentRepository;

	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		loadBooks();
	}

	private void loadBooks() {
		BookBean b1 = new BookBean("Java-A beginners Guide", "Herbert SchildtC");
		BookBean b2 = new BookBean("Angular2 CookBook", "Matt Frisbie");
		StudentBean s1 = new StudentBean(1, "ABCD", b1);
		StudentBean s2 = new StudentBean(2, "XYZ", b2);
		studentRepository.save(s1);
		studentRepository.save(s2);

	}
}
