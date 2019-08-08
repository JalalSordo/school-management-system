package com.everis.repository;


import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.everis.beans.Person;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PersonRepositoryTest {
	Date date = new Date(System.currentTimeMillis());
	@Autowired
	private PersonRepository personRepository;
//	@Test
//	public void findAll() {
//		List<Person> list=personRepository.findAll();
//		assertThat(list.size(),is(greaterThanOrEqualTo(0)));
//		}
	@Test
	public void retrievetest(){
		personRepository.save(new Person("simo", "assila",date,"rabat","maroc"));
		personRepository.save(new Person("simo", "cc",date,"rabat","maroc"));
		List<Person> p=personRepository.findUsersByKeyword("assi");
		String first=p.get(1).getFirstName();
		System.out.println(first);
		assertEquals("simo", first);
		
	}
}
