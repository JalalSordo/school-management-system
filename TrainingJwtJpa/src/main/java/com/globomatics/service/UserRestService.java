package com.globomatics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globomatics.model.DAOUser;
import com.globomatics.model.Role;
import com.globomatics.repository.RoleRepository;
import com.globomatics.repository.UserDao;

@RestController
public class UserRestService {
	@Autowired
	private UserDao userRepo;
	@Autowired
	private RoleRepository roleRepo;
	
	@RequestMapping(value="/addUser", method = RequestMethod.POST)
	public DAOUser saveUser(@RequestBody DAOUser user) {
		return userRepo.save(user);
	}
	
	@RequestMapping(value="/findUsers", method = RequestMethod.GET)
	public List<DAOUser> UsersList() {
		return userRepo.findAll();
	}
	
	@RequestMapping(value="/addRole", method = RequestMethod.POST)
	public Role saveRole(@RequestBody Role r) {
		return roleRepo.save(r);
	}
	
	@RequestMapping(value="/findRoles", method = RequestMethod.GET)
	public List<Role> findRoles() {
		return roleRepo.findAll();
	}
	
	@RequestMapping(value="/addRoleToUser", method = RequestMethod.POST)
	public DAOUser addRoleToUser(String username,String role) {
		DAOUser user = userRepo.findByUsername(username);
		Role r=roleRepo.findRoleByname(role);
		user.getRoles().add(r);
		userRepo.save(user);
		return user;
		
	}
	

}
