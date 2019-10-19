package com.globomatics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.globomatics.model.DAOUser;
import com.globomatics.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	@Query(value="SELECT c FROM Student c WHERE c.lastName LIKE :keyword%")	
	Student findByLastname(@Param("keyword") String keyword);

}
