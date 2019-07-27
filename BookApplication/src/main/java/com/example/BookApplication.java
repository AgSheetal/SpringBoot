package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.bean.BookBean;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@ComponentScan({"com.example.controller","com.example.service","com.example.bootStrap","com.example.config"})
@EntityScan("com.example.bean")
@EnableJpaRepositories("com.example.repository")
public class BookApplication{

	public List<BookBean> bookDetails = new ArrayList<BookBean>();

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}
	/*@Bean
	public CommandLineRunner addBooksDetails(BookRepository repository) {
		return (args)->{
			repository.save(new BookBean("Java-A beginners Guide","Herbert SchildtC"));
			repository.save(new BookBean("Angular2 CookBook","Matt Frisbie"));
			for(BookBean books:repository.findAll()) {
				System.out.println(books.toString());
				bookDetails.add(books);
			}
		};
	}*/
}