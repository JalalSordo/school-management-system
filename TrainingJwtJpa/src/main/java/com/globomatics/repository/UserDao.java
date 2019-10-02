package com.globomatics.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.globomatics.model.DAOUser;



@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
	@Query(value="SELECT c FROM DAOUser c WHERE c.username LIKE :keyword% ")	
	DAOUser findByUsername(@Param("keyword") String keyword);
}