package com.everis.exceptions;

public class PersonNotFoundException extends RuntimeException{
	public PersonNotFoundException(Long id) {
		    super("Could not find Person with ID number: " + id);
		  }

}
