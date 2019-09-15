package com.everis.beans;

import java.util.Set;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
@Entity
public class Student extends Person {
	public Student() {}
	@ManyToMany
	@JoinTable(
			  name = "course_taken", 
			  joinColumns = @JoinColumn(name = "student_id"), 
			  inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<Course> TakenCourses;
	
	@OneToMany(mappedBy = "student")
    Set<CourseRegistration> registrations;

}
