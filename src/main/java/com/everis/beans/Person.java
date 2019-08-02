package com.everis.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Person{
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String firstName;
	String lastName;
	Date dateOfBirth;
	String city;
	String country;
	protected Person() {}
	public Person(String firstName, String lastName, Date dateOfBirth, String city, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.country = country;
	}
	
	
}
