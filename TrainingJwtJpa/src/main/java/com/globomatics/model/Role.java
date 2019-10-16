package com.globomatics.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Role implements Serializable {
	
	@Id
	private String role;
	private String description;
	
	public Role() {
		
	}
	

}
