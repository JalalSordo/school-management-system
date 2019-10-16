package com.globomatics.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user")
public class DAOUser implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
	@JsonIgnore
	private String password;
	
	@Column
	private String usertype;
	
	@ManyToMany(fetch=FetchType.EAGER)
	Collection<Role> roles;
	
	public DAOUser(String username, String password, boolean actived) {
		super();
		this.username = username;
		this.password = password;
		this.actived = actived;
	}

	private boolean actived;
	
	
	public DAOUser() {
		
	}

	
}