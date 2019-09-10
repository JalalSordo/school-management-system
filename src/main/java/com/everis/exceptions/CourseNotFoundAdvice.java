package com.everis.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CourseNotFoundAdvice {
	@ResponseBody
	  @ExceptionHandler(CourseNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String employeeNotFoundHandler(CourseNotFoundException ex) {
	    return ex.getMessage();
	  }
}
