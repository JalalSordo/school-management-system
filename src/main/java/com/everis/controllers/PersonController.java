package com.everis.controllers;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

Person savePerson(@RequestParam String firstName,@RequestParam String lastName,@RequestParam Date dateOfBirth
			,@RequestParam String city,@RequestParam String country	)  {
		
		Person p=new Person(counter.incrementAndGet(),firstName,lastName,dateOfBirth,city,country);
		
		return personService.savePerson(p);
	}

@PutMapping
@ResponseBody
Person updatePerson(Person p) {
	
	return personService.updatePerson(p);
}

@DeleteMapping
void deletePerson(Person p) {
	personService.deletePerson(p);
}

}

	

