package com.everis.beans;

import lombok.extern.slf4j.Slf4j;

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
	  Date date = new Date(System.currentTimeMillis());
    return args -> {
      log.info("Preloading " + repository.save(new Person("simo", "assila",date,"rabat","maroc")));
      log.info("Preloading " + repository.save(new Person("anace", "faik",date,"tanger","maroc")));
      
    };
  }
}