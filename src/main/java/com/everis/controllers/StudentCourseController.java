package com.everis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beans.Student;
import com.everis.service.CourseService;
import com.everis.service.StudentService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentCourseController {
	
	@Autowired
	StudentService studentService;
		
	@Autowired
    CourseService courseService;
	
	@GetMapping("/students")
	List<Student> all() {
	  return studentService.getAllStudents();
	}
	
	@RequestMapping(value = "/students", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	Student newStudent(@RequestBody Student newStudent) {
	  return studentService.saveStudent(newStudent);
	}

}
