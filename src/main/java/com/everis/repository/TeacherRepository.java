package com.everis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.everis.beans.Person;
import com.everis.beans.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
	
	@Query(value="SELECT t FROM Teacher t WHERE t.firstName LIKE :keyword% ")	
	List<Teacher> findTeacherByFirstName(@Param("keyword") String keyword);


}
