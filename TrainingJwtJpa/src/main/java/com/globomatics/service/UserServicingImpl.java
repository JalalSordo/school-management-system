package com.globomatics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globomatics.model.DAOUser;
import com.globomatics.repository.UserDao;


import lombok.Getter;
import lombok.Setter;
@Service
public class UserServicingImpl implements UserServicing {

	@Autowired
	@Getter
	@Setter
	private UserDao repository;
	
	
	@Override
	public DAOUser saveClient(DAOUser t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

}
