package com.everis.exceptions;

public class CourseNotFoundException extends RuntimeException {
	public CourseNotFoundException(Long id) {
	    super("Could not find Course with ID number: " + id);
	  }
}
