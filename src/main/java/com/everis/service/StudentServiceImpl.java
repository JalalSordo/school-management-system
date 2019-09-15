package com.everis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beans.Student;
import com.everis.exceptions.PersonNotFoundException;
import com.everis.repository.StudentRepository;
import com.everis.repository.TeacherRepository;

import lombok.Getter;
import lombok.Setter;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	@Getter
	@Setter
	private StudentRepository repository;
	
	
	

	@Override
	public Student saveStudent(Student s) {
		return repository.save(s);
	}

	@Override
	public Student updateStudent(Student s) {
		return repository.save(s);
	}

	@Override
	public void deleteStudentById(Long id) throws PersonNotFoundException {
		repository.deleteById(id);
	}

	@Override
	public Optional<Student> getStudentById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

}
