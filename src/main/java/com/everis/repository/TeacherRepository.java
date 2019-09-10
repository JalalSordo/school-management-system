package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.beans.Person;
import com.everis.beans.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
