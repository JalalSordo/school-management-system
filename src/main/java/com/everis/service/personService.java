package com.everis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.dao.personDao;

@Service
public class personService {
	
	@Autowired
	private personDao pd;
	
}
