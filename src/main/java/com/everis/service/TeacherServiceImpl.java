package com.everis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.everis.beans.Teacher;
import com.everis.exceptions.PersonNotFoundException;

import com.everis.repository.TeacherRepository;

import lombok.Getter;
import lombok.Setter;
@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	@Getter
	@Setter
	private TeacherRepository repository;
	
	
	@Override
	public Teacher saveTeacher(Teacher t) {
		
		return repository.save(t);
	}

	@Override
	public Teacher updateTeacher(Teacher t) {
		return repository.save(t);
	}

	@Override
	public void deleteTeacherById(Long id) throws PersonNotFoundException {
		
		repository.deleteById(id);
	}

	@Override
	public Optional<Teacher> getTeacherById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return repository.findAll();
	}

}
