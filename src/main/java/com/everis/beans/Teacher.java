package com.everis.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Teacher extends Person implements Serializable{
	public Teacher() {}
	
	@OneToMany
	private Set<Course> courses = new HashSet<>();
	
	
	
	public void UploadMaterial() {
		
	}
	
	public void UploadSchedule() {
		
	}
	
	public void UploadGrades() {
		
	}
	
	
	public Teacher(Long id, String firstName, String lastName, LocalDate dateOfBirth, String city, String country,Set<Course> lc) {
		super(id, firstName, lastName, dateOfBirth, city, country);
		this.courses=lc;
	}

	
	
	public Teacher(String firstName, String lastName, LocalDate dateOfBirth, String city, String country,Set<Course> lc) {
		super(firstName, lastName, dateOfBirth, city, country);
		this.courses=lc;
	}
}
