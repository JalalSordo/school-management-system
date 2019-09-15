package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.beans.Student;
import com.everis.beans.Teacher;
import com.everis.exceptions.PersonNotFoundException;

public interface StudentService {
	Student saveStudent(Student s);
	Student updateStudent(Student s);
	public void deleteStudentById(Long id) throws PersonNotFoundException;
	Optional<Student> getStudentById(Long id);
	List<Student> getAllStudents();

}
