package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.bean.BookBean;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<BookBean,Long>{

}
