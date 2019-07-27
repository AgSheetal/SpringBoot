package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.bean.StudentBean;

public interface StudentRepository extends CrudRepository<StudentBean, Integer> {

}
