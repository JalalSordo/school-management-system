package com.everis.beans;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Course implements Serializable{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	Long CourseId;
	String CourseName;
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher courseTeacher;
	public Course() {}
	
	 @ManyToMany(mappedBy = "TakenCourses")
	 Set<Student> students;
	 
	 @OneToMany(mappedBy = "course")
	 Set<CourseRegistration> registrations;
	
	public Long getTeacher_id(){
        return courseTeacher.getId();
    }
	
	public String getTeacherName(){
        return courseTeacher.getFirstName() + " " + courseTeacher.getLastName();
    }
	
	@JsonIgnore
    public Teacher getTeacher() {
        return courseTeacher;
    }

    @JsonIgnore
    public void setTeacher(Teacher teacher) {
        this.courseTeacher = teacher;
    }
	
}
