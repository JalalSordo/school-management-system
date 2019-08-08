package com.everis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.everis.beans.Person;



public interface PersonRepository extends JpaRepository<Person, Long>{

@Query(value="SELECT p FROM Person p WHERE p.firstName LIKE :keyword%  or p.lastName LIKE :keyword%")	
List<Person> findUsersByKeyword(@Param("keyword") String keyword);

	
}
