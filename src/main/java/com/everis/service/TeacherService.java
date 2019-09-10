package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.beans.Person;
import com.everis.beans.Teacher;
import com.everis.exceptions.PersonNotFoundException;

public interface TeacherService {
	
	Teacher saveTeacher(Teacher t);
	Teacher updateTeacher(Teacher t);
	public void deleteTeacherById(Long id) throws PersonNotFoundException;
	Optional<Teacher> getTeacherById(Long id);
	List<Teacher> getAllTeachers();
}
