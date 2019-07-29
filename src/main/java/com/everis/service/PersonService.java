package com.everis.service;

import java.util.List;
import java.util.Optional;

import com.everis.beans.Person;

public interface PersonService {
	Person savePerson(Person p);
	Person updatePerson(Person p);
	void deletePerson(Person p);
	Optional<Person> getPersonById(Long id);
	List<Person> getAllPersons();
}
