package com.everis.controllers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.everis.beans.Person;


public class PersonControllerTest {

	//@InjectMocks
	//private PersonController pc;
	
	//@Mock
	//private PersonServiceImpl personService;
	
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void test() {
		System.out.println("ok");
		Person per=new Person();
		per.setId(4l);
		//when(personService.getPersonById(4l)).thenReturn(Optional.of(per));
		assertEquals(4l, per.getId().longValue());
		
	}
	
	@Test
	public void testUpdate() {
		Person p1=new Person();
		p1.setId(5l);
		//pc.updatePerson(p1, 6l);
		assertEquals(6l, p1.getId().longValue());
		System.out.println(p1.getId());
		
	}
	@Test
	public void testDelete() {
		
		//pc.deletePerson(2l);

	}

}
