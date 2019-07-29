package com.everis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beans.Person;
import com.everis.repository.PersonRepository;

import lombok.Getter;
import lombok.Setter;
@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	@Getter
	@Setter
	private PersonRepository repository;
	
	@Override
	public Person savePerson(Person p) {
		return repository.save(p);
	}

	@Override
	public Person updatePerson(Person p) {
		return repository.save(p);
	}

	@Override
	public void deletePerson(Person p) {
		repository.delete(p);

	}

	@Override
	public Optional<Person> getPersonById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Person> getAllPersons() {
		return repository.findAll();
	}

}
