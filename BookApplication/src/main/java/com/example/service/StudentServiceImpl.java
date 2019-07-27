package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.StudentBean;
import com.example.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	
 private StudentRepository studentRepository;
	 
	 @Autowired
	 public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public StudentServiceImpl() {
	}
	@Override
	public Iterable<StudentBean> listAllStudent() {
		return studentRepository.findAll();
	}

}
