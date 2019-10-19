package com.globomatics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.globomatics.model.Student;
import com.globomatics.repository.StudentRepository;

import lombok.Getter;
import lombok.Setter;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentRestService {
	@Autowired
	@Getter
	@Setter
	private StudentRepository studentRepository;
	
	@RequestMapping(value="/saveStudent", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student s) {
		return studentRepository.save(s);
	}
	
	@RequestMapping(value="/Students", method = RequestMethod.GET)
	public List<Student> StudentsList() {
		return studentRepository.findAll();
	}
	
	@RequestMapping(value="/deleteStudent/{idStudent}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable String idStudent) {
		long num = Long.parseLong(idStudent);
		studentRepository.deleteById(num);	
	}

}
