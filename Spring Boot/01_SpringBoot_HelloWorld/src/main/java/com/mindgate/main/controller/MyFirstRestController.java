package com.mindgate.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myapi")
public class MyFirstRestController {

	// http://localhost:8081/myapi/greet - PUT
	@RequestMapping(value = "greet", method = RequestMethod.DELETE)
	public String printDeleteMessage() {
		return "Hello World From Spring Boot!! - Delete";
	}

	// http://localhost:8081/myapi/greet - PUT
	@RequestMapping(value = "greet", method = RequestMethod.PUT)
	public String printPutMessage() {
		return "Hello World From Spring Boot!! - Put";
	}

	// http://localhost:8081/myapi/greet - GET
	@RequestMapping(value = "greet", method = RequestMethod.GET)
	public String printMessage() {
		return "Hello World From Spring Boot!!";
	}

	// http://localhost:8081/myapi/greet - POST
	@RequestMapping(value = "greet", method = RequestMethod.POST)
	public String printPostMessage() {
		return "Hello World From Spring Boot - Post";
	}

}
