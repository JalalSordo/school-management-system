package com.everis.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beans.Course;
import com.everis.beans.Teacher;
import com.everis.service.CourseService;
import com.everis.service.TeacherService;

@RestController
public class TeacherCourseController {
	
	@Autowired
	TeacherService teacherService;
	
	
	@Autowired
    CourseService courseService;
	
	@GetMapping("/teachers")
	List<Teacher> all() {
	  return teacherService.getAllTeachers();
	}
	
	@RequestMapping(value = "/teacher", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	Teacher newTeacher(@RequestBody Teacher newTeacher) {
	  return teacherService.saveTeacher(newTeacher);
	}
	
	@RequestMapping(value = "/getAllCourses", method = RequestMethod.GET)
	public List<Course> getCourses() {
		return courseService.getAllCourses();
	}
	
	
	@RequestMapping(value = "/{teacherId}/course", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Course createCourse(@PathVariable(value = "teacherId") Long teacherId, @RequestBody Course course) {
        return courseService.createCourse(teacherId, course);
    }
	
	@RequestMapping(value = "/course/{courseId}", method = RequestMethod.GET)
    public Optional<Course> getCourseById(@PathVariable(value = "courseId") Long courseId) {
        return courseService.getCourseById(courseId);
    }
}
