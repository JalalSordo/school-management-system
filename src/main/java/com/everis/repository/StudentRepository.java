package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.beans.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
