package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // if  creating class we should use annotations for defining this class into spring container
public class ControllerClass {
	
	@Value("${welcome.message}")
	private String welcome;
	
	@GetMapping("/")   //To return a response in the method for request "/"
	public String Main() {
		return welcome;
	}
}
