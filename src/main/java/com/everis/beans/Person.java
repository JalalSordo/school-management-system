package com.everis.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
public class Person{
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
	String city;
	String country;
	public Person() {}
	public Person(String firstName, String lastName, LocalDate dateOfBirth, String city, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.country = country;
	}
	
	
}
