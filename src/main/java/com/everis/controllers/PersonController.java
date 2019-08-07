package com.everis.controllers;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beans.Person;
import com.everis.exceptions.PersonNotFoundException;
import com.everis.service.PersonService;



@RestController
public class PersonController {
	

	
@Autowired
private PersonService personService;
	
//private static final Logger logger = LoggerFactory.getLogger(PersonController.class);



//Aggregate root


@GetMapping("/persons")
List<Person> all() {
  return personService.getAllPersons();
}


@PostMapping("/persons")
Person newPerson(@RequestBody Person newPerson) {
  return personService.savePerson(newPerson);
}


//Single item
@GetMapping("/persons/{id}")
Person one(@PathVariable Long id) {

  return personService.getPersonById(id).orElseThrow(() -> new PersonNotFoundException(id));
    
}

@PutMapping("/persons/{id}")
Person updatePerson(@RequestBody Person newPerson, @PathVariable Long id) {

    return personService.getPersonById(id).map(person -> {
    	person.setFirstName(newPerson.getFirstName());
    	person.setLastName(newPerson.getLastName());
    	person.setDateOfBirth(newPerson.getDateOfBirth());
    	person.setCity(newPerson.getCity());
    	person.setCountry(newPerson.getCountry());
        return personService.savePerson(person);
    }).orElseGet(() -> {
        newPerson.setId(id);
        return personService.savePerson(newPerson);
    });
}


@DeleteMapping("/persons/{id}")
void deletePerson(@PathVariable Long id) {
	personService.getPersonById(id);
}

}

	

