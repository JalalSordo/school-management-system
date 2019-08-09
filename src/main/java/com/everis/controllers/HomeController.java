package com.everis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class HomeController {
	@RequestMapping("/home")
	public String index() {
		return "index";
	}
	
}
