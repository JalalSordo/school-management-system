package com.everis.controllers;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beans.Person;
import com.everis.service.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private PersonService personService;
	
	//private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@GetMapping("/CreatePerson")	
	Person savePerson(@RequestParam(value="firstName") String firstName,@RequestParam(value="lastName") String lastName,@RequestParam(value="dateOfBirth") Date dateOfBirth
			,@RequestParam(value="city") String city,@RequestParam(value="country") String country	)  {
		
		Person p=new Person(counter.incrementAndGet(),firstName,lastName,dateOfBirth,city,country);
		
		return personService.savePerson(p);
	}
}

	

