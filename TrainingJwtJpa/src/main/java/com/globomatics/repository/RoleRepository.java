package com.globomatics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.globomatics.model.DAOUser;
import com.globomatics.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
	
	@Query(value="SELECT c FROM Role c WHERE c.role LIKE :keyword% ")	
	Role findRoleByname(@Param("keyword") String keyword);

}
