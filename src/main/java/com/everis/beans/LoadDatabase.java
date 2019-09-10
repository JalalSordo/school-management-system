package com.everis.beans;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.everis.repository.TeacherRepository;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(TeacherRepository repository) {
	  Course c1=new Course();
	  
	  Teacher t1=new Teacher();
	  c1.setCourseId(1l);
	  c1.setCourseName("math");
	  Course c2=new Course();
	  c2.setCourseId(2l);
	  c2.setCourseName("SI");
	  Set<Course> a = new HashSet<>();
	  //a.add(c1);
	//  a.add(c2);
	 // t1.setCourses(a);
	
	

		
		System.out.println(a);
    return args -> {
    	System.out.println(c1);
    	//new Teacher("anace", "faik",LocalDate.now(),"tanger","maroc",a)
      log.info("Preloading " + repository.save(t1));
      
    };
  }
}