package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.beans.Course;
import com.everis.exceptions.CourseNotFoundException;


public interface CourseService {
	
	
	Course updateCourse(Course c);
	public void deleteCourseById(Long id) throws CourseNotFoundException;
	Optional<Course> getCourseById(Long id);
	List<Course> getAllCourses();
     Course createCourse(Long teacherId, Course Course);
}
