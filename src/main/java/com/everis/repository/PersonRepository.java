package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.beans.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	

}
