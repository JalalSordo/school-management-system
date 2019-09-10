package com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.beans.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
