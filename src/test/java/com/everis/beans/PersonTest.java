package com.everis.beans;

import java.time.LocalDate;

import org.junit.Test;

public class PersonTest {
	
	@Test
	public void Create() {
		Person p=new Person("hasan", "zahar",LocalDate.now(),"rabat","maroc");
		System.out.println(p.firstName);
	}
}
