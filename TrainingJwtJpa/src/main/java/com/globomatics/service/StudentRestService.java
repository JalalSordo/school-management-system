package com.globomatics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.globomatics.model.Student;
import com.globomatics.repository.StudentRepository;

@RestController
public class StudentRestService {
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping(value="/saveStudent", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student s) {
		return studentRepository.save(s);
	}
	
	@RequestMapping(value="/Students", method = RequestMethod.GET)
	public List<Student> StudentsList() {
		return studentRepository.findAll();
	}

}
