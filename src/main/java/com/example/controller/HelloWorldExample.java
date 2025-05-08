package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldExample {

	

	    @GetMapping("/message")
	    public String getMessage(){
	        System.out.println("##########################");
	        return "Hello World from psa";
	    }
	}


