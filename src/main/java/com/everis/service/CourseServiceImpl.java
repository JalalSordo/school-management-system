package com.everis.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beans.Course;
import com.everis.beans.Teacher;
import com.everis.exceptions.CourseNotFoundException;
import com.everis.exceptions.PersonNotFoundException;
import com.everis.repository.CourseRepository;
import com.everis.repository.TeacherRepository;

import lombok.Getter;
import lombok.Setter;
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	@Getter
	@Setter
	private CourseRepository repository;
	
	@Autowired
	private TeacherRepository teacherRep;
	

	@Override
	public Course updateCourse(Course c) {
		return repository.save(c);
	}

	@Override
	public void deleteCourseById(Long id) throws CourseNotFoundException {
		repository.deleteById(id);

	}

	@Override
	public Optional<Course> getCourseById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Course> getAllCourses() {
		return repository.findAll();
	}
	
	public Course createCourse(Long teacherId, Course course) {
        Set<Course> courses = new HashSet<>();
        Teacher teacher1 = new Teacher();

        Optional<Teacher> byId = teacherRep.findById(teacherId);
        if (!byId.isPresent()) {
            throw new PersonNotFoundException(teacherId);
        }
        Teacher teacher = byId.get();

        //tie teacher to Course
        course.setCourseTeacher(teacher);

        Course course1 = repository.save(course);
        //tie Course to teacher
        courses.add(course1);
        teacher1.setCourses(courses);

        return course1;

    }

}
