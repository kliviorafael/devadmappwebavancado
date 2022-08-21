package com.uniesp.aula1.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class HelloWord {
	
	@RequestMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}

}
