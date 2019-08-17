package com.everis.beans;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.everis.repository.PersonRepository;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(PersonRepository repository) {
	  
    return args -> {
      log.info("Preloading " + repository.save(new Person("simo", "assila",LocalDate.now(),"rabat","maroc")));
      log.info("Preloading " + repository.save(new Person("anace", "faik",LocalDate.now(),"tanger","maroc")));
      
    };
  }
}