package com.everis.repository;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.everis.beans.Person;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PersonRepositoryTest {
	@Autowired
	private PersonRepository personRepository;
	@Test
	public void findAll() {
		List<Person> list=personRepository.findAll();
		assertThat(list.size(),is(greaterThanOrEqualTo(0)));
		}
}
