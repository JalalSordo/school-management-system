package com.everis.controllers;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beans.Course;
import com.everis.beans.Teacher;
import com.everis.repository.TeacherRepository;
import com.everis.service.CourseService;
import com.everis.service.TeacherService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TeacherCourseController {
	
	@Autowired
	TeacherService teacherService;
	
	@Autowired
	TeacherRepository tp;
	
	
	@Autowired
    CourseService courseService;
	
	@GetMapping("/teachers")
	List<Teacher> all() {
	  return teacherService.getAllTeachers();
	}
	
	//new Teacher
	@RequestMapping(value = "/teacher", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	Teacher newTeacher(@RequestBody Teacher newTeacher) {
	  return teacherService.saveTeacher(newTeacher);
	}
	
	// get Teachers
	@RequestMapping(value = "/getAllCourses", method = RequestMethod.GET)
	public List<Course> getCourses() {
		return courseService.getAllCourses();
	}
	
	// create course for a specific teacher
	@RequestMapping(value = "/{teacherId}/course", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Course createCourse(@PathVariable(value = "teacherId") Long teacherId, @RequestBody Course course) {
        return courseService.createCourse(teacherId, course);
    }
	
	// get course by id 
	@RequestMapping(value = "/course/{courseId}", method = RequestMethod.GET)
    public Optional<Course> getCourseById(@PathVariable(value = "courseId") Long courseId) {
        return courseService.getCourseById(courseId);
    }
	
	// find courses of a teacher by his id
	@RequestMapping(value = "/{teacherId}/courses", method = RequestMethod.GET)
	public Set<Course> findCourses(@PathVariable(value = "teacherId") Long teacherId) {
        return courseService.findCoursesOfTeacher(teacherId);
    }
	
	@GetMapping("/teacher/courses")
	public Set<Course> GetCoursesOfTeacher(@RequestBody Teacher t){
		return courseService.meth(t);
	}
	
	@RequestMapping(value = "/first/{firstName}", method = RequestMethod.GET)
	List<Teacher> byFirstName(@PathVariable String firstName) {

	  return  tp.findTeacherByFirstName(firstName);
	    
	}
	
	
	
}
