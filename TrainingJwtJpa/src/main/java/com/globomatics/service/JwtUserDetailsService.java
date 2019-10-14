package com.globomatics.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.globomatics.model.DAOUser;
import com.globomatics.model.UserDTO;
import com.globomatics.repository.UserDao;



@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		DAOUser user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				this.getAuthorities(user));
	}

	public DAOUser save(UserDTO user) {
		DAOUser newUser = new DAOUser();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userDao.save(newUser);
	}
	
	public Collection<? extends GrantedAuthority> getAuthorities(DAOUser user) {
		// TODO Auto-generated method stub
		
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		
		String userRole = user.getRole();
		if(userRole != null)
		{
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole);
		authorities.add(authority);
		}
		return authorities;
	
	}
}