package com.everis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.everis.beans.Person;
import com.everis.exceptions.PersonNotFoundException;

public interface PersonService {
	Person savePerson(Person p);
	Person updatePerson(Person p);
	public void deletePersonById(Long id) throws PersonNotFoundException;
	Optional<Person> getPersonById(Long id);
	List<Person> getAllPersons();
}
