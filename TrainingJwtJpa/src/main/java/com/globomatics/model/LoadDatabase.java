package com.globomatics.model;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.globomatics.repository.UserDao;




@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(UserDao repository) {
	  
	  //Client c=new Client ("M12","Chaybat Bris","Z125528",LocalDate.of(1999,5,31),"178m²",2670l);
//	  Collection<Role> roles= new ArrayList<Role>();
//	  Role r=new Role("STUDENT","std");
//	  roles.add(r);
//	  DAOUser user= new DAOUser("simo","password",roles);
//	  repository.save(user);
	 
	
    return args -> {
    	
      
      //log.info("Preloading " + repository.save(c));
      
    };
  }
}