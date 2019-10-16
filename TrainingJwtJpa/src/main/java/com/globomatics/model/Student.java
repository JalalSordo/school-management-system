package com.globomatics.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student implements Serializable {
	@Id
	@GeneratedValue
	private Long idStudent;
	
	private String lastName;
	
	private String firstName;
	
	private LocalDate DateOfBirth;

	public Student(String nom, String prenom, LocalDate dateOfBirth) {
		super();
		this.lastName = nom;
		this.firstName = prenom;
		DateOfBirth = dateOfBirth;
	}
	
	public Student() {
		
	}
	

}
